package com.amandris.clients.web.form;


import java.io.Serializable;
import org.apache.struts.validator.ValidatorForm;

public class ContactMessageForm extends ValidatorForm implements Serializable{

		private String text;
		private String sellerId;
		private String sellerLogin;
		private String buyerId;
		private String buyerLogin;
		private String contactId;	
		
		private static final long serialVersionUID = 8227431654621176804L;
		
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		public String getSellerId() {
			return sellerId;
		}
		public void setSellerId(String sellerId) {
			this.sellerId = sellerId;
		}
		public String getSellerLogin() {
			return sellerLogin;
		}
		public void setSellerLogin(String sellerLogin) {
			this.sellerLogin = sellerLogin;
		}
		public String getContactId() {
			return contactId;
		}
		public void setContactId(String contactId) {
			this.contactId = contactId;
		}
		public String getBuyerId() {
			return buyerId;
		}
		public void setBuyerId(String buyerId) {
			this.buyerId = buyerId;
		}
		public String getBuyerLogin() {
			return buyerLogin;
		}
		public void setBuyerLogin(String buyerLogin) {
			this.buyerLogin = buyerLogin;
		}
		
		
		
}
