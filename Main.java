
public class Main {
	public static void main(String[] args) {
		UserID userID = new UserID();
		Login login = new Login(userID.getLoginInfo());
	}
}
