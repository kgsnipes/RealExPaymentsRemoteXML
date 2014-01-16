package com.realexpayments.xml.bean;

import com.realexpayments.xml.bean.annotations.TagName;

@TagName(name="phonenumbers")
public class RealExPayerPhoneNumbers extends RealExBean{
	@TagName(name="home")
	protected String home;
	@TagName(name="work")
	protected String work;
	@TagName(name="fax")
	protected String fax;
	@TagName(name="mobile")
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
