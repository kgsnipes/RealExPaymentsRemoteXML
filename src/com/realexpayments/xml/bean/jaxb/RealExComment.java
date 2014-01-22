package com.realexpayments.xml.bean.jaxb;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

import com.realexpayments.xml.bean.annotations.TagAttribute;
import com.realexpayments.xml.bean.annotations.TagName;

@XmlRootElement(name="comment")
public class RealExComment extends RealExBean{
	@XmlAttribute(name="id")
	protected String id;
	@XmlValue
	protected String comment;
	
	
	public RealExComment(String id, String comment) {
		super();
		this.id = id;
		this.comment = comment;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}
	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	

}
