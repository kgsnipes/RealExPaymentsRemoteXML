package com.realexpayments.xml.bean;

import com.realexpayments.xml.bean.annotations.TagName;
import com.realexpayments.xml.bean.annotations.TagValue;

@TagName(name="dccinfo")
public class RealExDCCInfo extends RealExBean{
	@TagName(name="ccp")
	protected String ccp;
	@TagName(name="type")
	protected String type;
	@TagName(name="rate")
	protected String rate;
	@TagName(name="ratetype")
	protected String ratetype;
	@TagValue
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
	
	
	

}
