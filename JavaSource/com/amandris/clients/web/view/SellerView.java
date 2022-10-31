package com.amandris.clients.web.view;import org.apache.struts.action.ActionForm;public class SellerView extends ActionForm{	private String id;	private String sex;	private String sexId;	private String state;	private String email;	private Integer stateId;	private String country;	private Integer countryId;	private String login;	private String briefLogin;	private String name;	private String surname;	private String age;	private String address1;	private String address2;	private String city;	private String hasMeetingPlace;	private String briefCity;	private String postalCode;	private String meetingCountry;	private String meetingState;	private String meetingAddress1;	private String meetingAddress2;	private String meetingCity;	private String meetingPostalCode;	private String defaultCurrency;	private String defaultCurrencyText;	private String calendarPattern;	private String googleMapsUrl;	private String views;	private String intro;	private String briefIntro;	private String text;	private String briefText;	private String preferredSex;	private String preferredAgeLow;	private String preferredAgeHigh;	private String preferredPhysique;	private String preferredSmoker;	private String preferredSkinColor;		private String preferredHairColor;	private String preferredHairLength;	private String preferredBreastSize;		private String preferredPennisSize;		private String preferredEducationLevel;		private String preferredHeight;	private String preferredEyeColor;		private String preferredOrientation;		private String preferredLanguage;		private String preferredOrigin;	private String preferredSexConst;	private String preferredPhysiqueConst;	private String preferredSmokerConst;	private String preferredSkinColorConst;		private String preferredHairColorConst;	private String preferredHairLengthConst;	private String preferredBreastSizeConst;		private String preferredPennisSizeConst;		private String preferredEducationLevelConst;		private String preferredHeightConst;	private String preferredEyeColorConst;		private String preferredOrientationConst;		private String preferredLanguageConst;		private String preferredOriginConst;		private String height;	private String preferredText;		private String physique;		private String origin;		private String smoker;		private String language;	private String orientation;		private String educationLevel;		private String skinColor;		private String eyeColor;		private String hairColor;	private String hairLength;		private String breastSize;	private String pennisSize;		private String oralSex;	private String analSex;	private String bdsm;	private String inSellerHouse;	private String inBuyerHouse;	private String inHotel;	private String inCar;	private String buyerPaysDisplacement;	private String displacementPrize;	private Double displacementPrizeDouble;	private String paypalAccount;	private String phoneNumberSMS;    	private String phoneNumberCall;	private String url;	private String shortUrl;	private String skypeAccount;	private String messengerAccount;	private String bankAccount;	private String paymentBeforeDate;	private String allowSms;	private String allowPhoneCall;	private String allowUrl;	private String allowSkype;	private String allowEmail;	private String allowMessenger;	private String allowPaypalPayment;	private String allowBankPayment;	private String picture1;	private String picture2;	private String picture3;	private String picture4;	private String picture5;	private String picture1Waiting;	private String picture2Waiting;	private String picture3Waiting;	private String picture4Waiting;	private String picture5Waiting;  	private String mainPicture;	private String mainPictureCode;	private String hasAlbum;	private String hasPicture;	private String lastLoginDate;	private String lastLoginTime;	private String lastLoginFrom;	private String isOnLine;	private String isCalendarGenerated;	private String contactsReceived;       	private String contactsAccepted;	private String contactsAcceptedPercentage;	private String contactsRejected;	private String contactsNotReplied;       	private String datesCanceled;	private String positiveVotes;	private String negativeVotes; 	private String freeContacts;	private String firstPlaceInSearch;	private String userLevel;	private String pictureCount;	private String servicesSaved;	private String parametersSaved;	private String preferencesSaved;	private String picturesSaved;	private String oddOrEven;	private String highlighted;  //Can take values "1" or "2"	private String isEscort;	private String subscriptionUntil;	private String isSubscriptionActive;		private static final long serialVersionUID = 1526471155622776012L;			public String getAddress1() {		return address1;	}	public void setAddress1(String address1) {		this.address1 = address1;	}	public String getAddress2() {		return address2;	}	public void setAddress2(String address2) {		this.address2 = address2;	}	public String getAge() {		return age;	}	public void setAge(String age) {		this.age = age;	}	public String getAllowBankPayment() {		return allowBankPayment;	}	public void setAllowBankPayment(String allowBankPayment) {		this.allowBankPayment = allowBankPayment;	}	public String getAllowEmail() {		return allowEmail;	}	public void setAllowEmail(String allowEmail) {		this.allowEmail = allowEmail;	}	public String getAllowPaypalPayment() {		return allowPaypalPayment;	}	public void setAllowPaypalPayment(String allowPaypalPayment) {		this.allowPaypalPayment = allowPaypalPayment;	}	public String getAllowPhoneCall() {		return allowPhoneCall;	}	public void setAllowPhoneCall(String allowPhoneCall) {		this.allowPhoneCall = allowPhoneCall;	}	public String getAllowSkype() {		return allowSkype;	}	public void setAllowSkype(String allowSkype) {		this.allowSkype = allowSkype;	}	public String getAllowSms() {		return allowSms;	}	public void setAllowSms(String allowSms) {		this.allowSms = allowSms;	}	public String getAnalSex() {		return analSex;	}	public void setAnalSex(String analSex) {		this.analSex = analSex;	}	public String getBankAccount() {		return bankAccount;	}	public void setBankAccount(String bankAccount) {		this.bankAccount = bankAccount;	}	public String getBdsm() {		return bdsm;	}	public void setBdsm(String bdsm) {		this.bdsm = bdsm;	}	public String getBreastSize() {		return breastSize;	}	public void setBreastSize(String breastSize) {		this.breastSize = breastSize;	}	public String getCity() {		return city;	}	public void setCity(String city) {		this.city = city;	}	public String getContactsAccepted() {		return contactsAccepted;	}	public void setContactsAccepted(String contactsAccepted) {		this.contactsAccepted = contactsAccepted;	}	public String getContactsNotReplied() {		return contactsNotReplied;	}	public void setContactsNotReplied(String contactsNotReplied) {		this.contactsNotReplied = contactsNotReplied;	}	public String getContactsReceived() {		return contactsReceived;	}	public void setContactsReceived(String contactsReceived) {		this.contactsReceived = contactsReceived;	}	public String getContactsRejected() {		return contactsRejected;	}	public void setContactsRejected(String contactsRejected) {		this.contactsRejected = contactsRejected;	}	public String getCountry() {		return country;	}	public void setCountry(String country) {		this.country = country;	}	public String getDatesCanceled() {		return datesCanceled;	}	public void setDatesCanceled(String datesCanceled) {		this.datesCanceled = datesCanceled;	}	public String getEducationLevel() {		return educationLevel;	}	public void setEducationLevel(String educationLevel) {		this.educationLevel = educationLevel;	}	public String getEyeColor() {		return eyeColor;	}	public void setEyeColor(String eyeColor) {		this.eyeColor = eyeColor;	}	public String getFreeContacts() {		return freeContacts;	}	public void setFreeContacts(String freeContacts) {		this.freeContacts = freeContacts;	}	public String getGoogleMapsUrl() {		return googleMapsUrl;	}	public void setGoogleMapsUrl(String googleMapsUrl) {		this.googleMapsUrl = googleMapsUrl;	}	public String getHairColor() {		return hairColor;	}	public void setHairColor(String hairColor) {		this.hairColor = hairColor;	}	public String getHairLength() {		return hairLength;	}	public void setHairLength(String hairLength) {		this.hairLength = hairLength;	}	public String getHasAlbum() {		return hasAlbum;	}	public void setHasAlbum(String hasAlbum) {		this.hasAlbum = hasAlbum;	}	public String getHeight() {		return height;	}	public void setHeight(String height) {		this.height = height;	}	public String getId() {		return id;	}	public void setId(String id) {		this.id = id;	}	public String getInBuyerHouse() {		return inBuyerHouse;	}	public void setInBuyerHouse(String inBuyerHouse) {		this.inBuyerHouse = inBuyerHouse;	}	public String getInCar() {		return inCar;	}	public void setInCar(String inCar) {		this.inCar = inCar;	}	public String getInHotel() {		return inHotel;	}	public void setInHotel(String inHotel) {		this.inHotel = inHotel;	}	public String getInSellerHouse() {		return inSellerHouse;	}	public void setInSellerHouse(String inSellerHouse) {		this.inSellerHouse = inSellerHouse;	}	public String getIntro() {		return intro;	}	public void setIntro(String intro) {		this.intro = intro;	}	public String getIsOnLine() {		return isOnLine;	}	public void setIsOnLine(String isOnLine) {		this.isOnLine = isOnLine;	}	public String getLanguage() {		return language;	}	public void setLanguage(String language) {		this.language = language;	}	public String getLastLoginDate() {		return lastLoginDate;	}	public void setLastLoginDate(String lastLoginDate) {		this.lastLoginDate = lastLoginDate;	}	public String getLastLoginTime() {		return lastLoginTime;	}	public void setLastLoginTime(String lastLoginTime) {		this.lastLoginTime = lastLoginTime;	}	public String getLastLoginFrom() {		return lastLoginFrom;	}	public void setLastLoginFrom(String lastLoginFrom) {		this.lastLoginFrom = lastLoginFrom;	}	public String getLogin() {		return login;	}	public void setLogin(String login) {		this.login = login;	}	public String getName() {		return name;	}	public void setName(String name) {		this.name = name;	}	public String getNegativeVotes() {		return negativeVotes;	}	public void setNegativeVotes(String negativeVotes) {		this.negativeVotes = negativeVotes;	}	public String getOddOrEven() {		return oddOrEven;	}	public void setOddOrEven(String oddOrEven) {		this.oddOrEven = oddOrEven;	}	public String getOralSex() {		return oralSex;	}	public void setOralSex(String oralSex) {		this.oralSex = oralSex;	}	public String getOrientation() {		return orientation;	}	public void setOrientation(String orientation) {		this.orientation = orientation;	}	public String getOrigin() {		return origin;	}	public void setOrigin(String origin) {		this.origin = origin;	}	public String getPaymentBeforeDate() {		return paymentBeforeDate;	}	public void setPaymentBeforeDate(String paymentBeforeDate) {		this.paymentBeforeDate = paymentBeforeDate;	}	public String getPaypalAccount() {		return paypalAccount;	}	public void setPaypalAccount(String paypalAccount) {		this.paypalAccount = paypalAccount;	}	public String getPennisSize() {		return pennisSize;	}	public void setPennisSize(String pennisSize) {		this.pennisSize = pennisSize;	}	public String getPhoneNumberCall() {		return phoneNumberCall;	}	public void setPhoneNumberCall(String phoneNumberCall) {		this.phoneNumberCall = phoneNumberCall;	}	public String getPhoneNumberSMS() {		return phoneNumberSMS;	}	public void setPhoneNumberSMS(String phoneNumberSMS) {		this.phoneNumberSMS = phoneNumberSMS;	}	public String getPhysique() {		return physique;	}	public void setPhysique(String physique) {		this.physique = physique;	}		public String getPicture1() {		return picture1;	}	public void setPicture1(String picture1) {		this.picture1 = picture1;	}	public String getPicture2() {		return picture2;	}	public void setPicture2(String picture2) {		this.picture2 = picture2;	}	public String getPicture3() {		return picture3;	}	public void setPicture3(String picture3) {		this.picture3 = picture3;	}	public String getPicture4() {		return picture4;	}	public void setPicture4(String picture4) {		this.picture4 = picture4;	}	public String getPicture5() {		return picture5;	}	public void setPicture5(String picture5) {		this.picture5 = picture5;	}	public String getPositiveVotes() {		return positiveVotes;	}	public void setPositiveVotes(String positiveVotes) {		this.positiveVotes = positiveVotes;	}	public String getPostalCode() {		return postalCode;	}	public void setPostalCode(String postalCode) {		this.postalCode = postalCode;	}	public String getPreferredAgeHigh() {		return preferredAgeHigh;	}	public void setPreferredAgeHigh(String preferredAgeHigh) {		this.preferredAgeHigh = preferredAgeHigh;	}	public String getPreferredAgeLow() {		return preferredAgeLow;	}	public void setPreferredAgeLow(String preferredAgeLow) {		this.preferredAgeLow = preferredAgeLow;	}	public String getPreferredBreastSize() {		return preferredBreastSize;	}	public void setPreferredBreastSize(String preferredBreastSize) {		this.preferredBreastSize = preferredBreastSize;	}	public String getPreferredEducationLevel() {		return preferredEducationLevel;	}	public void setPreferredEducationLevel(String preferredEducationLevel) {		this.preferredEducationLevel = preferredEducationLevel;	}	public String getPreferredEyeColor() {		return preferredEyeColor;	}	public void setPreferredEyeColor(String preferredEyeColor) {		this.preferredEyeColor = preferredEyeColor;	}	public String getPreferredHairColor() {		return preferredHairColor;	}	public void setPreferredHairColor(String preferredHairColor) {		this.preferredHairColor = preferredHairColor;	}	public String getPreferredHairLength() {		return preferredHairLength;	}	public void setPreferredHairLength(String preferredHairLength) {		this.preferredHairLength = preferredHairLength;	}	public String getPreferredHeight() {		return preferredHeight;	}	public void setPreferredHeight(String preferredHeight) {		this.preferredHeight = preferredHeight;	}	public String getPreferredLanguage() {		return preferredLanguage;	}	public void setPreferredLanguage(String preferredLanguage) {		this.preferredLanguage = preferredLanguage;	}	public String getPreferredOrientation() {		return preferredOrientation;	}	public void setPreferredOrientation(String preferredOrientation) {		this.preferredOrientation = preferredOrientation;	}	public String getPreferredOrigin() {		return preferredOrigin;	}	public void setPreferredOrigin(String preferredOrigin) {		this.preferredOrigin = preferredOrigin;	}	public String getPreferredPennisSize() {		return preferredPennisSize;	}	public void setPreferredPennisSize(String preferredPennisSize) {		this.preferredPennisSize = preferredPennisSize;	}	public String getPreferredPhysique() {		return preferredPhysique;	}	public void setPreferredPhysique(String preferredPhysique) {		this.preferredPhysique = preferredPhysique;	}	public String getPreferredSex() {		return preferredSex;	}	public void setPreferredSex(String preferredSex) {		this.preferredSex = preferredSex;	}	public String getPreferredSkinColor() {		return preferredSkinColor;	}	public void setPreferredSkinColor(String preferredSkinColor) {		this.preferredSkinColor = preferredSkinColor;	}	public String getPreferredSmoker() {		return preferredSmoker;	}	public void setPreferredSmoker(String preferredSmoker) {		this.preferredSmoker = preferredSmoker;	}	public String getPreferredText() {		return preferredText;	}	public void setPreferredText(String preferredText) {		this.preferredText = preferredText;	}	public String getBuyerPaysDisplacement() {		return buyerPaysDisplacement;	}	public void setBuyerPaysDisplacement(String buyerPaysDisplacement) {		this.buyerPaysDisplacement = buyerPaysDisplacement;	}	public String getSex() {		return sex;	}	public void setSex(String sex) {		this.sex = sex;	}	public String getSkinColor() {		return skinColor;	}	public void setSkinColor(String skinColor) {		this.skinColor = skinColor;	}	public String getSkypeAccount() {		return skypeAccount;	}	public void setSkypeAccount(String skypeAccount) {		this.skypeAccount = skypeAccount;	}	public String getSmoker() {		return smoker;	}	public void setSmoker(String smoker) {		this.smoker = smoker;	}	public String getState() {		return state;	}	public void setState(String state) {		this.state = state;	}	public String getSurname() {		return surname;	}	public void setSurname(String surname) {		this.surname = surname;	}	public String getText() {		return text;	}	public void setText(String text) {		this.text = text;	}	public String getViews() {		return views;	}	public void setViews(String views) {		this.views = views;	}	public String getBriefIntro() {		return briefIntro;	}	public void setBriefIntro(String briefIntro) {		this.briefIntro = briefIntro;	}	public String getBriefLogin() {		return briefLogin;	}	public void setBriefLogin(String briefLogin) {		this.briefLogin = briefLogin;	}	public String getBriefText() {		return briefText;	}	public void setBriefText(String briefText) {		this.briefText = briefText;	}	public String getBriefCity() {		return briefCity;	}	public void setBriefCity(String briefCity) {		this.briefCity = briefCity;	}	public String getContactsAcceptedPercentage() {		return contactsAcceptedPercentage;	}	public void setContactsAcceptedPercentage(String contactsAcceptedPercentage) {		this.contactsAcceptedPercentage = contactsAcceptedPercentage;	}	public String getSexId() {		return sexId;	}	public void setSexId(String sexId) {		this.sexId = sexId;	}	public String getHasPicture() {		return hasPicture;	}	public void setHasPicture(String hasPicture) {		this.hasPicture = hasPicture;	}	public String getUserLevel() {		return userLevel;	}	public void setUserLevel(String userLevel) {		this.userLevel = userLevel;	}	public String getPictureCount() {		return pictureCount;	}	public void setPictureCount(String pictureCount) {		this.pictureCount = pictureCount;	}	public String getPreferredBreastSizeConst() {		return preferredBreastSizeConst;	}	public void setPreferredBreastSizeConst(String preferredBreastSizeConst) {		this.preferredBreastSizeConst = preferredBreastSizeConst;	}	public String getPreferredEducationLevelConst() {		return preferredEducationLevelConst;	}	public void setPreferredEducationLevelConst(String preferredEducationLevelConst) {		this.preferredEducationLevelConst = preferredEducationLevelConst;	}	public String getPreferredEyeColorConst() {		return preferredEyeColorConst;	}	public void setPreferredEyeColorConst(String preferredEyeColorConst) {		this.preferredEyeColorConst = preferredEyeColorConst;	}	public String getPreferredHairColorConst() {		return preferredHairColorConst;	}	public void setPreferredHairColorConst(String preferredHairColorConst) {		this.preferredHairColorConst = preferredHairColorConst;	}	public String getPreferredHairLengthConst() {		return preferredHairLengthConst;	}	public void setPreferredHairLengthConst(String preferredHairLengthConst) {		this.preferredHairLengthConst = preferredHairLengthConst;	}	public String getPreferredHeightConst() {		return preferredHeightConst;	}	public void setPreferredHeightConst(String preferredHeightConst) {		this.preferredHeightConst = preferredHeightConst;	}	public String getPreferredLanguageConst() {		return preferredLanguageConst;	}	public void setPreferredLanguageConst(String preferredLanguageConst) {		this.preferredLanguageConst = preferredLanguageConst;	}	public String getPreferredOrientationConst() {		return preferredOrientationConst;	}	public void setPreferredOrientationConst(String preferredOrientationConst) {		this.preferredOrientationConst = preferredOrientationConst;	}	public String getPreferredOriginConst() {		return preferredOriginConst;	}	public void setPreferredOriginConst(String preferredOriginConst) {		this.preferredOriginConst = preferredOriginConst;	}	public String getPreferredSexConst() {		return preferredSexConst;	}	public void setPreferredSexConst(String preferredSexConst) {		this.preferredSexConst = preferredSexConst;	}	public String getPreferredPennisSizeConst() {		return preferredPennisSizeConst;	}	public void setPreferredPennisSizeConst(String preferredPennisSizeConst) {		this.preferredPennisSizeConst = preferredPennisSizeConst;	}	public String getPreferredPhysiqueConst() {		return preferredPhysiqueConst;	}	public void setPreferredPhysiqueConst(String preferredPhysiqueConst) {		this.preferredPhysiqueConst = preferredPhysiqueConst;	}	public String getPreferredSkinColorConst() {		return preferredSkinColorConst;	}	public void setPreferredSkinColorConst(String preferredSkinColorConst) {		this.preferredSkinColorConst = preferredSkinColorConst;	}	public String getPreferredSmokerConst() {		return preferredSmokerConst;	}	public void setPreferredSmokerConst(String preferredSmokerConst) {		this.preferredSmokerConst = preferredSmokerConst;	}	public String getAllowMessenger() {		return allowMessenger;	}	public void setAllowMessenger(String allowMessenger) {		this.allowMessenger = allowMessenger;	}	public String getMessengerAccount() {		return messengerAccount;	}	public void setMessengerAccount(String messengerAccount) {		this.messengerAccount = messengerAccount;	}	public String getDisplacementPrize() {		return displacementPrize;	}	public void setDisplacementPrize(String displacementPrize) {		this.displacementPrize = displacementPrize;	}	public Double getDisplacementPrizeDouble() {		return displacementPrizeDouble;	}	public void setDisplacementPrizeDouble(Double displacementPrizeDouble) {		this.displacementPrizeDouble = displacementPrizeDouble;	}	public Integer getCountryId() {		return countryId;	}	public void setCountryId(Integer countryId) {		this.countryId = countryId;	}	public Integer getStateId() {		return stateId;	}	public void setStateId(Integer stateId) {		this.stateId = stateId;	}	public String getMainPicture() {		return mainPicture;	}	public void setMainPicture(String mainPicture) {		this.mainPicture = mainPicture;	}	public String getMainPictureCode() {		return mainPictureCode;	}	public void setMainPictureCode(String mainPictureCode) {		this.mainPictureCode = mainPictureCode;	}	public String getPicture1Waiting() {		return picture1Waiting;	}	public void setPicture1Waiting(String picture1Waiting) {		this.picture1Waiting = picture1Waiting;	}	public String getPicture2Waiting() {		return picture2Waiting;	}	public void setPicture2Waiting(String picture2Waiting) {		this.picture2Waiting = picture2Waiting;	}	public String getPicture3Waiting() {		return picture3Waiting;	}	public void setPicture3Waiting(String picture3Waiting) {		this.picture3Waiting = picture3Waiting;	}	public String getPicture4Waiting() {		return picture4Waiting;	}	public void setPicture4Waiting(String picture4Waiting) {		this.picture4Waiting = picture4Waiting;	}	public String getPicture5Waiting() {		return picture5Waiting;	}	public void setPicture5Waiting(String picture5Waiting) {		this.picture5Waiting = picture5Waiting;	}	public String getIsCalendarGenerated() {		return isCalendarGenerated;	}	public void setIsCalendarGenerated(String isCalendarGenerated) {		this.isCalendarGenerated = isCalendarGenerated;	}	public String getCalendarPattern() {		return calendarPattern;	}	public void setCalendarPattern(String calendarPattern) {		this.calendarPattern = calendarPattern;	}	public String getDefaultCurrency() {		return defaultCurrency;	}	public void setDefaultCurrency(String defaultCurrency) {		this.defaultCurrency = defaultCurrency;	}	public String getMeetingAddress1() {		return meetingAddress1;	}	public void setMeetingAddress1(String meetingAddress1) {		this.meetingAddress1 = meetingAddress1;	}	public String getMeetingAddress2() {		return meetingAddress2;	}	public void setMeetingAddress2(String meetingAddress2) {		this.meetingAddress2 = meetingAddress2;	}	public String getMeetingCity() {		return meetingCity;	}	public void setMeetingCity(String meetingCity) {		this.meetingCity = meetingCity;	}	public String getMeetingCountry() {		return meetingCountry;	}	public void setMeetingCountry(String meetingCountry) {		this.meetingCountry = meetingCountry;	}	public String getMeetingPostalCode() {		return meetingPostalCode;	}	public void setMeetingPostalCode(String meetingPostalCode) {		this.meetingPostalCode = meetingPostalCode;	}	public String getMeetingState() {		return meetingState;	}	public void setMeetingState(String meetingState) {		this.meetingState = meetingState;	}	public String getHasMeetingPlace() {		return hasMeetingPlace;	}	public void setHasMeetingPlace(String hasMeetingPlace) {		this.hasMeetingPlace = hasMeetingPlace;	}	public String getDefaultCurrencyText() {		return defaultCurrencyText;	}	public void setDefaultCurrencyText(String defaultCurrencyText) {		this.defaultCurrencyText = defaultCurrencyText;	}	public String getHighlighted() {		return highlighted;	}	public void setHighlighted(String highlighted) {		this.highlighted = highlighted;	}	public String getFirstPlaceInSearch() {		return firstPlaceInSearch;	}	public void setFirstPlaceInSearch(String firstPlaceInSearch) {		this.firstPlaceInSearch = firstPlaceInSearch;	}	public String getParametersSaved() {		return parametersSaved;	}	public void setParametersSaved(String parametersSaved) {		this.parametersSaved = parametersSaved;	}	public String getPreferencesSaved() {		return preferencesSaved;	}	public void setPreferencesSaved(String preferencesSaved) {		this.preferencesSaved = preferencesSaved;	}	public String getServicesSaved() {		return servicesSaved;	}	public void setServicesSaved(String servicesSaved) {		this.servicesSaved = servicesSaved;	}	public String getPicturesSaved() {		return picturesSaved;	}	public void setPicturesSaved(String picturesSaved) {		this.picturesSaved = picturesSaved;	}	public String getIsEscort() {		return isEscort;	}	public void setIsEscort(String isEscort) {		this.isEscort = isEscort;	}	public String getEmail() {		return email;	}	public void setEmail(String email) {		this.email = email;	}	public String getSubscriptionUntil() {		return subscriptionUntil;	}	public void setSubscriptionUntil(String subscriptionUntil) {		this.subscriptionUntil = subscriptionUntil;	}	public String getIsSubscriptionActive() {		return isSubscriptionActive;	}	public void setIsSubscriptionActive(String isSubscriptionActive) {		this.isSubscriptionActive = isSubscriptionActive;	}	public String getUrl() {		return url;	}	public void setUrl(String url) {		this.url = url;	}	public String getAllowUrl() {		return allowUrl;	}	public void setAllowUrl(String allowUrl) {		this.allowUrl = allowUrl;	}	public String getShortUrl() {		return shortUrl;	}	public void setShortUrl(String shortUrl) {		this.shortUrl = shortUrl;	}	}