package com.realexpayments.xml.bean;

import com.realexpayments.xml.bean.annotations.TagAttribute;
import com.realexpayments.xml.bean.annotations.TagName;
import com.realexpayments.xml.bean.annotations.TagValue;

@TagName(name="amount")
public class RealExAmount extends RealExBean{
	@TagAttribute(name="currency")
	protected String currency;
	@TagValue
	protected String amount;

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public RealExAmount(String currency, String amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}
	
	
	

	

	
	
	
	

}
