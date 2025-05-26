package week3day1;

public class Firefox extends Browser {

	String browserName ="Firefox";
	int browserVersion =4; 
	
	public void readerMode() {
		System.out.println("reader Mode ON" );
	}
	
		public void fullScreenMode() {
			System.out.println("full Screen Mode ON" );
		}
public static void main(String[] args) {
	Firefox f = new Firefox();
	f.readerMode();
	f.fullScreenMode();
	
	System.out.println("Name of the browser: "+f.browserName);
	System.out.println("Version of the browser: "+f.browserVersion);
	f.closeBrowser();
}


	
}


