package com.viettel.data.model.entity;

/**
 * @author hieuph
 * @version 1.0
 * @created 31-Jul-2015 3:45:17 PM
 */
public class MockMenu {

	private String MenuIcon;
	private Long MenuId;
	private String NameMenu;
	private String NameMenuVi;
	private Long ParentMenu;
	private Long Position;
	public String getMenuIcon() {
		return MenuIcon;
	}

	public void setMenuIcon(String menuIcon) {
		MenuIcon = menuIcon;
	}

	public Long getMenuId() {
		return MenuId;
	}

	public void setMenuId(Long menuId) {
		MenuId = menuId;
	}

	public String getNameMenu() {
		return NameMenu;
	}

	public void setNameMenu(String nameMenu) {
		NameMenu = nameMenu;
	}

	public String getNameMenuVi() {
		return NameMenuVi;
	}

	public void setNameMenuVi(String nameMenuVi) {
		NameMenuVi = nameMenuVi;
	}

	public Long getParentMenu() {
		return ParentMenu;
	}

	public void setParentMenu(Long parentMenu) {
		ParentMenu = parentMenu;
	}

	public Long getPosition() {
		return Position;
	}

	public void setPosition(Long position) {
		Position = position;
	}

	public Long getTypeMenu() {
		return TypeMenu;
	}

	public void setTypeMenu(Long typeMenu) {
		TypeMenu = typeMenu;
	}

	private Long TypeMenu;

	public MockMenu(){

	}

	public void finalize() throws Throwable {

	}

}