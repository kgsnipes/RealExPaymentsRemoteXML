package com.realexpayments.request;

import com.realexpayments.xml.bean.RealExAmount;
import com.realexpayments.xml.bean.RealExAutoSettle;
import com.realexpayments.xml.bean.RealExBean;
import com.realexpayments.xml.bean.RealExCard;
import com.realexpayments.xml.bean.RealExComments;
import com.realexpayments.xml.bean.annotations.TagAttribute;
import com.realexpayments.xml.bean.annotations.TagName;

@TagName(name="request")
public class RealEx3DSecuredEnabledRequest extends RealExRequest{
	@TagAttribute(name="type")
	protected String type="realvault-3ds-verifyenrolled";
	@TagAttribute(name="timestamp")
	protected String timestamp;
	@TagName(name="merchantid")
	protected String merchantId;
	@TagName(name="account")
	protected String account;
	@TagName(name="orderid")
	protected String orderId;
	
	protected RealExAmount amount;
	@TagName(name="payerref")
	protected String payerref;
	@TagName(name="paymentmethod")
	protected String paymentmethod;
	
	protected RealExAutoSettle autosettle;
	
	@TagName(name="sha1hash")
	protected String sha1hash;
	
	protected RealExComments comments;

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * @return the merchantId
	 */
	public String getMerchantId() {
		return merchantId;
	}

	/**
	 * @param merchantId the merchantId to set
	 */
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	/**
	 * @return the account
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * @param account the account to set
	 */
	public void setAccount(String account) {
		this.account = account;
	}

	/**
	 * @return the orderId
	 */
	public String getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the amount
	 */
	public RealExAmount getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(RealExAmount amount) {
		this.amount = amount;
	}

	/**
	 * @return the payerref
	 */
	public String getPayerref() {
		return payerref;
	}

	/**
	 * @param payerref the payerref to set
	 */
	public void setPayerref(String payerref) {
		this.payerref = payerref;
	}

	/**
	 * @return the paymentmethod
	 */
	public String getPaymentmethod() {
		return paymentmethod;
	}

	/**
	 * @param paymentmethod the paymentmethod to set
	 */
	public void setPaymentmethod(String paymentmethod) {
		this.paymentmethod = paymentmethod;
	}

	/**
	 * @return the autosettle
	 */
	public RealExAutoSettle getAutosettle() {
		return autosettle;
	}

	/**
	 * @param autosettle the autosettle to set
	 */
	public void setAutosettle(RealExAutoSettle autosettle) {
		this.autosettle = autosettle;
	}

	/**
	 * @return the sha1hash
	 */
	public String getSha1hash() {
		return sha1hash;
	}

	/**
	 * @param sha1hash the sha1hash to set
	 */
	public void setSha1hash(String sha1hash) {
		this.sha1hash = sha1hash;
	}

	/**
	 * @return the comments
	 */
	public RealExComments getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(RealExComments comments) {
		this.comments = comments;
	}

	public RealEx3DSecuredEnabledRequest( String timestamp,
			String merchantId, String account, String orderId,
			RealExAmount amount, String payerref, String paymentmethod,
			RealExAutoSettle autosettle, String sha1hash,
			RealExComments comments) {
		super();
		
		this.timestamp = timestamp;
		this.merchantId = merchantId;
		this.account = account;
		this.orderId = orderId;
		this.amount = amount;
		this.payerref = payerref;
		this.paymentmethod = paymentmethod;
		this.autosettle = autosettle;
		this.sha1hash = sha1hash;
		this.comments = comments;
	}
	
	
	
	
	
	
	

}
