package com.realexpayments.xml.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import com.google.common.base.Charsets;
import com.google.common.base.Strings;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;
import com.realexpayments.xml.bean.RealExBean;
import com.realexpayments.xml.bean.RealExResponse;
import com.realexpayments.xml.bean.annotations.TagAttribute;
import com.realexpayments.xml.bean.annotations.TagName;

public class RealExBeanToXMLConverterUtil {
	
	public static String toXML(RealExBean bean) throws Exception
	{
		String retVal=null;
		Document document = DocumentHelper.createDocument();
		//Element root = document.addElement( getClassAnnotationValue(bean.getClass(), TagName.class, "name") );
		document.add(getElementFromBean(bean));
		retVal=document.asXML();
		return retVal;
	}
	
	private static Element getElementFromBean(Object obj) throws Exception
	{
		Element ele=DocumentHelper.createElement(getClassAnnotationValue(obj.getClass(), TagName.class, "name"));
		for(Field f:getFields(obj.getClass()))
		{
			f.setAccessible(true);
			
			
			if(f.isAnnotationPresent(TagAttribute.class))
			{
			
				ele.addAttribute(getFieldAnnotationValue(f, TagAttribute.class, "name"), Strings.nullToEmpty((String)f.get(obj)).toString());
			}
			else if(f.get(obj)instanceof RealExBean)
			{
				if(f.get(obj)!=null)
					ele.add(getElementFromBean(f.get(obj)));
			}
			else if(f.get(obj)instanceof List && f.isAnnotationPresent(TagName.class))
			{
				for(Object ob:(List)f.get(obj))
				{
					if(ob!=null)
						ele.add(getElementFromBean(ob));
				}
				
			}
			else if(f.isAnnotationPresent(TagName.class) && !f.get(obj).getClass().isAssignableFrom(RealExBean.class))
			{
				
				ele.add(DocumentHelper.createElement(getFieldAnnotationValue(f, TagName.class, "name")).addText(Strings.nullToEmpty((String)f.get(obj)).toString()));
			}
			else if(!f.isAnnotationPresent(TagName.class)&& !f.isAnnotationPresent(TagAttribute.class) && !f.get(obj).getClass().isAssignableFrom(RealExBean.class))
			{
				
				ele.addText(Strings.nullToEmpty((String)f.get(obj)).toString());
			}
		}
		return ele;
	}
	
	private static Field getField(Class clazz, String fieldName)
	        throws NoSuchFieldException {
	    try {
	      return clazz.getDeclaredField(fieldName);
	    } catch (NoSuchFieldException e) {
	      Class superClass = clazz.getSuperclass();
	      if (superClass == null) {
	        throw e;
	      } else {
	        return getField(superClass, fieldName);
	      }
	    }
	  }
	
	private static Field[] getFields(Class clazz)
	        throws Exception {
	    return clazz.getDeclaredFields();
	  }
	
	
	
	private static String getClassAnnotationValue(Class classType, Class annotationType, String attributeName) {
        String value = null;
 
        Annotation annotation = classType.getAnnotation(annotationType);
        if (annotation != null) {
            try {
                value = (String) annotation.annotationType().getMethod(attributeName).invoke(annotation);
            } catch (Exception ex) {
            }
        }
 
        return value;
    }
	
	private static String getFieldAnnotationValue(Field f, Class annotationType, String attributeName) {
        String value = null;
 
        Annotation annotation = f.getAnnotation(annotationType);
        if (annotation != null) {
            try {
                value = (String) annotation.annotationType().getMethod(attributeName).invoke(annotation);
            } catch (Exception ex) {
            }
        }
 
        return value;
    }
	
	
	
	public static RealExResponse toResponseBean(String xml) throws Exception
	{
		RealExResponse retVal=null;
		 Document document = DocumentHelper.parseText(xml);
		 Node response=document.selectSingleNode( "/response" );
		if(response!=null)
		{
			String timestamp=(document.selectSingleNode( "/response" )!=null)?document.selectSingleNode( "/response" ).valueOf("@timestamp"):null;
			String merchantId=(document.selectSingleNode( "/response/merchantid" )!=null)?document.selectSingleNode( "/response/merchantid" ).getText():null;
			String account=(document.selectSingleNode( "/response/account" )!=null)?document.selectSingleNode( "/response/account" ).getText():null;
			String orderId=(document.selectSingleNode( "/response/orderid" )!=null)?document.selectSingleNode( "/response/orderid" ).getText():null;
			String result=(document.selectSingleNode( "/response/result" )!=null)?document.selectSingleNode( "/response/result" ).getText():null;
			String message=(document.selectSingleNode( "/response/message" )!=null)?document.selectSingleNode( "/response/message" ).getText():null;
			String pasref=(document.selectSingleNode( "/response/pasref" )!=null)?document.selectSingleNode( "/response/pasref" ).getText():null;
			String authcode=(document.selectSingleNode( "/response/authcode" )!=null)?document.selectSingleNode( "/response/authcode" ).getText():null;
			String batchId=(document.selectSingleNode( "/response/batchid" )!=null)?document.selectSingleNode( "/response/batchid" ).getText():null;
			String timetaken=(document.selectSingleNode( "/response/timetaken" )!=null)?document.selectSingleNode( "/response/timetaken" ).getText():null;
			String processingtimetaken=(document.selectSingleNode( "/response/processingtimetaken" )!=null)?document.selectSingleNode( "/response/processingtimetaken" ).getText():null;
			String md5hash=(document.selectSingleNode( "/response/md5hash" )!=null)?document.selectSingleNode( "/response/md5hash" ).getText():null;
			String sha1hash=(document.selectSingleNode( "/response/sha1hash" )!=null)?document.selectSingleNode( "/response/sha1hash" ).getText():null;
			
			retVal=new RealExResponse(timestamp, merchantId, account, orderId, result, message, pasref, authcode, batchId, timetaken, processingtimetaken, md5hash, sha1hash);
		}
	
		
		return retVal;
	}
	
	

}
