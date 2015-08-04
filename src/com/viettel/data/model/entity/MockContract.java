package com.viettel.data.model.entity;

/**
 * @author hieuph
 * @version 1.0
 * @created 31-Jul-2015 3:45:13 PM
 */
public class MockContract {

	public Long getContractId() {
		return ContractId;
	}

	public void setContractId(Long contractId) {
		ContractId = contractId;
	}

	public Long getUserID() {
		return UserID;
	}

	public void setUserID(Long userID) {
		UserID = userID;
	}

	private Long ContractId;
	private Long UserID;

	public MockContract(){

	}

	public void finalize() throws Throwable {

	}

}