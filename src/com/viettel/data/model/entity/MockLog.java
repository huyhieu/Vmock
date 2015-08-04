package com.viettel.data.model.entity;

import java.sql.Date;

/**
 * @author hieuph
 * @version 1.0
 * @created 31-Jul-2015 3:45:16 PM
 */
public class MockLog {

	public String getContentLog() {
		return ContentLog;
	}

	public void setContentLog(String contentLog) {
		ContentLog = contentLog;
	}

	public Date getDateCreateLog() {
		return DateCreateLog;
	}

	public void setDateCreateLog(Date dateCreateLog) {
		DateCreateLog = dateCreateLog;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Long getProjectId() {
		return ProjectId;
	}

	public void setProjectId(Long projectId) {
		ProjectId = projectId;
	}

	public Long getUserId() {
		return UserId;
	}

	public void setUserId(Long userId) {
		UserId = userId;
	}

	public MockProject getM_MockProject() {
		return m_MockProject;
	}

	public void setM_MockProject(MockProject m_MockProject) {
		this.m_MockProject = m_MockProject;
	}

	private String ContentLog;
	private Date DateCreateLog;
	private Long Id;
	private Long ProjectId;
	private Long UserId;
	public MockProject m_MockProject;

	public MockLog(){

	}

	public void finalize() throws Throwable {

	}

}