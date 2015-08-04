package com.viettel.data.model.entity;

/**
 * @author hieuph
 * @version 1.0
 * @created 31-Jul-2015 3:45:26 PM
 */
public class MockUser {

	private String Email;
	private Long RoleUserId;
	private Long UserId;
	private MockToken m_MockToken;
	public MockProject m_MockProject;
	public MockRoleUser m_MockRoleUser;
	public MockUserShare m_MockUserShare;
	public MockProjectAssign m_MockProjectAssign;
	public MockContract m_MockContract;
	public MockLog m_MockLog;
	public MockRating m_MockRating;
	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Long getRoleUserId() {
		return RoleUserId;
	}

	public void setRoleUserId(Long roleUserId) {
		RoleUserId = roleUserId;
	}

	public Long getUserId() {
		return UserId;
	}

	public void setUserId(Long userId) {
		UserId = userId;
	}

	public MockToken getM_MockToken() {
		return m_MockToken;
	}

	public void setM_MockToken(MockToken m_MockToken) {
		this.m_MockToken = m_MockToken;
	}

	public MockProject getM_MockProject() {
		return m_MockProject;
	}

	public void setM_MockProject(MockProject m_MockProject) {
		this.m_MockProject = m_MockProject;
	}

	public MockRoleUser getM_MockRoleUser() {
		return m_MockRoleUser;
	}

	public void setM_MockRoleUser(MockRoleUser m_MockRoleUser) {
		this.m_MockRoleUser = m_MockRoleUser;
	}

	public MockUserShare getM_MockUserShare() {
		return m_MockUserShare;
	}

	public void setM_MockUserShare(MockUserShare m_MockUserShare) {
		this.m_MockUserShare = m_MockUserShare;
	}

	public MockProjectAssign getM_MockProjectAssign() {
		return m_MockProjectAssign;
	}

	public void setM_MockProjectAssign(MockProjectAssign m_MockProjectAssign) {
		this.m_MockProjectAssign = m_MockProjectAssign;
	}

	public MockContract getM_MockContract() {
		return m_MockContract;
	}

	public void setM_MockContract(MockContract m_MockContract) {
		this.m_MockContract = m_MockContract;
	}

	public MockLog getM_MockLog() {
		return m_MockLog;
	}

	public void setM_MockLog(MockLog m_MockLog) {
		this.m_MockLog = m_MockLog;
	}

	public MockRating getM_MockRating() {
		return m_MockRating;
	}

	public void setM_MockRating(MockRating m_MockRating) {
		this.m_MockRating = m_MockRating;
	}

	public MockProjectFavorite getM_MockProjectFavorite() {
		return m_MockProjectFavorite;
	}

	public void setM_MockProjectFavorite(MockProjectFavorite m_MockProjectFavorite) {
		this.m_MockProjectFavorite = m_MockProjectFavorite;
	}

	public MockComment getM_MockComment() {
		return m_MockComment;
	}

	public void setM_MockComment(MockComment m_MockComment) {
		this.m_MockComment = m_MockComment;
	}

	public MockProjectFavorite m_MockProjectFavorite;
	public MockComment m_MockComment;

	public MockUser(){

	}

	public void finalize() throws Throwable {

	}

}