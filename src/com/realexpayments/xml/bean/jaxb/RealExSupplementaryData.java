package com.realexpayments.xml.bean.jaxb;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="supplementarydata")
public class RealExSupplementaryData extends RealExBean{
	
	@XmlElement
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

	public RealExSupplementaryData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
