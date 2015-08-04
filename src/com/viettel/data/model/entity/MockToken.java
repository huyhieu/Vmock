package com.viettel.data.model.entity;

/**
 * @author hieuph
 * @version 1.0
 * @created 31-Jul-2015 3:45:25 PM
 */
public class MockToken {

	private Long TokenId;
	private Long UserId;

	public MockToken(){

	}

	public void finalize() throws Throwable {

	}

	public Long getTokenId() {
		return TokenId;
	}

	public void setTokenId(Long tokenId) {
		TokenId = tokenId;
	}

	public Long getUserId() {
		return UserId;
	}

	public void setUserId(Long userId) {
		UserId = userId;
	}

}