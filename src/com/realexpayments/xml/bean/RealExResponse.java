package com.realexpayments.xml.bean;


public class RealExResponse extends RealExBean{
	
	protected String timestamp;
	
	protected String merchantId;
	
	protected String  account;
	
	protected String orderId;
	
	protected String result;
	
	protected String message;
	
	protected String pasref;
	
	protected String authcode;
	
	protected String batchId;
	
	protected String timetaken;
	
	protected String processingtimetaken;
	
	protected String md5hash;
	
	protected String sha1hash;

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPasref() {
		return pasref;
	}

	public void setPasref(String pasref) {
		this.pasref = pasref;
	}

	public String getAuthcode() {
		return authcode;
	}

	public void setAuthcode(String authcode) {
		this.authcode = authcode;
	}

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getTimetaken() {
		return timetaken;
	}

	public void setTimetaken(String timetaken) {
		this.timetaken = timetaken;
	}

	public String getProcessingtimetaken() {
		return processingtimetaken;
	}

	public void setProcessingtimetaken(String processingtimetaken) {
		this.processingtimetaken = processingtimetaken;
	}

	public String getMd5hash() {
		return md5hash;
	}

	public void setMd5hash(String md5hash) {
		this.md5hash = md5hash;
	}

	public String getSha1hash() {
		return sha1hash;
	}

	public void setSha1hash(String sha1hash) {
		this.sha1hash = sha1hash;
	}

	public RealExResponse(String timestamp, String merchantId, String account,
			String orderId, String result, String message, String pasref,
			String authcode, String batchId, String timetaken,
			String processingtimetaken, String md5hash, String sha1hash) {
		super();
		this.timestamp = timestamp;
		this.merchantId = merchantId;
		this.account = account;
		this.orderId = orderId;
		this.result = result;
		this.message = message;
		this.pasref = pasref;
		this.authcode = authcode;
		this.batchId = batchId;
		this.timetaken = timetaken;
		this.processingtimetaken = processingtimetaken;
		this.md5hash = md5hash;
		this.sha1hash = sha1hash;
	}
	
	
	

}
