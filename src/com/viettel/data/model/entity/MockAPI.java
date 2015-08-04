package com.viettel.data.model.entity;

/**
 * @author hieuph
 * @version 1.0
 * @created 31-Jul-2015 3:45:09 PM
 */
public class MockAPI {

	private Long ApiId;
	private String ApiName;
	private Long ProjectId;
	private String Url;
	public MockInputOutput m_MockInputOutput;
	public MockComment m_MockComment;

	public MockAPI(){

	}

	public void finalize() throws Throwable {

	}

	public Long getApiId() {
		return ApiId;
	}

	public void setApiId(Long apiId) {
		ApiId = apiId;
	}

	public String getApiName() {
		return ApiName;
	}

	public void setApiName(String apiName) {
		ApiName = apiName;
	}

	public Long getProjectId() {
		return ProjectId;
	}

	public void setProjectId(Long projectId) {
		ProjectId = projectId;
	}

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}

	public MockInputOutput getM_MockInputOutput() {
		return m_MockInputOutput;
	}

	public void setM_MockInputOutput(MockInputOutput m_MockInputOutput) {
		this.m_MockInputOutput = m_MockInputOutput;
	}

	public MockComment getM_MockComment() {
		return m_MockComment;
	}

	public void setM_MockComment(MockComment m_MockComment) {
		this.m_MockComment = m_MockComment;
	}
	
	

}