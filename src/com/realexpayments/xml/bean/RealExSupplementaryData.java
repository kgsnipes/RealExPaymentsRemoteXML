package com.realexpayments.xml.bean;

import java.util.List;

import com.realexpayments.xml.bean.annotations.TagName;

@TagName(name="supplementarydata")
public class RealExSupplementaryData extends RealExBean{
	
	protected List<RealExSupplementaryDataItem> item;

	/**
	 * @return the item
	 */
	public List<RealExSupplementaryDataItem> getItem() {
		return item;
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(List<RealExSupplementaryDataItem> item) {
		this.item = item;
	}

	public RealExSupplementaryData(List<RealExSupplementaryDataItem> item) {
		super();
		this.item = item;
	}
	
	
	

}
