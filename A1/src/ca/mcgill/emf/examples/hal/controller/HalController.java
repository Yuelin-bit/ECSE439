package ca.mcgill.emf.examples.hal.controller;

import java.util.ArrayList;
import java.util.List;

import ca.mcgill.emf.examples.hal.*;
import ca.mcgill.emf.examples.hal.application.HalApplication;
import ca.mcgill.emf.examples.hal.dto.TORoom;

public class HalController {

	public static String addRoom(String name) {
		if(existsRoom(name)) {
			return "Room with name " + name + " already exists";
		}
		HalSystem halSystem = HalApplication.getHalSystem();
		Room room = HalFactory.eINSTANCE.createRoom();
		room.setName(name);
		halSystem.getHome().getRooms().add(room);
		HalApplication.save();
		return null;
	}
	
	public static String addDevice(String roomName, String deviceName, String type) {

		if(existsDevice(deviceName)) {
			return "Device with name " + deviceName + " already exists";
		}
		HalSystem halSystem = HalApplication.getHalSystem();
		Device device = null;
		if(type.equals("sensor")) {
			device = HalFactory.eINSTANCE.createSensor();
		}
		else {
			device = HalFactory.eINSTANCE.createActuator();
		}
		device.setName(deviceName);
		Room room = findRoom(roomName);
		room.getDevice().add(device);
		halSystem.getDevice().add(device);
		HalApplication.save();
		return null;
	}
	
	private static boolean existsDevice(String deviceName) {
		return findDevice(deviceName) != null;
	}

	private static boolean existsRoom(String name) {
		return findRoom(name) != null;
	}

	public static TORoom getRoom(String name) {
		TORoom result = null;
		Room r = findRoom(name);
		if(r != null) {
			List<String> deviceNames = new ArrayList<String>();
			for(Device device : r.getDevice()) {
				deviceNames.add(device.getName());
			}
			result = new TORoom(name, deviceNames);
		}
		return result;
	}
	
	public static void deleteRoom(String name) {
		Room r = findRoom(name);
		if (r != null) {
			HalSystem halSystem = HalApplication.getHalSystem();
			Home home = halSystem.getHome();
			home.getRooms().remove(r);
		}
	}
	
	private static Room findRoom(String name) {
		HalSystem halSystem = HalApplication.getHalSystem();
		Home home = halSystem.getHome();
		for(Room r : home.getRooms()) {
			if(r.getName().equals(name)) {
				return r;
			}
		}
		return null;
	}
	
	private static Device findDevice(String deviceName) {
		HalSystem halSystem = HalApplication.getHalSystem();
		for(Device d : halSystem.getDevice()) {
			if(d.getName().equals(deviceName)) {
				return d;
			}
		}
		return null;
	}
	
	public static List<String> getRooms(){
		ArrayList<String> result = new ArrayList<String>();
		HalSystem halSystem = HalApplication.getHalSystem();
		Home home = halSystem.getHome();
		for(Room r : home.getRooms()) {
			result.add(r.getName());
		}
		return result;
	}


}
