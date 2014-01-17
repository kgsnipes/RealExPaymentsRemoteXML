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

}
