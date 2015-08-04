package com.viettel.data.model.entity;

/**
 * @author hieuph
 * @version 1.0
 * @created 31-Jul-2015 3:45:23 PM
 */
public class MockRolePermissionRela {

	private Long PermissionId;
	private Long RoleId;
	public MockPermissionShare m_MockPermissionShare;

	public MockRolePermissionRela(){

	}

	public void finalize() throws Throwable {

	}

	public Long getPermissionId() {
		return PermissionId;
	}

	public void setPermissionId(Long permissionId) {
		PermissionId = permissionId;
	}

	public Long getRoleId() {
		return RoleId;
	}

	public void setRoleId(Long roleId) {
		RoleId = roleId;
	}

	public MockPermissionShare getM_MockPermissionShare() {
		return m_MockPermissionShare;
	}

	public void setM_MockPermissionShare(MockPermissionShare m_MockPermissionShare) {
		this.m_MockPermissionShare = m_MockPermissionShare;
	}

}