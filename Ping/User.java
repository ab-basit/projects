

public class User {
	private String id;
	private String name;
	private String nickname;
	private String email;
	private String social;
	private String phone;
	private String phoneCode;
	private String phoneNumber;
	private String password;
	private String profileImage;
	private String coverImage;
	private String status;
	private String birthday;
	private String city;
	private String country;
	private String education;
	private String mariageStatus;
	private boolean isOnline;
	private int rating;
	private String rankTitle;
	private int weeklyRating;
	private String token;
	private String userId;
	private String lastCallDate;
	private String registrationToken;
	private int countOfFollowers;
	private int countOfUsersToFollow;
	private String recoverToken;
	private String userState;
	private String lowerNickname;
	private String nicknameUpdateDate;
	private float latitude;
	private float longitude;
	private float helpLatitude;
	private float helpLongitude;
	private float trustedLatitude;
	private float trustedLongitude;
	private String deleteDay;
	private int countOfPings;
	private int countOfEndorsement;
	private int countOfHelpResponse;
	private int countOfSetCoordinates;
	private int countOfAlerts;
	private int countOfVerifications;
	private boolean isVisibleForSpecified;
	private long invisibleFromDate;//TS
	private long invisibleToDate;
	private String visibleListsIds; // []
	private String[] achievementsArray;
	private int countOfBadWords;
	private int countOfBadPings;
	private float appVersion;
	private String invitationId;
	private boolean isVisibleToTrusted;
	private boolean isFollowing;
	private boolean isUserToFollow;
	private boolean isBlocked;
	private boolean isIgnored;
	private boolean amIBlocked;
	private boolean isSubscribed;
	private boolean isTrusted;
	private String oldPassword;
	private String isDeleteProfileImage;
	private String isDeleteCoverImage;
	private int percentRating;
	private boolean isWelcomeMessageSent;
	private String registrationTokenValid;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSocial() {
		return social;
	}
	public void setSocial(String social) {
		this.social = social;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhoneCode() {
		return phoneCode;
	}
	public void setPhoneCode(String phoneCode) {
		this.phoneCode = phoneCode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getProfileImage() {
		return profileImage;
	}
	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}
	public String getCoverImage() {
		return coverImage;
	}
	public void setCoverImage(String coverImage) {
		this.coverImage = coverImage;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {	
		this.status = status;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getMariageStatus() {
		return mariageStatus;
	}
	public void setMariageStatus(String mariageStatus) {
		this.mariageStatus = mariageStatus;
	}
	public boolean isOnline() {
		return isOnline;
	}
	public void setOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getRankTitle() {
		return rankTitle;
	}
	public void setRankTitle(String rankTitle) {
		this.rankTitle = rankTitle;
	}
	public int getWeeklyRating() {
		return weeklyRating;
	}
	public void setWeeklyRating(int weeklyRating) {
		this.weeklyRating = weeklyRating;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getLastCallDate() {
		return lastCallDate;
	}
	public void setLastCallDate(String lastCallDate) {
		this.lastCallDate = lastCallDate;
	}
	public String getRegistrationToken() {
		return registrationToken;
	}
	public void setRegistrationToken(String registrationToken) {
		this.registrationToken = registrationToken;
	}
	public int getCountOfFlowers() {
		return countOfFollowers;
	}
	public void setCountOfFlowers(int countOfFollowers) {
		this.countOfFollowers = countOfFollowers;
	}
	public int getCountOfUsersToFollow() {
		return countOfUsersToFollow;
	}
	public void setCountOfUsersToFollow(int countOfUsersToFollow) {
		this.countOfUsersToFollow = countOfUsersToFollow;
	}
	public String getRecoverToken() {
		return recoverToken;
	}
	public void setRecoverToken(String recoverToken) {
		this.recoverToken = recoverToken;
	}
	public String getUserState() {
		return userState;
	}
	public void setUserState(String userState) {
		this.userState = userState;
	}
	public String getLowerNickname() {
		return lowerNickname;
	}
	public void setLowerNickname(String lowerNickname) {
		this.lowerNickname = lowerNickname;
	}
	public String getNicknameUpdateDate() {
		return nicknameUpdateDate;
	}
	public void setNicknameUpdateDate(String nicknameUpdateDate) {
		this.nicknameUpdateDate = nicknameUpdateDate;
	}
	public float getLatitude() {
		return latitude;
	}
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	public float getHelpLatitude() {
		return helpLatitude;
	}
	public void setHelpLatitude(float helpLatitude) {
		this.helpLatitude = helpLatitude;
	}
	public float getHelpLongitude() {
		return helpLongitude;
	}
	public void setHelpLongitude(float helpLongitude) {
		this.helpLongitude = helpLongitude;
	}
	public float getTrustedLatitude() {
		return trustedLatitude;
	}
	public void setTrustedLatitude(float trustedLatitude) {
		this.trustedLatitude = trustedLatitude;
	}
	public float getTrustedLongitude() {
		return trustedLongitude;
	}
	public void setTrustedLongitude(float trustedLongitude) {
		this.trustedLongitude = trustedLongitude;
	}
	public String getDeleteDay() {
		return deleteDay;
	}
	public void setDeleteDay(String deleteDay) {
		this.deleteDay = deleteDay;
	}
	public int getCountOfPings() {
		return countOfPings;
	}
	public void setCountOfPings(int countOfPings) {
		this.countOfPings = countOfPings;
	}
	public int getCountOfEndorsement() {
		return countOfEndorsement;
	}
	public void setCountOfEndorsement(int countOfEndorsement) {
		this.countOfEndorsement = countOfEndorsement;
	}
	public int getCountOfHelpResponse() {
		return countOfHelpResponse;
	}
	public void setCountOfHelpResponse(int countOfHelpResponse) {
		this.countOfHelpResponse = countOfHelpResponse;
	}
	public int getCountOfSetCoordinates() {
		return countOfSetCoordinates;
	}
	public void setCountOfSetCoordinates(int countOfSetCoordinates) {
		this.countOfSetCoordinates = countOfSetCoordinates;
	}
	public int getCountOfAlerts() {
		return countOfAlerts;
	}
	public void setCountOfAlerts(int countOfAlerts) {
		this.countOfAlerts = countOfAlerts;
	}
	public int getCountOfVerifications() {
		return countOfVerifications;
	}
	public void setCountOfVerifications(int countOfVerifications) {
		this.countOfVerifications = countOfVerifications;
	}
	public boolean isVisibleForSpecified() {
		return isVisibleForSpecified;
	}
	public void setVisibleForSpecified(boolean isVisibleForSpecified) {
		this.isVisibleForSpecified = isVisibleForSpecified;
	}
	public long getInvisibleFromDate() {
		return invisibleFromDate;
	}
	public void setInvisibleFromDate(long invisibleFromDate) {
		this.invisibleFromDate = invisibleFromDate;
	}
	public long getInvisibleToDate() {
		return invisibleToDate;
	}
	public void setInvisibleToDate(long invisibleToDate) {
		this.invisibleToDate = invisibleToDate;
	}
	public String getVisibleListsIds() {
		return visibleListsIds;
	}
	public void setVisibleListsIds(String visibleListsIds) {
		this.visibleListsIds = visibleListsIds;
	}
	public String[] getAchievementsArray() {
		return achievementsArray;
	}
	public void setAchievementsArray(String[] achievementsArray) {
		this.achievementsArray = achievementsArray;
	}
	public int getCountOfBadWords() {
		return countOfBadWords;
	}
	public void setCountOfBadWords(int countOfBadWords) {
		this.countOfBadWords = countOfBadWords;
	}
	public int getCountOfBadPings() {
		return countOfBadPings;
	}
	public void setCountOfBadPings(int countOfBadPings) {
		this.countOfBadPings = countOfBadPings;
	}
	public float getAppVersion() {
		return appVersion;
	}
	public void setAppVersion(float appVersion) {
		this.appVersion = appVersion;
	}
	public String getInvitationId() {
		return invitationId;
	}
	public void setInvitationId(String invitationId) {
		this.invitationId = invitationId;
	}
	public boolean isVisibleToTrusted() {
		return isVisibleToTrusted;
	}
	public void setVisibleToTrusted(boolean isVisibleToTrusted) {
		this.isVisibleToTrusted = isVisibleToTrusted;
	}
	public boolean isFollowing() {
		return isFollowing;
	}
	public void setFollowing(boolean isFollowing) {
		this.isFollowing = isFollowing;
	}
	public boolean isUserToFollow() {
		return isUserToFollow;
	}
	public void setUserToFollow(boolean isUserToFollow) {
		this.isUserToFollow = isUserToFollow;
	}
	public boolean isBlocked() {
		return isBlocked;
	}
	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}
	public boolean isIgnored() {
		return isIgnored;
	}
	public void setIgnored(boolean isIgnored) {
		this.isIgnored = isIgnored;
	}
	public boolean isAmIBlocked() {
		return amIBlocked;
	}
	public void setAmIBlocked(boolean amIBlocked) {
		this.amIBlocked = amIBlocked;
	}
	public boolean isSubscribed() {
		return isSubscribed;
	}
	public void setSubscribed(boolean isSubscribed) {
		this.isSubscribed = isSubscribed;
	}
	public boolean isTrusted() {
		return isTrusted;
	}
	public void setTrusted(boolean isTrusted) {
		this.isTrusted = isTrusted;
	}
	public String getOldPassword() {
		return oldPassword;
	}
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	public String getIsDeleteProfileImage() {
		return isDeleteProfileImage;
	}
	public void setIsDeleteProfileImage(String isDeleteProfileImage) {
		this.isDeleteProfileImage = isDeleteProfileImage;
	}
	public String getIsDeleteCoverImage() {
		return isDeleteCoverImage;
	}
	public void setIsDeleteCoverImage(String isDeleteCoverImage) {
		this.isDeleteCoverImage = isDeleteCoverImage;
	}
	public int getPercentRating() {
		return percentRating;
	}
	public void setPercentRating(int percentRating) {
		this.percentRating = percentRating;
	}
	public boolean isWelcomeMessageSent() {
		return isWelcomeMessageSent;
	}
	public void setWelcomeMessageSent(boolean isWelcomeMessageSent) {
		this.isWelcomeMessageSent = isWelcomeMessageSent;
	}
	public String getRegistrationTokenValid() {
		return registrationTokenValid;
	}
	public void setRegistrationTokenValid(String registrationTokenValid) {
		this.registrationTokenValid = registrationTokenValid;
	}
}
