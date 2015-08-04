package com.viettel.data.model.entity;

/**
 * @author hieuph
 * @version 1.0
 * @created 31-Jul-2015 3:45:20 PM
 */
public class MockPrice {

	private Long PriceId;
	private Long Value;

	public MockPrice(){

	}

	public void finalize() throws Throwable {

	}

	public Long getPriceId() {
		return PriceId;
	}

	public void setPriceId(Long priceId) {
		PriceId = priceId;
	}

	public Long getValue() {
		return Value;
	}

	public void setValue(Long value) {
		Value = value;
	}

}