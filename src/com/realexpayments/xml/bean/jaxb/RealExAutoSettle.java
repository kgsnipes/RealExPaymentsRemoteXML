package com.realexpayments.xml.bean.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.realexpayments.xml.bean.annotations.TagAttribute;
import com.realexpayments.xml.bean.annotations.TagName;

@XmlRootElement(name="autosettle")
public class RealExAutoSettle extends RealExBean{
	@XmlAttribute(name="flag")
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
