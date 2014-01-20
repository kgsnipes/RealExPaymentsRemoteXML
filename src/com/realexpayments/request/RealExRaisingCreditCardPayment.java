package com.realexpayments.request;

import com.realexpayments.xml.bean.RealExAmount;
import com.realexpayments.xml.bean.RealExAutoSettle;
import com.realexpayments.xml.bean.RealExBean;
import com.realexpayments.xml.bean.RealExCard;
import com.realexpayments.xml.bean.RealExComments;
import com.realexpayments.xml.bean.RealExDCCInfo;
import com.realexpayments.xml.bean.RealExMPI;
import com.realexpayments.xml.bean.RealExPaymentData;
import com.realexpayments.xml.bean.RealExSupplementaryData;
import com.realexpayments.xml.bean.RealExTSSInfo;
import com.realexpayments.xml.bean.annotations.TagAttribute;
import com.realexpayments.xml.bean.annotations.TagName;

@TagName(name="request")
public class RealExRaisingCreditCardPayment extends RealExBean{
	@TagAttribute(name="type")
	protected String type="receipt-in";
	@TagAttribute(name="timestamp")
	protected String timestamp;
	@TagName(name="merchantid")
	protected String merchantId;
	@TagName(name="account")
	protected String account;
	@TagName(name="orderid")
	protected String orderId;
	
	protected RealExPaymentData paymentData;
	protected RealExMPI mpi;
	protected RealExDCCInfo dccInfo;
	protected RealExAmount amount;
	@TagName(name="payerref")
	protected String payerRef;
	@TagName(name="paymentmethod")
	protected String paymentmethod;
	protected RealExAutoSettle autoSettle;
	
	
	@TagName(name="sha1hash")
	protected String sha1hash;
	
	protected RealExComments comments;
	
	protected RealExTSSInfo tssinfo;
	
	protected RealExSupplementaryData supplementaryData;
	
	

	
	
	

}
