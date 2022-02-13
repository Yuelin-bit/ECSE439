package ca.mcgill.emf.examples.hal.controller;

import java.util.ArrayList;
import java.util.List;

import ca.mcgill.emf.examples.hal.*;
import ca.mcgill.emf.examples.hal.application.HalApplication;
import ca.mcgill.emf.examples.hal.dto.TORoom;

public class HalController {

	public static void addRoom(String name) {
		HalSystem halSystem = HalApplication.getHalSystem();
		Room room = HalFactory.eINSTANCE.createRoom();
		room.setName(name);
		halSystem.getHome().getRooms().add(room);
		HalApplication.save();
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
