package com.realexpayments.xml.bean;

import java.io.Serializable;

import com.realexpayments.xml.bean.annotations.TagAttribute;
import com.realexpayments.xml.bean.annotations.TagName;

@TagName(name="comment")
public class RealExComment extends RealExBean{
	@TagAttribute(name="id")
	protected String id;
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
