package com.viettel.data.model.entity;

/**
 * @author hieuph
 * @version 1.0
 * @created 31-Jul-2015 3:45:23 PM
 */
public class MockRoleShare {

	private String Decription;
	private String DecriptionVi;
	private Long RoleId;
	public MockRolePermissionRela m_MockRolePermissionRela;

	public MockRoleShare(){

	}

	public String getDecription() {
		return Decription;
	}

	public void setDecription(String decription) {
		Decription = decription;
	}

	public String getDecriptionVi() {
		return DecriptionVi;
	}

	public void setDecriptionVi(String decriptionVi) {
		DecriptionVi = decriptionVi;
	}

	public Long getRoleId() {
		return RoleId;
	}

	public void setRoleId(Long roleId) {
		RoleId = roleId;
	}

	public MockRolePermissionRela getM_MockRolePermissionRela() {
		return m_MockRolePermissionRela;
	}

	public void setM_MockRolePermissionRela(MockRolePermissionRela m_MockRolePermissionRela) {
		this.m_MockRolePermissionRela = m_MockRolePermissionRela;
	}

	public void finalize() throws Throwable {

	}

}