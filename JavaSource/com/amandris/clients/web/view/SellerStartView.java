package com.amandris.clients.web.view;import org.apache.struts.action.ActionForm;public class SellerStartView extends ActionForm{	private String 		id;	private String 		login;	private String 		hasPicture;	private String 		mainPicture;	private String 		mainPictureCode;	private String 		briefLogin;	private String 		credits;	private String 		positiveVotes;	private String 		negativeVotes;	private String 		userLevel;	private String 		userLevelText;	private String 		positiveVotesPercent;	private String 		newMessages;	private String		hasPenddingTasks;	private String		preferencesSaved;	private String		servicesSaved;	private String		parametersSaved;	private String		picturesSaved;	private String		calendarSaved;		private static final long serialVersionUID = 7526271055662766302L;		public SellerStartView()	{		id						= "";		login					= "";		mainPicture				= "";		hasPicture				= "";		briefLogin				= "";				credits					= "";		positiveVotes			= "";		negativeVotes			= "";		userLevel				= "";		positiveVotesPercent	= "";		newMessages				= "";		hasPenddingTasks		= "0";		preferencesSaved		= "0";		servicesSaved			= "0";		parametersSaved			= "0";		calendarSaved			= "0";		picturesSaved			= "0";			}		public String getCredits() {		return credits;	}	public void setCredits(String credits) {		this.credits = credits;	}	public String getLogin() {		return login;	}	public void setLogin(String login) {		this.login = login;	}	public String getNegativeVotes() {		return negativeVotes;	}	public void setNegativeVotes(String negativeVotes) {		this.negativeVotes = negativeVotes;	}	public String getNewMessages() {		return newMessages;	}	public void setNewMessages(String newMessages) {		this.newMessages = newMessages;	}	public String getPositiveVotes() {		return positiveVotes;	}	public void setPositiveVotes(String positiveVotes) {		this.positiveVotes = positiveVotes;	}	public String getPositiveVotesPercent() {		return positiveVotesPercent;	}	public void setPositiveVotesPercent(String positiveVotesPercent) {		this.positiveVotesPercent = positiveVotesPercent;	}	public String getUserLevel() {		return userLevel;	}	public void setUserLevel(String userLevel) {		this.userLevel = userLevel;	}		public String getUserLevelText() {		return userLevelText;	}	public void setUserLevelText(String userLevelText) {		this.userLevelText = userLevelText;	}	public String getId() {		return id;	}	public void setId(String id) {		this.id = id;	}	public String getBriefLogin() {		return briefLogin;	}	public void setBriefLogin(String briefLogin) {		this.briefLogin = briefLogin;	}	public String getHasPicture() {		return hasPicture;	}	public void setHasPicture(String hasPicture) {		this.hasPicture = hasPicture;	}	public String getMainPicture() {		return mainPicture;	}	public void setMainPicture(String mainPicture) {		this.mainPicture = mainPicture;	}	public String getMainPictureCode() {		return mainPictureCode;	}	public void setMainPictureCode(String mainPictureCode) {		this.mainPictureCode = mainPictureCode;	}	public String getCalendarSaved() {		return calendarSaved;	}	public void setCalendarSaved(String calendarSaved) {		this.calendarSaved = calendarSaved;	}	public String getHasPenddingTasks() {		return hasPenddingTasks;	}	public void setHasPenddingTasks(String hasPenddingTasks) {		this.hasPenddingTasks = hasPenddingTasks;	}	public String getParametersSaved() {		return parametersSaved;	}	public void setParametersSaved(String parametersSaved) {		this.parametersSaved = parametersSaved;	}	public String getPreferencesSaved() {		return preferencesSaved;	}	public void setPreferencesSaved(String preferencesSaved) {		this.preferencesSaved = preferencesSaved;	}	public String getServicesSaved() {		return servicesSaved;	}	public void setServicesSaved(String servicesSaved) {		this.servicesSaved = servicesSaved;	}	public String getPicturesSaved() {		return picturesSaved;	}	public void setPicturesSaved(String picturesSaved) {		this.picturesSaved = picturesSaved;	}		}