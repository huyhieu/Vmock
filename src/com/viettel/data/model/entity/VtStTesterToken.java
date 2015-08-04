package com.viettel.data.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import GlobalDefine.Config;

import com.viettel.data.query.TesterTokenQuery;

@Entity
@Table(name = "VT_ST_TESTER_TOKEN")
@javax.persistence.NamedNativeQueries({
		@javax.persistence.NamedNativeQuery(name = TesterTokenQuery.GET_ALL_TESTER_TOKEN_NAME, query = TesterTokenQuery.GET_ALL_TESTER_TOKEN, resultClass = VtStTesterToken.class, hints = @javax.persistence.QueryHint(name = Config.callable, value = "true")),
		@javax.persistence.NamedNativeQuery(name = TesterTokenQuery.GET_TESTER_TOKEN_BY_TESTER_ID_NAME, query = TesterTokenQuery.GET_TESTER_TOKEN_BY_TESTER_ID, resultClass = VtStTesterToken.class, hints = @javax.persistence.QueryHint(name = Config.callable, value = "true")) })
public class VtStTesterToken implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Long testerTokenId;
	private Long userId;
	private String tokenString;
	private Long tokenTime;
	private String device;

	public VtStTesterToken() {

	}

	public VtStTesterToken(Long testerTokenId) {
		this.testerTokenId = testerTokenId;
	}

	public VtStTesterToken(Long userId, String tokenString, Long tokenTime,
			String device) {
		this.userId = userId;
		this.tokenString = tokenString;
		this.tokenTime = tokenTime;
		this.device = device;
	}

	@Id
	@Column(name = "TESTER_TOKEN_ID", unique = true, nullable = false, precision = 22, scale = 0)
	public Long getTesterTokenId() {
		return testerTokenId;
	}

	public void setTesterTokenId(Long testerTokenId) {
		this.testerTokenId = testerTokenId;
	}
	
	@Column(name = "USER_ID", unique = true, nullable = false, precision = 22, scale = 0)
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Column(name = "TOKEN_STRING", length = 50)
	public String getTokenString() {
		return tokenString;
	}

	public void setTokenString(String tokenString) {
		this.tokenString = tokenString;
	}

	@Column(name = "TOKEN_TIME", precision = 22, scale = 0)
	public Long getTokenTime() {
		return tokenTime;
	}

	public void setTokenTime(Long tokenTime) {
		this.tokenTime = tokenTime;
	}

	@Column(name = "DEVICE", length = 100)
	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}
}
