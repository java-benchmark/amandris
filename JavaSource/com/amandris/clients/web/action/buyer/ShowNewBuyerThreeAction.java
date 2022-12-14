package com.amandris.clients.web.action.buyer;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.amandris.clients.service.facade.BuyerFacade;
import com.amandris.clients.util.Constant;
import com.amandris.clients.web.form.NewBuyerForm;
import com.amandris.clients.web.action.common.AbstractAction;


public class ShowNewBuyerThreeAction extends AbstractAction {

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)throws Exception 
	{
		HttpSession 		session 		= request.getSession();
		Locale				locale			= getRequestLocale( request);
		BuyerFacade			buyerFacade		= new BuyerFacade();
		NewBuyerForm		newBuyerForm	= null;
		
		if( ( form == null) || ( form.getClass() != NewBuyerForm.class))
			return error( "error.couldNotSetNewBuyer", request, mapping);
		
		newBuyerForm = ( NewBuyerForm) form;
		
		saveToken(request);

		return ( mapping.findForward( Constant.SUCCESS));
	  }
}		
