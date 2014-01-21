package com.realexpayments.xml.sample;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.realexpayments.request.RealEx3DSecuredEnabledRequest;
import com.realexpayments.request.RealExAddCardRequest;
import com.realexpayments.request.RealExDCCSecuredEnabledRequest;
import com.realexpayments.request.RealExDeleteCardRequest;
import com.realexpayments.request.RealExEditExistingPayerRequest;
import com.realexpayments.request.RealExRaisingCreditCardPaymentRequest;
import com.realexpayments.request.RealExRaisingRefundRequest;
import com.realexpayments.request.RealExSetupNewPayerRequest;
import com.realexpayments.response.RealExResponse;
import com.realexpayments.xml.bean.RealExAmount;
import com.realexpayments.xml.bean.RealExAutoSettle;
import com.realexpayments.xml.bean.RealExCard;
import com.realexpayments.xml.bean.RealExComment;
import com.realexpayments.xml.bean.RealExComments;
import com.realexpayments.xml.bean.RealExCountryCode;
import com.realexpayments.xml.bean.RealExDCCInfo;
import com.realexpayments.xml.bean.RealExMPI;
import com.realexpayments.xml.bean.RealExPayer;
import com.realexpayments.xml.bean.RealExPayerAddress;
import com.realexpayments.xml.bean.RealExPayerPhoneNumbers;
import com.realexpayments.xml.bean.RealExPaymentData;
import com.realexpayments.xml.bean.RealExSupplementaryData;
import com.realexpayments.xml.bean.RealExSupplementaryDataItem;
import com.realexpayments.xml.bean.RealExTSSAddress;
import com.realexpayments.xml.bean.RealExTSSInfo;
import com.realexpayments.xml.util.Constants;
import com.realexpayments.xml.util.HashingUtil;
import com.realexpayments.xml.util.RealExBeanToXMLConverterUtil;
import com.realexpayments.xml.util.RealExHttpUtil;

public class SampleCode {

	public static final String SHARED_SECRET="secret";
	public static final String MERCHANT_ID="merchant-123456789";
	public static final String ORDER_ID="order-123456789";
	public static final String ACCOUNT_ID="account-123456789";
		
	public static void main(String []args) throws Exception
	{
		// setup new payer request
		RealExResponse response=getResponseForRealExSetupNewPayerRequest();
		System.out.println("Response result :"+ response.getResult() );
		System.out.println("Response message :"+ response.getMessage() );
		
		
		response=getResponseForRealEx3DSecuredEnabledRequest();
		System.out.println("Response result :"+ response.getResult() );
		System.out.println("Response message :"+ response.getMessage() );
		
		response=getResponseForRealExAddCardRequest();
		System.out.println("Response result :"+ response.getResult() );
		System.out.println("Response message :"+ response.getMessage() );
		
		response=getResponseForRealExDCCSecuredEnabledRequest();
		System.out.println("Response result :"+ response.getResult() );
		System.out.println("Response message :"+ response.getMessage() );
		
		response=getResponseForRealExDeleteCardRequest();
		System.out.println("Response result :"+ response.getResult() );
		System.out.println("Response message :"+ response.getMessage() );
		
		response=getResponseForRealExEditExistingPayerRequest();
		System.out.println("Response result :"+ response.getResult() );
		System.out.println("Response message :"+ response.getMessage() );
		
		 response=getResponseForRealExRaisingCreditCardPaymentRequest();
		System.out.println("Response result :"+ response.getResult() );
		System.out.println("Response message :"+ response.getMessage() );
		
		response=getResponseForRealExRaisingRefundRequest();
		System.out.println("Response result :"+ response.getResult() );
		System.out.println("Response message :"+ response.getMessage() );
		
	}
	
	
	public static RealExResponse getResponseForRealExSetupNewPayerRequest()throws Exception
	{
		return RealExHttpUtil.getResponse(Constants.REAL_EX_PAYMENTS_URL, getRealExSetupNewPayerRequest());
	}
	
	public static RealExResponse getResponseForRealEx3DSecuredEnabledRequest()throws Exception
	{
		return RealExHttpUtil.getResponse(Constants.REAL_EX_PAYMENTS_URL, getRealEx3DSecuredEnabledRequest());
	}
	
