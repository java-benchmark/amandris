package com.amandris.clients.web.form;


import java.io.Serializable;
import org.apache.struts.validator.ValidatorForm;

public class BuyerPasswordForm extends ValidatorForm implements Serializable{

	private String presentPassword;
	private String password;
	private String repeatPassword;
	
		
	private static final long serialVersionUID = 123410125373276264L;


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPresentPassword() {
		return presentPassword;
	}


	public void setPresentPassword(String presentPassword) {
		this.presentPassword = presentPassword;
	}


	public String getRepeatPassword() {
		return repeatPassword;
	}


	public void setRepeatPassword(String repeatPassword) {
		this.repeatPassword = repeatPassword;
	}


		
}
