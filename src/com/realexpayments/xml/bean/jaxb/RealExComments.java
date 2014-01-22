package com.realexpayments.xml.bean.jaxb;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="comments")
public class RealExComments extends RealExBean{
	@XmlElement
	protected List<RealExComment> comments;

	/**
	 * @return the comments
	 */
	public List<RealExComment> getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(List<RealExComment> comments) {
		this.comments = comments;
	}

	public RealExComments(List<RealExComment> comments) {
		super();
		this.comments = comments;
	}

	public RealExComments() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
