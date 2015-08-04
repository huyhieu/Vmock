package com.viettel.data.model.entity;

/**
 * @author hieuph
 * @version 1.0
 * @created 31-Jul-2015 3:45:20 PM
 */
public class MockProject {

	private Long ProjectID;
	private Long UserCreateID;
	public MockProjectAssign m_MockProjectAssign;
	public MockAPI m_MockAPI;

	public Long getProjectID() {
		return ProjectID;
	}

	public void setProjectID(Long projectID) {
		ProjectID = projectID;
	}

	public Long getUserCreateID() {
		return UserCreateID;
	}

	public void setUserCreateID(Long userCreateID) {
		UserCreateID = userCreateID;
	}

	public MockProjectAssign getM_MockProjectAssign() {
		return m_MockProjectAssign;
	}

	public void setM_MockProjectAssign(MockProjectAssign m_MockProjectAssign) {
		this.m_MockProjectAssign = m_MockProjectAssign;
	}

	public MockAPI getM_MockAPI() {
		return m_MockAPI;
	}

	public void setM_MockAPI(MockAPI m_MockAPI) {
		this.m_MockAPI = m_MockAPI;
	}

	public MockProject(){

	}

	public void finalize() throws Throwable {

	}

}