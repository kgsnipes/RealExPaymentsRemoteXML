package com.realexpayments.xml.bean;

import com.realexpayments.xml.bean.annotations.TagName;

@TagName(name="request")
public class RealExPaymentMethodSetupRequest extends RealExBean{
	
	protected String type;
	
	protected String timestamp;
	
	protected String merchantId;
	
	protected String orderId;
	
	protected RealExCard card;
	
	protected String sha1hash;
	
	

}
