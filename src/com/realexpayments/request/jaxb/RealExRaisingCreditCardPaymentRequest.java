package com.realexpayments.request.jaxb;

import com.realexpayments.xml.bean.RealExAmount;
import com.realexpayments.xml.bean.RealExAutoSettle;
import com.realexpayments.xml.bean.RealExBean;
import com.realexpayments.xml.bean.RealExCard;
import com.realexpayments.xml.bean.RealExComments;
import com.realexpayments.xml.bean.RealExDCCInfo;
import com.realexpayments.xml.bean.RealExMPI;
import com.realexpayments.xml.bean.RealExPaymentData;
import com.realexpayments.xml.bean.RealExSupplementaryData;
import com.realexpayments.xml.bean.RealExTSSInfo;
import com.realexpayments.xml.bean.annotations.TagAttribute;
import com.realexpayments.xml.bean.annotations.TagName;

@TagName(name="request")
public class RealExRaisingCreditCardPaymentRequest extends RealExRequest{
	@TagAttribute(name="type")
	protected String type="receipt-in";
	@TagAttribute(name="timestamp")
	protected String timestamp;
	@TagName(name="merchantid")
	protected String merchantId;
	@TagName(name="account")
	protected String account;
	@TagName(name="orderid")
	protected String orderId;
	
	protected RealExPaymentData paymentData;
	protected RealExMPI mpi;
	protected RealExDCCInfo dccInfo;
	protected RealExAmount amount;
	@TagName(name="payerref")
	protected String payerRef;
	@TagName(name="paymentmethod")
	protected String paymentmethod;
	protected RealExAutoSettle autoSettle;
	
	
	@TagName(name="sha1hash")
	protected String sha1hash;
	
	protected RealExComments comments;
	
	protected RealExTSSInfo tssinfo;
	
	protected RealExSupplementaryData supplementaryData;

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
	 * @return the paymentData
	 */
	public RealExPaymentData getPaymentData() {
		return paymentData;
	}

	/**
	 * @param paymentData the paymentData to set
	 */
	public void setPaymentData(RealExPaymentData paymentData) {
		this.paymentData = paymentData;
	}

	/**
	 * @return the mpi
	 */
	public RealExMPI getMpi() {
		return mpi;
	}

	/**
	 * @param mpi the mpi to set
	 */
	public void setMpi(RealExMPI mpi) {
		this.mpi = mpi;
	}

	/**
	 * @return the dccInfo
	 */
	public RealExDCCInfo getDccInfo() {
		return dccInfo;
	}

	/**
	 * @param dccInfo the dccInfo to set
	 */
	public void setDccInfo(RealExDCCInfo dccInfo) {
		this.dccInfo = dccInfo;
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
	 * @return the payerRef
	 */
	public String getPayerRef() {
		return payerRef;
	}

	/**
	 * @param payerRef the payerRef to set
	 */
	public void setPayerRef(String payerRef) {
		this.payerRef = payerRef;
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
	 * @return the autoSettle
	 */
	public RealExAutoSettle getAutoSettle() {
		return autoSettle;
	}

	/**
	 * @param autoSettle the autoSettle to set
	 */
	public void setAutoSettle(RealExAutoSettle autoSettle) {
		this.autoSettle = autoSettle;
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

	/**
	 * @return the tssinfo
	 */
	public RealExTSSInfo getTssinfo() {
		return tssinfo;
	}

	/**
	 * @param tssinfo the tssinfo to set
	 */
	public void setTssinfo(RealExTSSInfo tssinfo) {
		this.tssinfo = tssinfo;
	}

	/**
	 * @return the supplementaryData
	 */
	public RealExSupplementaryData getSupplementaryData() {
		return supplementaryData;
	}

	/**
	 * @param supplementaryData the supplementaryData to set
	 */
	public void setSupplementaryData(RealExSupplementaryData supplementaryData) {
		this.supplementaryData = supplementaryData;
	}

	public RealExRaisingCreditCardPaymentRequest(String timestamp,
			String merchantId, String account, String orderId,
			RealExPaymentData paymentData, RealExMPI mpi,
			RealExDCCInfo dccInfo, RealExAmount amount, String payerRef,
			String paymentmethod, RealExAutoSettle autoSettle, String sha1hash,
			RealExComments comments, RealExTSSInfo tssinfo,
			RealExSupplementaryData supplementaryData) {
		super();
		
		this.timestamp = timestamp;
		this.merchantId = merchantId;
		this.account = account;
		this.orderId = orderId;
		this.paymentData = paymentData;
		this.mpi = mpi;
		this.dccInfo = dccInfo;
		this.amount = amount;
		this.payerRef = payerRef;
		this.paymentmethod = paymentmethod;
		this.autoSettle = autoSettle;
		this.sha1hash = sha1hash;
		this.comments = comments;
		this.tssinfo = tssinfo;
		this.supplementaryData = supplementaryData;
	}
	
	

	
	
	

}
