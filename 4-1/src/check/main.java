package check;

import constants.Constants;

public class main {
	private static String firstName = "川越";
	private static String lastName = "拓巳";
		// TODO 自動生成されたメソッド・スタブ

	private static void printName() {
		System.out.println("printNameメソッド" +"→" + firstName + lastName);
	}
	

	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	   printName();
	   
	   Pet Name2 = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
	   Name2.introduce();
	   
	   RobotPet Name3 = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
	   Name3.introduce();
	   
	
	    
		   
	  
		 
	}
}
		
