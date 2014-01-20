package com.realexpayments.xml.bean;

import com.realexpayments.xml.bean.annotations.TagAttribute;
import com.realexpayments.xml.bean.annotations.TagName;

@TagName(name="recurring")
public class RealExRecurring extends RealExBean{
	@TagAttribute(name="type")
	protected String type;
	
	@TagAttribute(name="sequence")
	protected String sequence;

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
	 * @return the sequence
	 */
	public String getSequence() {
		return sequence;
	}

	/**
	 * @param sequence the sequence to set
	 */
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public RealExRecurring(String type, String sequence) {
		super();
		this.type = type;
		this.sequence = sequence;
	}
	
	

	

}
