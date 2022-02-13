package ca.mcgill.emf.examples.hal.controller;

import ca.mcgill.emf.examples.hal.*;
import ca.mcgill.emf.examples.hal.application.HalApplication;

public class HalController {

	public static void addRoom(String name) {
		HalSystem halSystem = HalApplication.getHalSystem();
		Room room = HalFactory.eINSTANCE.createRoom();
		room.setName(name);
		halSystem.getHome().get(0).getContains().get(0).setName(name);
		HalApplication.save();
	}
}
