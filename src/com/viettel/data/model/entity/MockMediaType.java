package com.viettel.data.model.entity;

/**
 * @author hieuph
 * @version 1.0
 * @created 31-Jul-2015 3:45:17 PM
 */
public class MockMediaType {

	private Long MediaTypeId;
	private String Name;
	private String Value;

	public MockMediaType(){

	}

	public Long getMediaTypeId() {
		return MediaTypeId;
	}

	public void setMediaTypeId(Long mediaTypeId) {
		MediaTypeId = mediaTypeId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getValue() {
		return Value;
	}

	public void setValue(String value) {
		Value = value;
	}

	public void finalize() throws Throwable {

	}

}