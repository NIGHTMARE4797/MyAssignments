package week3day1;

public class MethodOverloading {
	
  public void reportStep(String Message, String Status) {
		System.out.println(Message+" "+Status);
}
	public void reportStep(String Message, String Status, boolean snap) {
		System.out.println(Message+" "+Status);
            
	
	if(snap) {
		System.out.println("Snapshot taken");
		}
	else {
		System.out.println("Snapshot not taken");
	}}
	
	public static void main(String[] args) {
		MethodOverloading obj= new MethodOverloading();
	obj.reportStep("Status", "Okay");	
	obj.reportStep("Status", "Not Okay",false);
	}
	}
