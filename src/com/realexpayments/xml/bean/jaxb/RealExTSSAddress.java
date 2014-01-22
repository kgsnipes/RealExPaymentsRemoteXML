package com.realexpayments.xml.bean.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="address")
public class RealExTSSAddress extends RealExBean{
	@XmlAttribute(name="type")
	protected String type;
	
	@XmlElement(name="code")
	protected String code;
	
	@XmlElement(name="country")
	protected String country;

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
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	public RealExTSSAddress(String type, String code, String country) {
		super();
		this.type = type;
		this.code = code;
		this.country = country;
	}

	public RealExTSSAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