	public static RealExResponse getResponseForRealExAddCardRequest()throws Exception
	{
		return RealExHttpUtil.getResponse(Constants.REAL_EX_PAYMENTS_URL, getRealExAddCardRequest());
	}
	
	public static RealExResponse getResponseForRealExDCCSecuredEnabledRequest()throws Exception
	{
		return RealExHttpUtil.getResponse(Constants.REAL_EX_PAYMENTS_URL, getRealExDCCSecuredEnabledRequest());
	}
	
	public static RealExResponse getResponseForRealExDeleteCardRequest()throws Exception
	{
		return RealExHttpUtil.getResponse(Constants.REAL_EX_PAYMENTS_URL, getRealExDeleteCardRequest());
	}
	
	public static RealExResponse getResponseForRealExEditExistingPayerRequest()throws Exception
	{
		return RealExHttpUtil.getResponse(Constants.REAL_EX_PAYMENTS_URL, getRealExEditExistingPayerRequest());
	}
	
	public static RealExResponse getResponseForRealExRaisingCreditCardPaymentRequest()throws Exception
	{
		return RealExHttpUtil.getResponse(Constants.REAL_EX_PAYMENTS_URL, getRealExRaisingCreditCardPaymentRequest());
	}
	
	public static RealExResponse getResponseForRealExRaisingRefundRequest()throws Exception
	{
		return RealExHttpUtil.getResponse(Constants.REAL_EX_PAYMENTS_URL, getRealExRaisingRefundRequest());
	}
	
	public static RealExSetupNewPayerRequest getRealExSetupNewPayerRequest() throws Exception
	{
		RealExSetupNewPayerRequest retVal=null;
		Date now=new Date();
		String timeStamp=now.getTime()+"";
		List<RealExComment> comment=new ArrayList<>();
		comment.add(new RealExComment("id1", "comment1"));
		comment.add(new RealExComment("id2", "comment2"));
		RealExComments comments=new RealExComments(comment);
		RealExCountryCode country=new RealExCountryCode("US", "United States of America");
		RealExPayerPhoneNumbers phone=new RealExPayerPhoneNumbers("+123456789", "+123456789", "+123456789", "+123456789");
		RealExPayerAddress address=new RealExPayerAddress("line1", "line2", "line3", "city", "county", "123456", country);
		RealExPayer payer=new RealExPayer("Business", "smithj01", "Mr", "John", "Smith", "Acme Inc", address, phone, "foo@bar.com", comments);
		retVal=new RealExSetupNewPayerRequest(timeStamp, MERCHANT_ID, ORDER_ID, HashingUtil.getSHAHashForNewPayer(SHARED_SECRET, timeStamp, MERCHANT_ID, ORDER_ID, "9999", "USD", "smithj01"), payer, comments);
		String xml=RealExBeanToXMLConverterUtil.toXML(retVal);
		System.out.println(xml);
		return retVal;	
	}
	
	public static RealEx3DSecuredEnabledRequest getRealEx3DSecuredEnabledRequest() throws Exception
	{
		RealEx3DSecuredEnabledRequest retVal=null;
		Date now=new Date();
		String timeStamp=now.getTime()+"";
		List<RealExComment> comment=new ArrayList<>();
		comment.add(new RealExComment("id1", "comment1"));
		comment.add(new RealExComment("id2", "comment2"));
		RealExComments comments=new RealExComments(comment);
		RealExAmount amount=new RealExAmount("USD", "9999");
		RealExAutoSettle settle=new RealExAutoSettle("1");
		retVal=new RealEx3DSecuredEnabledRequest(timeStamp, MERCHANT_ID, ACCOUNT_ID, ORDER_ID, amount,  "smithj01", "visa01", settle, HashingUtil.getSHAHashFor3DSecuredEnabledRequest(SHARED_SECRET, timeStamp, MERCHANT_ID, ORDER_ID, ACCOUNT_ID, "USD", "smithj01"), comments);
		String xml=RealExBeanToXMLConverterUtil.toXML(retVal);
		System.out.println(xml);
		return retVal;	
	}
	
