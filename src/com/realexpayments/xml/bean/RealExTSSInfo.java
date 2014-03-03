package com.realexpayments.xml.bean;

import com.realexpayments.xml.bean.annotations.TagName;
import com.realexpayments.xml.bean.annotations.TagValue;

@TagName(name="tssinfo")
public class RealExTSSInfo extends RealExBean{
	@TagValue
	protected RealExTSSAddress billing;
	@TagValue
	protected RealExTSSAddress shipping;
	
	@TagName(name="custnum")
	protected String custNum;
	@TagName(name="varref")
	protected String varref;
	@TagName(name="prodid")
	protected String prodid;
	
	
	

	/**
	 * @return the custNum
	 */
	public String getCustNum() {
		return custNum;
	}

	/**
	 * @param custNum the custNum to set
	 */
	public void setCustNum(String custNum) {
		this.custNum = custNum;
	}

	/**
	 * @return the varref
	 */
	public String getVarref() {
		return varref;
	}

	/**
	 * @param varref the varref to set
	 */
	public void setVarref(String varref) {
		this.varref = varref;
	}

	/**
	 * @return the prodid
	 */
	public String getProdid() {
		return prodid;
	}

	/**
	 * @param prodid the prodid to set
	 */
	public void setProdid(String prodid) {
		this.prodid = prodid;
	}

	/**
	 * @return the billing
	 */
	public RealExTSSAddress getBilling() {
		return billing;
	}

	/**
	 * @param billing the billing to set
	 */
	public void setBilling(RealExTSSAddress billing) {
		this.billing = billing;
	}

	/**
	 * @return the shipping
	 */
	public RealExTSSAddress getShipping() {
		return shipping;
	}

	/**
	 * @param shipping the shipping to set
	 */
	public void setShipping(RealExTSSAddress shipping) {
		this.shipping = shipping;
	}

	public RealExTSSInfo(RealExTSSAddress billing, RealExTSSAddress shipping) {
		super();
		this.billing = billing;
		this.shipping = shipping;
	}
	
	
	

}
