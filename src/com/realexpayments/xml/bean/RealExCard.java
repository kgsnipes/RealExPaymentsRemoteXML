package com.realexpayments.xml.bean;

import com.realexpayments.xml.bean.annotations.TagName;

@TagName(name="card")
public class RealExCard extends RealExBean{
	@TagName(name="ref")
	protected String ref;
	@TagName(name="payerref")
	protected String payerRef;
	@TagName(name="number")
	protected String number;
	@TagName(name="expdate")
	protected String expDate;
	@TagName(name="chname")
	protected String chname;
	@TagName(name="type")
	protected String type;
	@TagName(name="issueno")
	protected String issueNo;
	/**
	 * @return the ref
	 */
	public String getRef() {
		return ref;
	}
	/**
	 * @param ref the ref to set
	 */
	public void setRef(String ref) {
		this.ref = ref;
	}
	/**
	 * @return the payerRef
	 */
	public String getPayerRef() {
		return payerRef;
	}
	/**
	 * @param payerRef the payerRef to set
	 */
	public void setPayerRef(String payerRef) {
		this.payerRef = payerRef;
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
	/**
	 * @return the expDate
	 */
	public String getExpDate() {
		return expDate;
	}
	/**
	 * @param expDate the expDate to set
	 */
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	/**
	 * @return the chname
	 */
	public String getChname() {
		return chname;
	}
	/**
	 * @param chname the chname to set
	 */
	public void setChname(String chname) {
		this.chname = chname;
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
	 * @return the issueNo
	 */
	public String getIssueNo() {
		return issueNo;
	}
	/**
	 * @param issueNo the issueNo to set
	 */
	public void setIssueNo(String issueNo) {
		this.issueNo = issueNo;
	}
	public RealExCard(String ref, String payerRef, String number,
			String expDate, String chname, String type, String issueNo) {
		super();
		this.ref = ref;
		this.payerRef = payerRef;
		this.number = number;
		this.expDate = expDate;
		this.chname = chname;
		this.type = type;
		this.issueNo = issueNo;
	}
	
	
	
	

}
