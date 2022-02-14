package ca.mcgill.emf.examples.hal.dto;

import java.util.List;

public class TORoom {

	public TORoom(String name, List<TODevice> deviceList) {
		super();
		this.name = name;
		this.deviceList = deviceList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<TODevice> getDeviceList() {
		return deviceList;
	}
	public void setDeviceList(List<TODevice> deviceList) {
		this.deviceList = deviceList;
	}
	String name;
	List<TODevice> deviceList;
	
}

