package model;

public class LoginLogic {
	public boolean execute(User user) {
		if(user.getPass().equals("1234")) {return true;}
		
		System.out.println("GetPass=false");
		return false;
		
		
	}
}
