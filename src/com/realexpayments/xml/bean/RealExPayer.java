package com.realexpayments.xml.bean;

import com.realexpayments.xml.bean.annotations.TagAttribute;
import com.realexpayments.xml.bean.annotations.TagName;
import com.realexpayments.xml.bean.annotations.TagValue;

@TagName(name="payer")
public class RealExPayer extends RealExBean{
	@TagAttribute(name="type")
	protected String type;
	@TagAttribute(name="ref")
	protected String ref;
	@TagName(name="title")
	protected String title;
	@TagName(name="firstname")
	protected String firstName;
	@TagName(name="surname")
	protected String surName;
	@TagName(name="company")
	protected String company;
	@TagValue
	protected RealExPayerAddress address;
	@TagValue
	protected RealExPayerPhoneNumbers phoneNumbers;
	@TagName(name="email")
	protected String email;
	@TagValue
	protected RealExComments comments;
	
	
	public RealExPayer(String type, String ref, String title, String firstName,
			String surName, String company, RealExPayerAddress address,
			RealExPayerPhoneNumbers phoneNumbers, String email,
			RealExComments comments) {
		super();
		this.type = type;
		this.ref = ref;
		this.title = title;
		this.firstName = firstName;
		this.surName = surName;
		this.company = company;
		this.address = address;
		this.phoneNumbers = phoneNumbers;
		this.email = email;
		this.comments = comments;
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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the surName
	 */
	public String getSurName() {
		return surName;
	}
	/**
	 * @param surName the surName to set
	 */
	public void setSurName(String surName) {
		this.surName = surName;
	}
	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * @return the address
	 */
	public RealExPayerAddress getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(RealExPayerAddress address) {
		this.address = address;
	}
	/**
	 * @return the phoneNumbers
	 */
	public RealExPayerPhoneNumbers getPhoneNumbers() {
		return phoneNumbers;
	}
	/**
	 * @param phoneNumbers the phoneNumbers to set
	 */
	public void setPhoneNumbers(RealExPayerPhoneNumbers phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the comments
	 */
	public RealExComments getComments() {
		return comments;
	}
	/**
	 * @param comments the comments to set
	 */
	public void setComments(RealExComments comments) {
		this.comments = comments;
	}
	
	
	

}
