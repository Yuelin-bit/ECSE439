package ca.mcgill.emf.examples.hal.dto;

import java.util.List;

public class TORoom {

	String name;
	public String getName() {
		return name;
	}


	List<String> deviceNames;
	
	public TORoom() {
		
	}
	

	public TORoom(String name, List<String> deviceNames) {
		this.name = name;
		this.deviceNames = deviceNames;
	}
}
