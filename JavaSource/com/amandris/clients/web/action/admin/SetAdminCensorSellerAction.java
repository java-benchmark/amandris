package com.amandris.clients.web.action.admin;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.amandris.clients.service.facade.SellerFacade;
import com.amandris.clients.util.Constant;
import com.amandris.clients.web.form.AdminCensorSellerForm;
import com.amandris.clients.web.util.AdminSession;
import com.amandris.clients.web.action.common.AbstractAction;

public class SetAdminCensorSellerAction extends AbstractAction {

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)throws Exception 
	{
		HttpSession 			session 				= request.getSession();
		Locale					locale					= getRequestLocale( request);
		SellerFacade			sellerFacade			= new SellerFacade();
		AdminCensorSellerForm	adminCensorSellerForm	= null;
	
		AdminSession adminSession = ( AdminSession)session.getAttribute( Constant.ADMIN_SESSION_OBJECT_NAME);
		
		if( adminSession == null)
			return ( mapping.findForward( Constant.ADMIN_SESSION_FAIL));
		
		adminCensorSellerForm = ( AdminCensorSellerForm) form;
				
		if( sellerFacade.setSellerCensor( adminCensorSellerForm) == false)
			return error( "error.general", request, mapping);
				
		saveToken(request);

		return ( mapping.findForward( Constant.SUCCESS));
	  }
	
}		
