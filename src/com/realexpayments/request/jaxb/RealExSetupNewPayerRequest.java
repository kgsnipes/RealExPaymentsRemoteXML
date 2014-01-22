package com.realexpayments.request.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.realexpayments.xml.bean.jaxb.RealExComments;
import com.realexpayments.xml.bean.jaxb.RealExPayer;

@XmlRootElement(name="request")
public class RealExSetupNewPayerRequest extends RealExRequest{
	@XmlAttribute(name="type")
	protected String type="payer-new";
	@XmlAttribute(name="timestamp")
	protected String timestamp;
	@XmlElement(name="merchantid")
	protected String merchantId;
	@XmlElement(name="orderid")
	protected String orderId;
	@XmlElement(name="sha1hash")
	protected String sha1hash;
	@XmlElement
	protected RealExPayer payer;
	@XmlElement
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
	 * @return the payer
	 */
	public RealExPayer getPayer() {
		return payer;
	}
	/**
	 * @param payer the payer to set
	 */
	public void setPayer(RealExPayer payer) {
		this.payer = payer;
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
	public RealExSetupNewPayerRequest( String timestamp,
			String merchantId, String orderId, String sha1hash,
			RealExPayer payer, RealExComments comments) {
		super();
		
		this.timestamp = timestamp;
		this.merchantId = merchantId;
		this.orderId = orderId;
		this.sha1hash = sha1hash;
		this.payer = payer;
		this.comments = comments;
	}
	
	
	
	

}
