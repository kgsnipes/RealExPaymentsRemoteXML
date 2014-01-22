package com.realexpayments.xml.bean.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="card")
public class RealExCard extends RealExBean{
	@XmlElement(name="ref")
	protected String ref;
	@XmlElement(name="payerref")
	protected String payerRef;
	@XmlElement(name="number")
	protected String number;
	@XmlElement(name="expdate")
	protected String expDate;
	@XmlElement(name="chname")
	protected String chname;
	@XmlElement(name="type")
	protected String type;
	@XmlElement(name="issueno")
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
	public RealExCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
