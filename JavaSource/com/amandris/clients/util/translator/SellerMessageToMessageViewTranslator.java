package com.amandris.clients.util.translator;import com.amandris.clients.service.vo.SellerMessage;import com.amandris.clients.util.DBUtils;import com.amandris.clients.util.exception.TranslateValueObjectErrorException;import com.amandris.clients.web.view.MessageView;public class SellerMessageToMessageViewTranslator extends Translator {	public Object translateView() throws TranslateValueObjectErrorException	{		MessageView 	messageView 	= new MessageView();		SellerMessage	sellerMessage	= ( SellerMessage) object;				try{			messageView.setId					( DBUtils.controlNull( sellerMessage.getId()));			messageView.setActive				( DBUtils.controlNull( sellerMessage.getActive()));			messageView.setSellerId				( DBUtils.controlNull( sellerMessage.getSellerId()));			messageView.setDate					( DBUtils.getDate( sellerMessage.getDate(), 3));			messageView.setIsNew				( DBUtils.controlNull( sellerMessage.getIsNew()));			messageView.setIsHtml				( DBUtils.controlNull( sellerMessage.getIsHtml()));			messageView.setSender				( DBUtils.controlNull( sellerMessage.getSender()));			messageView.setBriefSubject			( DBUtils.briefString( sellerMessage.getSubject(), 30));			messageView.setSubject				( DBUtils.controlNull( sellerMessage.getSubject()));			messageView.setText					( DBUtils.controlNull( sellerMessage.getText()));		}catch( Exception e) {			throw new TranslateValueObjectErrorException( object.getClass().getName(), messageView.getClass().getName(), e);		}				return messageView;	}}