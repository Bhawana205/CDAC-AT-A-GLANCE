package com.cdac.dto;


public class SubjectDTO {

	private String name;

	
	public SubjectDTO() {
		super();
	}

	public SubjectDTO(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "SubjectDTO [name=" + name + "]";
	}

}
