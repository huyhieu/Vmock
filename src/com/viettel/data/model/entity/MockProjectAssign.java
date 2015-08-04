package com.viettel.data.model.entity;

import java.sql.Date;

/**
 * @author hieuph
 * @version 1.0
 * @created 31-Jul-2015 3:45:21 PM
 */
public class MockProjectAssign {

	private Long ID;
	private Date InvitedDate;
	private Long ProjectId;
	private Long UserIdInvite;
	private Long UserIdReceiver;

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public Date getInvitedDate() {
		return InvitedDate;
	}

	public void setInvitedDate(Date invitedDate) {
		InvitedDate = invitedDate;
	}

	public Long getProjectId() {
		return ProjectId;
	}

	public void setProjectId(Long projectId) {
		ProjectId = projectId;
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

	public MockProjectAssign(){

	}

	public void finalize() throws Throwable {

	}

}