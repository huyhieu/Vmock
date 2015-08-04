package com.viettel.data.model.entity;

/**
 * @author hieuph
 * @version 1.0
 * @created 31-Jul-2015 3:45:15 PM
 */
public class MockInputOutput {

	private Long ApiId;
	private String Boby;
	public Long getApiId() {
		return ApiId;
	}

	public void setApiId(Long apiId) {
		ApiId = apiId;
	}

	public String getBoby() {
		return Boby;
	}

	public void setBoby(String boby) {
		Boby = boby;
	}

	public Long getIOId() {
		return IOId;
	}

	public void setIOId(Long iOId) {
		IOId = iOId;
	}

	public Long getMediaTypeId() {
		return MediaTypeId;
	}

	public void setMediaTypeId(Long mediaTypeId) {
		MediaTypeId = mediaTypeId;
	}

	public Long getTypeIOId() {
		return TypeIOId;
	}

	public void setTypeIOId(Long typeIOId) {
		TypeIOId = typeIOId;
	}

	public MockMediaType getM_MockMediaType() {
		return m_MockMediaType;
	}

	public void setM_MockMediaType(MockMediaType m_MockMediaType) {
		this.m_MockMediaType = m_MockMediaType;
	}

	public MockTypeIO getM_MockTypeIO() {
		return m_MockTypeIO;
	}

	public void setM_MockTypeIO(MockTypeIO m_MockTypeIO) {
		this.m_MockTypeIO = m_MockTypeIO;
	}

	private Long IOId;
	private Long MediaTypeId;
	private Long TypeIOId;
	public MockMediaType m_MockMediaType;
	public MockTypeIO m_MockTypeIO;

	public MockInputOutput(){

	}

	public void finalize() throws Throwable {

	}

}