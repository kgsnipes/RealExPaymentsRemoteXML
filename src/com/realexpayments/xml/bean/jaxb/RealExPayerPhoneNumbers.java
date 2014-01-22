package com.realexpayments.xml.bean.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="phonenumbers")
public class RealExPayerPhoneNumbers extends RealExBean{
	@XmlElement(name="home")
	protected String home;
	@XmlElement(name="work")
	protected String work;
	@XmlElement(name="fax")
	protected String fax;
	@XmlElement(name="mobile")
	protected String mobile;
	/**
	 * @return the home
	 */
	public String getHome() {
		return home;
	}
	/**
	 * @param home the home to set
	 */
	public void setHome(String home) {
		this.home = home;
	}
	/**
	 * @return the work
	 */
	public String getWork() {
		return work;
	}
	/**
	 * @param work the work to set
	 */
	public void setWork(String work) {
		this.work = work;
	}
	/**
	 * @return the fax
	 */
	public String getFax() {
		return fax;
	}
	/**
	 * @param fax the fax to set
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public RealExPayerPhoneNumbers(String home, String work, String fax,
			String mobile) {
		super();
		this.home = home;
		this.work = work;
		this.fax = fax;
		this.mobile = mobile;
	}
	
	
	

}
