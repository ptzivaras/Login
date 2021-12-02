import java.util.HashMap;

//STORE.. username_ID, Pasword_ID
//Use HashMap for the  pair of Values/Key
public class UserID {
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	UserID(){
		logininfo.put("Sonic", "Tuna");
		logininfo.put("Tales", "Suvlaki");
		logininfo.put("GabeNewell", "pizza");
		logininfo.put("Jinx", "pizza");
		logininfo.put("Kena", "apple");
	}
	
	//Private information, passed to Login Class
	protected HashMap getLoginInfo() {
		return logininfo;
	}
}
