package com.viettel.data.model.entity;

/**
 * @author hieuph
 * @version 1.0
 * @created 31-Jul-2015 3:45:27 PM
 */
public class MockUserShare {

	private Long RoleId;
	private Long UserIdInvite;
	private Long UserIdReceiver;
	private Long UserIdSuperInvite;
	public MockRoleShare m_MockRoleShare;

	public MockUserShare(){

	}

	public void finalize() throws Throwable {

	}

	public Long getRoleId() {
		return RoleId;
	}

	public void setRoleId(Long roleId) {
		RoleId = roleId;
	}

	public Long getUserIdInvite() {
		return UserIdInvite;
	}

	public void setUserIdInvite(Long userIdInvite) {
		UserIdInvite = userIdInvite;
	}

	public Long getUserIdReceiver() {
		return UserIdReceiver;
	}

	public void setUserIdReceiver(Long userIdReceiver) {
		UserIdReceiver = userIdReceiver;
	}

	public Long getUserIdSuperInvite() {
		return UserIdSuperInvite;
	}

	public void setUserIdSuperInvite(Long userIdSuperInvite) {
		UserIdSuperInvite = userIdSuperInvite;
	}

	public MockRoleShare getM_MockRoleShare() {
		return m_MockRoleShare;
	}

	public void setM_MockRoleShare(MockRoleShare m_MockRoleShare) {
		this.m_MockRoleShare = m_MockRoleShare;
	}

}