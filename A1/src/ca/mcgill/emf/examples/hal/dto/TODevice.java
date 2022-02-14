package ca.mcgill.emf.examples.hal.dto;

public class TODevice {
	


	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSpecificType() {
		return specificType;
	}
	public void setSpecificType(String specificType) {
		this.specificType = specificType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TODevice(String name, String type, String specificType) {
		super();
		this.type = type;
		this.specificType = specificType;
		this.name = name;
	}
	private String type;
	private String specificType;
	private String name;
	



}
