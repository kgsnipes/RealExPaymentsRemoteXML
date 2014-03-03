package com.realexpayments.xml.bean;

import java.util.List;

import com.realexpayments.xml.bean.annotations.TagName;

@TagName(name="comments")
public class RealExComments extends RealExBean{
	@TagName(name="comment")
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
	
	

}
