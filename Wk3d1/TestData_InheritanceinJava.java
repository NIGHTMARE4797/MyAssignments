package week3day1;

public class TestData_InheritanceinJava {
	public void enterCredentials()
	{
		System.out.println("Enter Credentials :");
	}
	
	public void navigateToHomePage() {
		System.out.println("Navigate to Home Page");
	}
	
	
	
	public static void main(String[] args) {
		TestData_InheritanceinJava obj = new TestData_InheritanceinJava();
		obj.enterCredentials();
		obj.navigateToHomePage();
	}

}
