package com.realexpayments.xml.bean.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name="dccinfo")
public class RealExDCCInfo extends RealExBean{
	@XmlElement(name="ccp")
	protected String ccp;
	@XmlElement(name="type")
	protected String type;
	@XmlElement(name="rate")
	protected String rate;
	@XmlElement(name="ratetype")
	protected String ratetype;
	@XmlElement
	protected RealExAmount amount;
	
	
	/**
	 * @return the amount
	 */
	public RealExAmount getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(RealExAmount amount) {
		this.amount = amount;
	}
	/**
	 * @return the ccp
	 */
	public String getCcp() {
		return ccp;
	}
	/**
	 * @param ccp the ccp to set
	 */
	public void setCcp(String ccp) {
		this.ccp = ccp;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the rate
	 */
	public String getRate() {
		return rate;
	}
	/**
	 * @param rate the rate to set
	 */
	public void setRate(String rate) {
		this.rate = rate;
	}
	/**
	 * @return the ratetype
	 */
	public String getRatetype() {
		return ratetype;
	}
	/**
	 * @param ratetype the ratetype to set
	 */
	public void setRatetype(String ratetype) {
		this.ratetype = ratetype;
	}
	public RealExDCCInfo(String ccp, String type, String rate, String ratetype) {
		super();
		this.ccp = ccp;
		this.type = type;
		this.rate = rate;
		this.ratetype = ratetype;
	}
	public RealExDCCInfo(String ccp, String type, String rate, String ratetype,
			RealExAmount amount) {
		super();
		this.ccp = ccp;
		this.type = type;
		this.rate = rate;
		this.ratetype = ratetype;
		this.amount = amount;
	}
	public RealExDCCInfo(String ccp, String type) {
		super();
		this.ccp = ccp;
		this.type = type;
	}
	public RealExDCCInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
