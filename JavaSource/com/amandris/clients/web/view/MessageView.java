package com.amandris.clients.web.view;import org.apache.struts.action.ActionForm;public class MessageView extends ActionForm{	private String 	id;	private String 	buyerId;	private String 	sellerId;	private String 	sender;	private String  active;	private String  subject;	private String  briefSubject;	private String  text;	private String  isNew;	private String  isHtml;	private String  date;	private String  oddOrEven;		private static final long serialVersionUID = 1526471155622776010L;		public MessageView()	{		id					= "";		buyerId				= "";		sellerId			= "";		sender				= "";		active				= "";		subject				= "";		briefSubject		= "";		text				= "";		isNew				= "";		isHtml				= "";		date				= "";		oddOrEven			= "";	}	public String getActive() {		return active;	}	public void setActive(String active) {		this.active = active;	}	public String getBuyerId() {		return buyerId;	}	public void setBuyerId(String buyerId) {		this.buyerId = buyerId;	}	public String getDate() {		return date;	}	public void setDate(String date) {		this.date = date;	}	public String getId() {		return id;	}	public void setId(String id) {		this.id = id;	}	public String getIsNew() {		return isNew;	}	public void setIsNew(String isNew) {		this.isNew = isNew;	}	public String getSender() {		return sender;	}	public void setSender(String sender) {		this.sender = sender;	}	public String getSubject() {		return subject;	}	public void setSubject(String subject) {		this.subject = subject;	}	public String getText() {		return text;	}	public void setText(String text) {		this.text = text;	}	public String getOddOrEven() {		return oddOrEven;	}	public void setOddOrEven(String oddOrEven) {		this.oddOrEven = oddOrEven;	}	public String getBriefSubject() {		return briefSubject;	}	public void setBriefSubject(String briefSubject) {		this.briefSubject = briefSubject;	}	public String getIsHtml() {		return isHtml;	}	public void setIsHtml(String isHtml) {		this.isHtml = isHtml;	}	public String getSellerId() {		return sellerId;	}	public void setSellerId(String sellerId) {		this.sellerId = sellerId;	}				}