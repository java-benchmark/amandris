package com.amandris.clients.web.action.seller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.amandris.clients.service.facade.SellerFacade;
import com.amandris.clients.util.Constant;
import com.amandris.clients.web.form.SellerPreferencesForm;
import com.amandris.clients.web.util.SellerSession;
import com.amandris.clients.web.action.common.AbstractAction;

public class SetSellerPreferencesAction extends AbstractAction {

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)throws Exception 
	{
		HttpSession 			session 				= request.getSession();
		Locale					locale					= getRequestLocale( request);
		SellerFacade			sellerFacade			= new SellerFacade();
		SellerPreferencesForm	sellerPreferencesForm	= null;
		
		SellerSession sellerSession = ( SellerSession)session.getAttribute( Constant.SELLER_SESSION_OBJECT_NAME);
		
		if( sellerSession == null)
			return ( mapping.findForward( Constant.SESSION));
		
		if( ( form == null) || ( form.getClass() != SellerPreferencesForm.class))
			return error( "error.couldNotSetSellerPreferences", request, mapping);
		
		sellerPreferencesForm = ( SellerPreferencesForm) form;

		if( sellerFacade.setSellerPreferences( sellerPreferencesForm, sellerSession, locale) == false)
			return error( "error.couldNotSetSellerPreferences", request, mapping);
		
		sellerSession = sellerFacade.getSellerSessionByLoginAndPassword( sellerSession.getLogin(), sellerSession.getPassword(), true, locale);
		
		if( sellerSession == null)
			return error( "error.couldNotSetSellerPreferences", request, mapping);
		
		session.setAttribute( Constant.SELLER_SESSION_OBJECT_NAME, sellerSession);
		
		saveToken(request);

		return ( mapping.findForward( Constant.SUCCESS));
	  }
	
}		
