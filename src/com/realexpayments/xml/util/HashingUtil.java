package com.realexpayments.xml.util;

import com.google.common.base.Charsets;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

public class HashingUtil {
	
	public static String getSHAHashForNewPayer(String sharedSecret,String timestamp,String merchantId,String orderId,String amount,String currencyPref,String payeeRef)
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
		HashCode hc2 = hf.newHasher()
			       .putString(hc.toString(), Charsets.UTF_8)
			       .putString(".", Charsets.UTF_8)
			       .putString(sharedSecret, Charsets.UTF_8)
			       .hash();
		retVal=hc2.toString();
		
		return retVal;
	}
	public static String getSHAHashForAddCardDetails(String sharedSecret,String timestamp,String merchantId,String orderId,String amount,String currencyPref,String payeeRef,String chName,String cardNumber)
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
		       .putString(".", Charsets.UTF_8)
		       .putString(chName, Charsets.UTF_8)
		       .putString(".", Charsets.UTF_8)
		       .putString(cardNumber, Charsets.UTF_8)
		       .hash();
		HashCode hc2 = hf.newHasher()
			       .putString(hc.toString(), Charsets.UTF_8)
			       .putString(".", Charsets.UTF_8)
			       .putString(sharedSecret, Charsets.UTF_8)
			       .hash();
		retVal=hc2.toString();
		
		return retVal;
	}
	
	public static String getSHAHashForEditExistingPayer(String sharedSecret,String timestamp,String merchantId,String orderId,String amount,String currencyPref,String payeeRef)
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
		HashCode hc2 = hf.newHasher()
			       .putString(hc.toString(), Charsets.UTF_8)
			       .putString(".", Charsets.UTF_8)
			       .putString(sharedSecret, Charsets.UTF_8)
			       .hash();
		retVal=hc2.toString();
		
		return retVal;
	}
	
	
	public static String getSHAHashForUpdateCard(String sharedSecret,String timestamp,String merchantId,String payeeRef,String ref,String expiryDate,String cardNumber)
	{
		String retVal="";
		HashFunction hf = Hashing.sha1();
		HashCode hc = hf.newHasher()
		       .putString(timestamp, Charsets.UTF_8)
		       .putString(".", Charsets.UTF_8)
		       .putString(merchantId, Charsets.UTF_8)
		       .putString(".", Charsets.UTF_8)
		       .putString(payeeRef, Charsets.UTF_8)
		       .putString(".", Charsets.UTF_8)
		       .putString(ref, Charsets.UTF_8)
		       .putString(".", Charsets.UTF_8)
		       .putString(expiryDate, Charsets.UTF_8)
		       .putString(".", Charsets.UTF_8)
		       .putString(cardNumber, Charsets.UTF_8)
		       .hash();
		HashCode hc2 = hf.newHasher()
			       .putString(hc.toString(), Charsets.UTF_8)
			       .putString(".", Charsets.UTF_8)
			       .putString(sharedSecret, Charsets.UTF_8)
			       .hash();
		retVal=hc2.toString();
		
		return retVal;
	}
	
	public static String getSHAHashForDeleteCard(String sharedSecret,String timestamp,String merchantId,String payeeRef,String pmtref)
	{
		String retVal="";
		HashFunction hf = Hashing.sha1();
		HashCode hc = hf.newHasher()
		       .putString(timestamp, Charsets.UTF_8)
		       .putString(".", Charsets.UTF_8)
		       .putString(merchantId, Charsets.UTF_8)
		       .putString(".", Charsets.UTF_8)
		       .putString(payeeRef, Charsets.UTF_8)
		       .putString(".", Charsets.UTF_8)
		       .putString(pmtref, Charsets.UTF_8)
		       .hash();
		HashCode hc2 = hf.newHasher()
			       .putString(hc.toString(), Charsets.UTF_8)
			       .putString(".", Charsets.UTF_8)
			       .putString(sharedSecret, Charsets.UTF_8)
			       .hash();
		retVal=hc2.toString();
		
		return retVal;
	}

}