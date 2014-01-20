package com.realexpayments.xml;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import com.realexpayments.request.RealExSetupNewPayerRequest;
import com.realexpayments.xml.bean.RealExComment;
import com.realexpayments.xml.bean.RealExComments;
import com.realexpayments.xml.bean.RealExCountryCode;
import com.realexpayments.xml.bean.RealExPayer;
import com.realexpayments.xml.bean.RealExPayerAddress;
import com.realexpayments.xml.bean.RealExPayerPhoneNumbers;
import com.realexpayments.xml.util.HashingUtil;
import com.realexpayments.xml.util.RealExBeanToXMLConverterUtil;

public class MainClass {

	public static void main(String []args) throws Exception
	{
		List<RealExComment> comment=new ArrayList<>();
		comment.add(new RealExComment("id1", "comment1"));
		comment.add(new RealExComment("id2", "comment2"));
		RealExComments comments=new RealExComments(comment);
		RealExCountryCode country=new RealExCountryCode("IN", "India");
		RealExPayerPhoneNumbers phone=new RealExPayerPhoneNumbers("+9104424727707", "+9104424727707", "+9104424727707", "+9104424727707");
		RealExPayerAddress address=new RealExPayerAddress("line1", "line2", "line3", "city", "county", "12345", country);
		RealExPayer payer=new RealExPayer("Business", "smithj01", "Mr", "John", "Smith", "Acme Inc", address, phone, "kgsnipes@gmail.com", comments);
		RealExSetupNewPayerRequest request=new RealExSetupNewPayerRequest("payer-new", "20030516175919", "yourmerchantid", "uniqueid", "7daf026b193eb18344f5ab6822cd05959718c567", payer, comments);
		String xml=RealExBeanToXMLConverterUtil.toXML(request);
		System.out.println(Files.toString(new File("D:\\Users\\kaushik.ganguly\\Documents\\sample_response.txt"), Charsets.UTF_8));
		System.out.println(HashingUtil.getSHAHashForNewPayer("sharedSecret","432354325", "fdg", "54654", "12.00", "USD", "smith"));
	    System.out.println(RealExBeanToXMLConverterUtil.toResponseBean(Files.toString(new File("D:\\Users\\kaushik.ganguly\\Documents\\sample_response.txt"), Charsets.UTF_8)).getAuthcode());
		System.out.println(xml);
	}
}
