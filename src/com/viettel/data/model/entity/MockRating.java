package com.viettel.data.model.entity;

import java.sql.Date;

/**
 * @author hieuph
 * @version 1.0
 * @created 31-Jul-2015 3:45:22 PM
 */
public class MockRating {

	private Long ApiId;
	private Date DateRating;
	private Long ID;
	private Long UserId;
	private Long Value;
	public MockAPI m_MockAPI;

	public Long getApiId() {
		return ApiId;
	}

	public void setApiId(Long apiId) {
		ApiId = apiId;
	}

	public Date getDateRating() {
		return DateRating;
	}

	public void setDateRating(Date dateRating) {
		DateRating = dateRating;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public Long getUserId() {
		return UserId;
	}

	public void setUserId(Long userId) {
		UserId = userId;
	}

	public Long getValue() {
		return Value;
	}

	public void setValue(Long value) {
		Value = value;
	}

	public MockAPI getM_MockAPI() {
		return m_MockAPI;
	}

	public void setM_MockAPI(MockAPI m_MockAPI) {
		this.m_MockAPI = m_MockAPI;
	}

	public MockRating(){

	}

	public void finalize() throws Throwable {

	}

}