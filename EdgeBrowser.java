package sel;

public class EdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Browser tt = new Browser();
String c = tt.launchbrowser("Edge");
System.out.println("The Browser Name:"+c);
tt.loadurl();

	}

}
