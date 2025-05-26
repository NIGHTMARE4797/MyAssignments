package week3day1;

public class Edge extends Browser {
	
	String browserName ="Edge";
	int browserVersion =4; 
	
		public void takeSnap() {
			System.out.println("Snap Taken" );
		}
		
			public void clearCookies() {
				System.out.println("cleared Cookies" );
			}
	public static void main(String[] args) {
		Edge e = new Edge();
		e.takeSnap();
		e.clearCookies();
		
		System.out.println("Name of the browser: "+e.browserName);
		System.out.println("Version of the browser: "+e.browserVersion);
		e.closeBrowser();
	}


}
