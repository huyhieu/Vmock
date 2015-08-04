package com.viettel.data.model.entity;

import java.sql.Date;



/**
 * @author hieuph
 * @version 1.0
 * @created 31-Jul-2015 3:45:12 PM
 */
public class MockComment {

	public Long getApiId() {
		return ApiId;
	}

	public void setApiId(Long apiId) {
		ApiId = apiId;
	}

	public String getContentComment() {
		return ContentComment;
	}

	public void setContentComment(String contentComment) {
		ContentComment = contentComment;
	}

	public Date getDateComment() {
		return DateComment;
	}

	public void setDateComment(Date dateComment) {
		DateComment = dateComment;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public Long getUserId() {
		return UserId;
	}

	public void setUserId(Long userId) {
		UserId = userId;
	}

	private Long ApiId;
	private String ContentComment;
	private Date DateComment;
	private int ID;
	private Long UserId;

	public MockComment(){

	}

	public void finalize() throws Throwable {

	}

}