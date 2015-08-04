package com.viettel.data.model.entity;

/**
 * @author hieuph
 * @version 1.0
 * @created 31-Jul-2015 3:45:24 PM
 */
public class MockServices {

	private Long PriceId;
	private Long ServiceId;
	public MockPrice m_MockPrice;
	public MockContractServiceRela m_MockContractServiceRela;

	public Long getPriceId() {
		return PriceId;
	}

	public void setPriceId(Long priceId) {
		PriceId = priceId;
	}

	public Long getServiceId() {
		return ServiceId;
	}

	public void setServiceId(Long serviceId) {
		ServiceId = serviceId;
	}

	public MockPrice getM_MockPrice() {
		return m_MockPrice;
	}

	public void setM_MockPrice(MockPrice m_MockPrice) {
		this.m_MockPrice = m_MockPrice;
	}

	public MockContractServiceRela getM_MockContractServiceRela() {
		return m_MockContractServiceRela;
	}

	public void setM_MockContractServiceRela(MockContractServiceRela m_MockContractServiceRela) {
		this.m_MockContractServiceRela = m_MockContractServiceRela;
	}

	public MockServices(){

	}

	public void finalize() throws Throwable {

	}

}