package com.realexpayments.xml.bean;

import com.realexpayments.xml.bean.annotations.TagAttribute;
import com.realexpayments.xml.bean.annotations.TagName;

@TagName(name="autosettle")
public class RealExAutoSettle extends RealExBean{
	@TagAttribute(name="flag")
	protected String flag;

	/**
	 * @return the flag
	 */
	public String getFlag() {
		return flag;
	}

	/**
	 * @param flag the flag to set
	 */
	public void setFlag(String flag) {
		this.flag = flag;
	}

	public RealExAutoSettle(String flag) {
		super();
		this.flag = flag;
	}
	
	

}
