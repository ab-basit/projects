
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Controller {

	public static void main(String[] args) {
		
		String input = "{'status':200,'responseMessage':'OK','object':{'dangerPings':[],'user':{'id':'dc5843b90a975a023f75c073','name':'ItsaMe','nickname':'m_ario','email':'whateverdude@g.com','social':null,'phone':null,'phoneCode':null,'phoneNumber':null,'password':null,'profileImage':'https://s3-eu-west-1.amazonaws.com/pingwebappbucket/images/profile/dc5843b90a975a023f75c073/ub6n1nk1a0kd2gfi2u949i9m6t.jpg','coverImage':'https://s3-eu-west-1.amazonaws.com/pingwebappbucket/images/cover/dc5843b90a975a023f75c073/t2kn5siu85cpt5uofqb4g7a6v6.jpg','status':'','birthday':'1900-01-01','city':'','country':'France','education':'Other','mariageStatus':'Don\\'t want to say','isOnline':true,'rating':24618,'rankTitle':'Novice','weeklyRating':7,'token':null,'userId':null,'lastCallDate':'2018-02-14T22:20:58+0000','registrationToken':null,'countOfFollowers':27,'countOfUsersToFollow':16,'recoverToken':null,'userState':null,'lowerNickname':null,'nicknameUpdateDate':null,'latitude':52.0977283,'longitude':4.9997539,'helpLatitude':52.0977283,'helpLongitude':4.9997539,'trustedLatitude':null,'trustedLongitude':null,'deleteDay':null,'countOfPings':36,'countOfEndorsement':268,'countOfHelpResponse':1,'countOfSetCoordinates':164527,'countOfAlerts':0,'countOfVerifications':0,'isVisibleForSpecified':false,'invisibleFromDate':1499294660702,'invisibleToDate':4654968260702,'visibleListsIds':null,'achievementsArray':[],'countOfBadWords':5,'countOfBadPings':0,'appVersion':48.0,'invitationId':null,'isVisibleToTrusted':false,'isFollowing':false,'isUserToFollow':false,'isBlocked':false,'isIgnored':false,'amIBlocked':false,'isSubscribed':false,'isTrusted':false,'oldPassword':null,'isDeleteProfileImage':null,'isDeleteCoverImage':null,'percentRating':0,'isWelcomeMessageSent':true,'registrationTokenValid':null}  },'newUser':null,'lastItemIdForPagination': null} ";
        System.out.println(task1a_Basit(input));
        System.out.println(task1b_Basit(task1a_Basit(input)));
        
	}
	
	public static String task1a_Basit(String json) {
		Gson gson = new GsonBuilder().create();
		Data d = gson.fromJson(json,Data.class);
		String refinedJson = gson.toJson(d);
		return refinedJson;
		
	}
	
	public static String task1b_Basit(String refinedJson) {
		Gson gson = new GsonBuilder().serializeNulls().create();
		Data d = gson.fromJson(refinedJson,Data.class);
		String json = gson.toJson(d);
		return json;
	}
	
	

}
