package com.viettel.data.model.entity;

/**
 * @author hieuph
 * @version 1.0
 * @created 31-Jul-2015 3:45:26 PM
 */
public class MockTypeIO {

	private String Name;
	private Long TypeIOId;

	public MockTypeIO(){

	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Long getTypeIOId() {
		return TypeIOId;
	}

	public void setTypeIOId(Long typeIOId) {
		TypeIOId = typeIOId;
	}

	public void finalize() throws Throwable {

	}

}