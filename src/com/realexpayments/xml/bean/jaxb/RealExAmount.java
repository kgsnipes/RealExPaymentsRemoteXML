package com.realexpayments.xml.bean.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name="amount")
public class RealExAmount extends RealExBean{
	@XmlAttribute(name="currency")
	protected String currency;
	@XmlValue
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
	
	

	public RealExAmount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RealExAmount(String currency, String amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}
	
	
	

	

	
	
	
	

}
