package com.realexpayments.xml.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

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
			
				ele.addAttribute(getFieldAnnotationValue(f, TagAttribute.class, "name"), f.get(obj).toString());
			}
			else if(f.get(obj)instanceof RealExBean)
			{
			
				ele.add(getElementFromBean(f.get(obj)));
			}
			else if(f.isAnnotationPresent(TagName.class) && !f.get(obj).getClass().isAssignableFrom(RealExBean.class))
			{
				
				ele.add(DocumentHelper.createElement(getFieldAnnotationValue(f, TagName.class, "name")).addText(f.get(obj).toString()));
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

}
