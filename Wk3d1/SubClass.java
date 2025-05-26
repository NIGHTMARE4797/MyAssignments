package week3day1;

public class SubClass extends SuperClass {
	
	public void takeSnap() {
		super.takeSnap();
		
		System.out.println("Snap taken");
		
	}
	
	
	
	public static void main(String[] args) {
		SubClass obj= new SubClass();
		
	obj.takeSnap();
	obj.reportStep();
	

}}
