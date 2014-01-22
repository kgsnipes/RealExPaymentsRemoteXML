package com.realexpayments.xml.bean.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="paymentdata")
public class RealExPaymentData extends RealExBean{
	@XmlElement(name="cvn")
	protected String cvn;
	@XmlElement(name="number")
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
	public RealExPaymentData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
