package sel;

public class Browser {

public String launchbrowser(String browserName) {
	System.out.println("Browser launched successfully");
 return browserName;
}
protected void loadurl() {
	System.out.println("Application url launched successfully");
}
public static void main(String[] args) {
	
	Browser browserObj = new Browser();
	String browserName = browserObj.launchbrowser("Firefox");
	System.out.println("The Browser Name:" + browserName);
	browserObj.loadurl();
}

	}


