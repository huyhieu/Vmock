package com.viettel.data.model.entity;

/**
 * @author hieuph
 * @version 1.0
 * @created 31-Jul-2015 3:45:18 PM
 */
public class MockPermissionMenuRela {

	private Long MenuId;
	private Long PermissionId;
	public MockMenu m_MockMenu;

	public MockPermissionMenuRela(){

	}

	public Long getMenuId() {
		return MenuId;
	}

	public void setMenuId(Long menuId) {
		MenuId = menuId;
	}

	public Long getPermissionId() {
		return PermissionId;
	}

	public void setPermissionId(Long permissionId) {
		PermissionId = permissionId;
	}

	public MockMenu getM_MockMenu() {
		return m_MockMenu;
	}

	public void setM_MockMenu(MockMenu m_MockMenu) {
		this.m_MockMenu = m_MockMenu;
	}

	public void finalize() throws Throwable {

	}

}