	public static RealExAddCardRequest getRealExAddCardRequest() throws Exception
	{
		RealExAddCardRequest retVal=null;
		Date now=new Date();
		String timeStamp=now.getTime()+"";
		retVal=new RealExAddCardRequest(timeStamp, MERCHANT_ID, ORDER_ID, new RealExCard("visa01", "smithj01", "123456798465", "0104", "John Smith", "visa", ""), HashingUtil.getSHAHashForAddCardDetails(SHARED_SECRET, timeStamp, MERCHANT_ID, ORDER_ID, "9999", "USD", "smithj01", "John Smith", "123456781239")); 
		String xml=RealExBeanToXMLConverterUtil.toXML(retVal);
		System.out.println(xml);
		return retVal;	
	}
	
	public static RealExDCCSecuredEnabledRequest getRealExDCCSecuredEnabledRequest() throws Exception
	{
		RealExDCCSecuredEnabledRequest retVal=null;
		Date now=new Date();
		String timeStamp=now.getTime()+"";
		List<RealExComment> comment=new ArrayList<>();
		comment.add(new RealExComment("id1", "comment1"));
		comment.add(new RealExComment("id2", "comment2"));
		RealExComments comments=new RealExComments(comment);
		retVal=new RealExDCCSecuredEnabledRequest(timeStamp, MERCHANT_ID, ACCOUNT_ID, ORDER_ID, new RealExAmount("USD", "9999"), "smithj01", "visa01", HashingUtil.getSHAHashForDCCEnabledRequest(SHARED_SECRET, timeStamp, MERCHANT_ID, ORDER_ID, "9999", "USD", "smithj01"), comments);
		String xml=RealExBeanToXMLConverterUtil.toXML(retVal);
		System.out.println(xml);
		return retVal;	
	}
	
	public static RealExDeleteCardRequest getRealExDeleteCardRequest() throws Exception
	{
		RealExDeleteCardRequest retVal=null;
		Date now=new Date();
		String timeStamp=now.getTime()+"";
		List<RealExComment> comment=new ArrayList<>();
		comment.add(new RealExComment("id1", "comment1"));
		comment.add(new RealExComment("id2", "comment2"));
		RealExComments comments=new RealExComments(comment);
		retVal=new RealExDeleteCardRequest(timeStamp, MERCHANT_ID, ORDER_ID, new RealExCard("visa01", "smithj01", "1234123412341234", "0104", "John Smith", "visa", ""), HashingUtil.getSHAHashForDeleteCard(SHARED_SECRET, timeStamp, MERCHANT_ID, "smithj01", "1d6f54gd65f4g"));
		String xml=RealExBeanToXMLConverterUtil.toXML(retVal);
		System.out.println(xml);
		return retVal;	
	}
	
