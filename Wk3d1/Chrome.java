package week3day1;

public class Chrome extends Browser {
	
	String browserName ="Chrome";
	int browserVersion =4; 
	
	        public void openIncognito() {
				System.out.println("opened Incognito" );
			}
			
				public void clearCache() {
					System.out.println("cleared Cache" );
				}
		public static void main(String[] args) {
			Chrome c = new Chrome();
			c.openIncognito();
			c.clearCache();
			c.closeBrowser();
		}
}
			
		
				
				
				
		
		
	

