package com.realexpayments.xml.bean;

import com.realexpayments.xml.bean.annotations.TagName;

@TagName(name="mpi")
public class RealExMPI extends RealExBean{
	@TagName(name="cavv")
	protected String cavv;
	@TagName(name="xid")
	protected String xid;
	@TagName(name="eci")
	protected String eci;
	/**
	 * @return the cavv
	 */
	public String getCavv() {
		return cavv;
	}
	/**
	 * @param cavv the cavv to set
	 */
	public void setCavv(String cavv) {
		this.cavv = cavv;
	}
	/**
	 * @return the xid
	 */
	public String getXid() {
		return xid;
	}
	/**
	 * @param xid the xid to set
	 */
	public void setXid(String xid) {
		this.xid = xid;
	}
	/**
	 * @return the eci
	 */
	public String getEci() {
		return eci;
	}
	/**
	 * @param eci the eci to set
	 */
	public void setEci(String eci) {
		this.eci = eci;
	}
	public RealExMPI(String cavv, String xid, String eci) {
		super();
		this.cavv = cavv;
		this.xid = xid;
		this.eci = eci;
	}

	
	
	
	

}
