package com.amandris.clients.service.vo;import java.io.Serializable;import java.util.Date;public class SellerHistoricCredit implements Serializable{	private Integer 		id;	private Integer 		sellerId;	private Integer 		creditActionConst;	private Integer 		credits;	private Integer 		result;	private Date 			date;	private Seller 			seller;		private static final long serialVersionUID = 6526471155622776014L;		public Integer getCreditActionConst() {		return creditActionConst;	}	public void setCreditActionConst(Integer creditActionConst) {		this.creditActionConst = creditActionConst;	}	public Integer getCredits() {		return credits;	}	public void setCredits(Integer credits) {		this.credits = credits;	}	public Date getDate() {		return date;	}	public void setDate(Date date) {		this.date = date;	}	public Integer getId() {		return id;	}	public void setId(Integer id) {		this.id = id;	}	public Integer getResult() {		return result;	}	public void setResult(Integer result) {		this.result = result;	}	public Seller getSeller() {		return seller;	}	public void setSeller(Seller seller) {		this.seller = seller;	}	public Integer getSellerId() {		return sellerId;	}	public void setSellerId(Integer sellerId) {		this.sellerId = sellerId;	}	}