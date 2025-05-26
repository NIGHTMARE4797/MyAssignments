package week3day1;

public class LoginTestData extends TestData_InheritanceinJava {
	
	
	public void enterUsername() {
		System.out.println("Enter Username :");
	}
	public void enterPassword() 
	{
		System.out.println("Enter Password :");
		}
		
		public static void main(String[] args) {
			LoginTestData obj= new LoginTestData();
		obj.enterUsername();
		obj.enterPassword();
		obj.enterCredentials();
		obj.navigateToHomePage();
	}
}
