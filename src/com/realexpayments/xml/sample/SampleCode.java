package com.realexpayments.xml.sample;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.realexpayments.request.RealExSetupNewPayerRequest;
import com.realexpayments.response.RealExResponse;
import com.realexpayments.xml.bean.RealExComment;
import com.realexpayments.xml.bean.RealExComments;
import com.realexpayments.xml.bean.RealExCountryCode;
import com.realexpayments.xml.bean.RealExPayer;
import com.realexpayments.xml.bean.RealExPayerAddress;
import com.realexpayments.xml.bean.RealExPayerPhoneNumbers;
import com.realexpayments.xml.util.Constants;
import com.realexpayments.xml.util.HashingUtil;
import com.realexpayments.xml.util.RealExBeanToXMLConverterUtil;
import com.realexpayments.xml.util.RealExHttpUtil;

public class SampleCode {

	public static final String SHARED_SECRET="secret";
	public static final String MERCHANT_ID="merchant-123456789";
	public static final String ORDER_ID="order-123456789";
		
	public static void main(String []args) throws Exception
	{
		// setup new payer request
		RealExResponse response=getResponseForRealExSetupNewPayerRequest();
		System.out.println("Response result :"+ response.getResult() );
		System.out.println("Response message :"+ response.getMessage() );
		
	}
	
	
	public static RealExResponse getResponseForRealExSetupNewPayerRequest()throws Exception
	{
		return RealExHttpUtil.getResponse(Constants.REAL_EX_PAYMENTS_URL, getRealExSetupNewPayerRequest());
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
	
	
}
