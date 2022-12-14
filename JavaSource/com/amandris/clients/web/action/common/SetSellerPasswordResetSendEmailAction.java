package com.amandris.clients.web.action.common;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.amandris.clients.service.facade.SellerFacade;
import com.amandris.clients.util.ConfigurationParameterManager;
import com.amandris.clients.util.Constant;
import com.amandris.clients.util.DBUtils;
import com.amandris.clients.util.mail.Mail;
import com.amandris.clients.util.mail.ResetPasswordMailObject;
import com.amandris.clients.web.form.PasswordResetForm;
import com.amandris.clients.web.view.SellerView;
import com.amandris.clients.web.action.common.AbstractAction;

public class SetSellerPasswordResetSendEmailAction extends AbstractAction {

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)throws Exception 
	{
		HttpSession 				session 					= request.getSession();
		Locale						locale						= getRequestLocale( request);
		SellerFacade				sellerFacade				= new SellerFacade();
		PasswordResetForm			passwordResetForm			= null;
		SellerView					sellerView					= null;
		ResetPasswordMailObject		resetPasswordMailObject		= new ResetPasswordMailObject( locale);
		String						code						= "";
		ActionErrors 				errors						= new ActionErrors();
				
		if( ( form == null) || ( form.getClass() != PasswordResetForm.class))
			errors.add( "general", new ActionError( "error.general"));
		
		passwordResetForm = ( PasswordResetForm) form;
				
		sellerView = sellerFacade.getSellerByEmail( passwordResetForm.getEmail(), locale);
			
		if( sellerView == null)
			errors.add( "buyerDoesNotExist", new ActionError( "error.sellerEmailNotExist"));
		else {
			code = generateCode();
			
			if( sellerFacade.setSellerActivationCode( DBUtils.parseInteger( sellerView.getId(), 0), code) == false)
				errors.add( "buyerDoesNotExist", new ActionError( "error.general"));
		}
		
		if( errors.isEmpty() == false) {
			saveErrors	( request, errors);
			saveToken	( request);
			return 		( mapping.findForward( Constant.FAIL));
		}
		
		String text = ConfigurationParameterManager.getMessages().getMessage( locale, "resetPasswordMailObject.subject");
		
		resetPasswordMailObject.setLogin	( sellerView.getLogin());
		resetPasswordMailObject.setCode		( code);
		resetPasswordMailObject.setIsBuyer	( false);
		
		Mail.sendMail( passwordResetForm.getEmail(), text, resetPasswordMailObject);
		
		saveToken(request);

		return ( mapping.findForward( Constant.SUCCESS));
	  }
	
	private String generateCode() 
	{
		String 	chars 	= "123456789abcdefghjkmnpqrstuvwxyzABCDEFGHJKMNPQRSTUVWXYZ";
		String 	code	= "";
		long 	size	= Math.round( ( Math.random() * 6) + 12);
		
		while( code.length() < size){
	      code = code + chars.charAt( ( int) Math.round( Math.random() * ( chars.length() - 1)));
		}
		
		return code;
	}
	
}		