	public static RealExEditExistingPayerRequest getRealExEditExistingPayerRequest() throws Exception
	{
		RealExEditExistingPayerRequest retVal=null;
		Date now=new Date();
		String timeStamp=now.getTime()+"";
		List<RealExComment> comment=new ArrayList<>();
		comment.add(new RealExComment("id1", "comment1"));
		comment.add(new RealExComment("id2", "comment2"));
		RealExComments comments=new RealExComments(comment);
		RealExCountryCode country=new RealExCountryCode("US", "United States of America");
		RealExPayerPhoneNumbers phone=new RealExPayerPhoneNumbers("+123456789", "+123456789", "+123456789", "+123456789");
		RealExPayerAddress address=new RealExPayerAddress("line1", "line2", "line3", "city", "county", "123456", country);
		RealExPayer payer=new RealExPayer("Business", "smithj01", "Mr", "John", "Smith", "Acme Inc", address, phone, "foo@bar.com", comments);
		retVal=new RealExEditExistingPayerRequest(timeStamp, MERCHANT_ID, ORDER_ID, HashingUtil.getSHAHashForEditExistingPayer(SHARED_SECRET, timeStamp, MERCHANT_ID, ORDER_ID, "9999", "USD", "smithj01"), payer, comments);
		String xml=RealExBeanToXMLConverterUtil.toXML(retVal);
		System.out.println(xml);
		return retVal;	
	}
	
	
	public static RealExRaisingCreditCardPaymentRequest getRealExRaisingCreditCardPaymentRequest() throws Exception
	{
		RealExRaisingCreditCardPaymentRequest retVal=null;
		Date now=new Date();
		String timeStamp=now.getTime()+"";
		List<RealExComment> comment=new ArrayList<>();
		comment.add(new RealExComment("id1", "comment1"));
		comment.add(new RealExComment("id2", "comment2"));
		RealExComments comments=new RealExComments(comment);
		Map<String,String> kv=new HashMap<>();
		kv.put("key1", "value1");
		kv.put("key2", "value2");
		Map<String,String> kv1=new HashMap<>();
		kv.put("1key1", "1value1");
		kv.put("2key2", "2value2");
		List<RealExSupplementaryDataItem> items=new ArrayList<>(); 
		items.add(new RealExSupplementaryDataItem("pnr", kv));
		items.add(new RealExSupplementaryDataItem("por", kv1));
		retVal=new RealExRaisingCreditCardPaymentRequest(timeStamp, MERCHANT_ID, ACCOUNT_ID, ORDER_ID, new RealExPaymentData("001", "1324123413241324"), new RealExMPI("65f4g6d5f4g", "654dgs65d4g", "654f64gh5fh"), new RealExDCCInfo("fexco", "1", "1.30", "S", new RealExAmount("USD", "9999")), new RealExAmount("USD", "9999"), "smithj01", "visa01", new RealExAutoSettle("1"), HashingUtil.getSHAHashForRaisingCreditCardPayment(SHARED_SECRET, timeStamp, MERCHANT_ID, ORDER_ID, "9999", "USD", "smithj01"), comments, new RealExTSSInfo(new RealExTSSAddress("billing", "US", "United States"), new RealExTSSAddress("shipping", "US", "United States")), new RealExSupplementaryData(items));
		String xml=RealExBeanToXMLConverterUtil.toXML(retVal);
		System.out.println(xml);
		return retVal;	
	}
	
	public static RealExRaisingRefundRequest getRealExRaisingRefundRequest() throws Exception
	{
		RealExRaisingRefundRequest retVal=null;
		Date now=new Date();
		String timeStamp=now.getTime()+"";
		List<RealExComment> comment=new ArrayList<>();
		comment.add(new RealExComment("id1", "comment1"));
		comment.add(new RealExComment("id2", "comment2"));
		RealExComments comments=new RealExComments(comment);
		Map<String,String> kv=new HashMap<>();
		kv.put("key1", "value1");
		kv.put("key2", "value2");
		Map<String,String> kv1=new HashMap<>();
		kv.put("1key1", "1value1");
		kv.put("2key2", "2value2");
		List<RealExSupplementaryDataItem> items=new ArrayList<>(); 
		items.add(new RealExSupplementaryDataItem("pnr", kv));
		items.add(new RealExSupplementaryDataItem("por", kv1));
		retVal=new RealExRaisingRefundRequest(timeStamp, MERCHANT_ID, ACCOUNT_ID, ORDER_ID, new RealExPaymentData("114", "1234123412341234"), new RealExMPI("re654g", "65fdg64dg", "fd1g3d5g"), new RealExDCCInfo("fexco", "1", "1.30", "S", new RealExAmount("USD", "9999")), new RealExAmount("USD", "9999"), "smithj01", "visa01", new RealExAutoSettle("1"), HashingUtil.getSHAHashForRefund(SHARED_SECRET, timeStamp, MERCHANT_ID, ORDER_ID, "9999", "USD", "smithj01"), HashingUtil.getSHAHashForRefund(SHARED_SECRET, timeStamp, MERCHANT_ID, ORDER_ID, "9999", "USD", "smithj01"), comments, new RealExTSSInfo(new RealExTSSAddress("billing", "US", "United States"), new RealExTSSAddress("shipping", "US", "United States")), new RealExSupplementaryData(items));
		String xml=RealExBeanToXMLConverterUtil.toXML(retVal);
		System.out.println(xml);
		return retVal;	
	}
	
	
}
