package com.realexpayments.xml.bean.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="recurring")
public class RealExRecurring extends RealExBean{
	@XmlAttribute(name="type")
	protected String type;
	
	@XmlAttribute(name="sequence")
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

	public RealExRecurring() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	

}
