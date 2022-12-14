package com.amandris.clients.web.action.admin;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.amandris.clients.service.dao.SellerDAO;
import com.amandris.clients.service.vo.Seller;
import com.amandris.clients.util.Constant;
import com.amandris.clients.util.DBUtils;
import com.amandris.clients.web.action.common.AbstractAction;
import com.amandris.clients.web.form.AdminEditSellerForm;
import com.amandris.clients.web.util.AdminSession;

public class ShowAdminSellerAction extends AbstractAction {

	public ActionForward execute( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)throws Exception 
	{
		HttpSession 			session 				= request.getSession();
		SellerDAO 				sellerDAO 				= new SellerDAO();
		Seller					seller					= null;
		Locale					locale					= null;
		AdminEditSellerForm		adminEditSellerForm		= new AdminEditSellerForm();

		AdminSession adminSession = ( AdminSession)session.getAttribute( Constant.ADMIN_SESSION_OBJECT_NAME);
		
		locale = getLocale( request);
		
		if( adminSession == null)
			return ( mapping.findForward( Constant.ADMIN_SESSION_FAIL));
		
		seller = sellerDAO.getSellerById( DBUtils.parseInteger( request.getParameter( "id"), 0));

		if( seller != null){
			BeanUtils.copyProperties( adminEditSellerForm, seller);
		
			session.setAttribute( Constant.ADMIN_EDIT_SELLER_FORM_OBJECT_NAME, adminEditSellerForm);
		
			saveToken(request);
		} else {
			session.removeAttribute( Constant.ADMIN_EDIT_SELLER_FORM_OBJECT_NAME);
		}

		return ( mapping.findForward( Constant.SUCCESS));
	  }
}		
