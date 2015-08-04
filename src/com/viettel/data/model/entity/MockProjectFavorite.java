package com.viettel.data.model.entity;

import java.sql.Date;

/**
 * @author hieuph
 * @version 1.0
 * @created 31-Jul-2015 3:45:22 PM
 */
public class MockProjectFavorite {

	private Date DateAddFavorites;
	private Long Id;
	private Long ProjectId;
	private Long UserId;
	public MockProject m_MockProject;

	public MockProjectFavorite(){

	}

	public void finalize() throws Throwable {

	}

	public Date getDateAddFavorites() {
		return DateAddFavorites;
	}

	public void setDateAddFavorites(Date dateAddFavorites) {
		DateAddFavorites = dateAddFavorites;
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

}