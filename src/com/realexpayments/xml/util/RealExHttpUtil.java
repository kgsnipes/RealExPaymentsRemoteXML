package com.realexpayments.xml.util;

import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;

import com.realexpayments.request.RealExRequest;
import com.realexpayments.response.RealExResponse;

public class RealExHttpUtil {
	
	public static RealExResponse getResponse(String url,RealExRequest request)throws Exception
	{
		RealExResponse retVal=null;
		
		retVal=RealExBeanToXMLConverterUtil.toResponseBean(Request.Post(url).bodyString(RealExBeanToXMLConverterUtil.toXML(request), ContentType.APPLICATION_XML).execute().returnContent().asString());
		
		return retVal;
	}

}
