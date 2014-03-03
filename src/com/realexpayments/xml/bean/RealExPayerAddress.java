package com.realexpayments.xml.bean;

import com.realexpayments.xml.bean.annotations.TagName;
import com.realexpayments.xml.bean.annotations.TagValue;
@TagName(name="address")
public class RealExPayerAddress extends RealExBean{
	@TagName(name="line1")
	protected String line1;
	@TagName(name="line2")
	protected String line2;
	@TagName(name="line3")
	protected String line3;
	@TagName(name="city")
	protected String city;
	@TagName(name="county")
	protected String county;
	@TagName(name="postcode")
	protected String postcode;
	@TagValue
	protected RealExCountryCode countryCode;
	/**
	 * @return the line1
	 */
	public String getLine1() {
		return line1;
	}
	/**
	 * @param line1 the line1 to set
	 */
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	/**
	 * @return the line2
	 */
	public String getLine2() {
		return line2;
	}
	/**
	 * @param line2 the line2 to set
	 */
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	/**
	 * @return the line3
	 */
	public String getLine3() {
		return line3;
	}
	/**
	 * @param line3 the line3 to set
	 */
	public void setLine3(String line3) {
		this.line3 = line3;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the county
	 */
	public String getCounty() {
		return county;
	}
	/**
	 * @param county the county to set
	 */
	public void setCounty(String county) {
		this.county = county;
	}
	/**
	 * @return the postcode
	 */
	public String getPostcode() {
		return postcode;
	}
	/**
	 * @param postcode the postcode to set
	 */
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	/**
	 * @return the countryCode
	 */
	public RealExCountryCode getCountryCode() {
		return countryCode;
	}
	/**
	 * @param countryCode the countryCode to set
	 */
	public void setCountryCode(RealExCountryCode countryCode) {
		this.countryCode = countryCode;
	}
	public RealExPayerAddress(String line1, String line2, String line3,
			String city, String county, String postcode,
			RealExCountryCode countryCode) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.line3 = line3;
		this.city = city;
		this.county = county;
		this.postcode = postcode;
		this.countryCode = countryCode;
	}
	
	

}
