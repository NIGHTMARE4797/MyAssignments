package week3day1;

public class SuperClass {
	public void takeSnap() {
	System.out.println("takeSnap");
	}
	
	public void reportStep() {
		System.out.println("reportStep");
		}
		
		
		public static void main(String[] args) {
			SuperClass obj= new SuperClass();
		obj.takeSnap();
		obj.reportStep();
}
}
