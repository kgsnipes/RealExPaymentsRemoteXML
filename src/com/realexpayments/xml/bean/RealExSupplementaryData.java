package com.realexpayments.xml.bean;

import java.util.List;

import com.realexpayments.xml.bean.annotations.TagName;

@TagName(name="supplementarydata")
public class RealExSupplementaryData extends RealExBean{
	
	protected List<RealExSupplementaryDataItem> item;

}
