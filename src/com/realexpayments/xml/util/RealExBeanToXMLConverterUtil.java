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
	
	public static String getSHAHashForNewPayer(String timestamp,String merchantId,String orderId,String amount,String currencyPref,String payeeRef)
	{
		String retVal="";
		HashFunction hf = Hashing.sha1();
		HashCode hc = hf.newHasher()
		       .putString(timestamp, Charsets.UTF_8)
		       .putString(".", Charsets.UTF_8)
		       .putString(merchantId, Charsets.UTF_8)
		       .putString(".", Charsets.UTF_8)
		       .putString(orderId, Charsets.UTF_8)
		       .putString(".", Charsets.UTF_8)
		       .putString(amount, Charsets.UTF_8)
		       .putString(".", Charsets.UTF_8)
		       .putString(currencyPref, Charsets.UTF_8)
		       .putString(".", Charsets.UTF_8)
		       .putString(payeeRef, Charsets.UTF_8)
		       .hash();
		retVal=hc.toString();
		
		return retVal;
	}
	
	public static String toBean(RealExBean bean) throws Exception
	{
		String retVal=null;
		Document document = DocumentHelper.createDocument();
		//Element root = document.addElement( getClassAnnotationValue(bean.getClass(), TagName.class, "name") );
		document.add(getElementFromBean(bean));
		retVal=document.asXML();
		return retVal;
	}
	
	public Document parse(String xml) throws DocumentException {
	        Document document = DocumentHelper.parseText(xml);
	        return document;
	    }
	
	public void treeWalk(Document document) {
        treeWalk( document.getRootElement() );
    }

    public void treeWalk(Element element) {
        for ( int i = 0, size = element.nodeCount(); i < size; i++ ) {
            Node node = element.node(i);
            if ( node instanceof Element ) {
                treeWalk( (Element) node );
            }
            else {
                // do something....
            }
        }
    }

}
