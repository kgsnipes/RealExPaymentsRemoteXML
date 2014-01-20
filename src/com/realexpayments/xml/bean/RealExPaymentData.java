package com.realexpayments.xml.bean;

import com.realexpayments.xml.bean.annotations.TagName;

@TagName(name="paymentdata")
public class RealExPaymentData extends RealExBean{
	@TagName(name="cvn")
	protected String cvn;
	@TagName(name="number")
	protected String number;
	/**
	 * @return the cvn
	 */
	public String getCvn() {
		return cvn;
	}
	/**
	 * @param cvn the cvn to set
	 */
	public void setCvn(String cvn) {
		this.cvn = cvn;
	}
	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	public RealExPaymentData(String cvn, String number) {
		super();
		this.cvn = cvn;
		this.number = number;
	}
	
	
	
	
	
	

}
