package com.amandris.clients.util.translator;import com.amandris.clients.service.vo.VoteToBuyer;import com.amandris.clients.util.DBUtils;import com.amandris.clients.util.exception.TranslateValueObjectErrorException;import com.amandris.clients.web.view.VoteView;public class VoteToBuyerToVoteViewTranslator extends Translator {	public Object translateView() throws TranslateValueObjectErrorException	{		VoteView 		voteView 		= new VoteView();		VoteToBuyer		voteToBuyer		= ( VoteToBuyer) object;				try{			voteView.setId					( voteToBuyer.getId().toString());			voteView.setActive				( DBUtils.controlNull( voteToBuyer.getActive()));			voteView.setBriefBuyerLogin		( DBUtils.briefString( voteToBuyer.getBuyer().getLogin(), 18));			voteView.setBriefComment		( DBUtils.briefString( voteToBuyer.getComment(), 30));			voteView.setBriefReply			( DBUtils.briefString( voteToBuyer.getReply(), 30));			voteView.setBriefSellerLogin	( DBUtils.briefString( voteToBuyer.getSeller().getLogin(), 18));			voteView.setBuyerId				( DBUtils.controlNull( voteToBuyer.getBuyerId()));			voteView.setBuyerIsPublic		( DBUtils.controlNull( voteToBuyer.getBuyer().getIsPublic()));			voteView.setBuyerHasPicture		( DBUtils.controlNull( voteToBuyer.getBuyer().getHasPicture()));			voteView.setBuyerMainPicture	( DBUtils.controlNull( voteToBuyer.getBuyer().getMainPicture()));			voteView.setBuyerMainPictureCode( DBUtils.controlNull( voteToBuyer.getBuyer().getMainPictureCode()));			voteView.setBuyerLogin			( DBUtils.controlNull( voteToBuyer.getBuyer().getLogin()));			voteView.setComment				( DBUtils.controlNull( voteToBuyer.getComment()));			voteView.setContactId			( DBUtils.controlNull( voteToBuyer.getContactId()));			voteView.setDate				( DBUtils.getDate( voteToBuyer.getDate(), 2));			voteView.setTime				( DBUtils.getTime( voteToBuyer.getDate()));			voteView.setReply				( DBUtils.controlNull( voteToBuyer.getReply()));			voteView.setReplyActive			( DBUtils.controlNull( voteToBuyer.getReplyActive()));			voteView.setSellerId			( DBUtils.controlNull( voteToBuyer.getSellerId()));			voteView.setSellerLogin			( DBUtils.controlNull( voteToBuyer.getSeller().getLogin()));			voteView.setSellerHasPicture	( DBUtils.controlNull( voteToBuyer.getSeller().getHasPicture()));			voteView.setSellerMainPicture	( DBUtils.controlNull( voteToBuyer.getSeller().getMainPicture()));			voteView.setSellerMainPictureCode( DBUtils.controlNull( voteToBuyer.getSeller().getMainPictureCode()));			voteView.setVote				( DBUtils.controlNull( voteToBuyer.getVote()));			voteView.setSellerSex			( DBUtils.controlNull( voteToBuyer.getSeller().getSexConst()));			voteView.setBuyerSex			( DBUtils.controlNull( voteToBuyer.getBuyer().getSexConst()));								}catch( Exception e) {			throw new TranslateValueObjectErrorException( object.getClass().getName(), voteView.getClass().getName(), e);		}				return voteView;	}}