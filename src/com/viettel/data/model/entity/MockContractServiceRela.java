package com.viettel.data.model.entity;

/**
 * @author hieuph
 * @version 1.0
 * @created 31-Jul-2015 3:45:14 PM
 */
public class MockContractServiceRela {

	private Long ContractId;
	public Long getContractId() {
		return ContractId;
	}

	public void setContractId(Long contractId) {
		ContractId = contractId;
	}

	public Long getServiceID() {
		return ServiceID;
	}

	public void setServiceID(Long serviceID) {
		ServiceID = serviceID;
	}

	public MockContract getM_MockContract() {
		return m_MockContract;
	}

	public void setM_MockContract(MockContract m_MockContract) {
		this.m_MockContract = m_MockContract;
	}

	private Long ServiceID;
	public MockContract m_MockContract;

	public MockContractServiceRela(){

	}

	public void finalize() throws Throwable {

	}

}