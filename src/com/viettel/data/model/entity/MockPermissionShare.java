package com.viettel.data.model.entity;

/**
 * @author hieuph
 * @version 1.0
 * @created 31-Jul-2015 3:45:19 PM
 */
public class MockPermissionShare {

	private Long PermissionId;
	public MockPermissionMenuRela m_MockPermissionMenuRela;

	public MockPermissionShare(){

	}

	public void finalize() throws Throwable {

	}

	public Long getPermissionId() {
		return PermissionId;
	}

	public void setPermissionId(Long permissionId) {
		PermissionId = permissionId;
	}

	public MockPermissionMenuRela getM_MockPermissionMenuRela() {
		return m_MockPermissionMenuRela;
	}

	public void setM_MockPermissionMenuRela(MockPermissionMenuRela m_MockPermissionMenuRela) {
		this.m_MockPermissionMenuRela = m_MockPermissionMenuRela;
	}

}