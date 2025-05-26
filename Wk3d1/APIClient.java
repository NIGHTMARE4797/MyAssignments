package week3day1;

public class APIClient {
	
public void sendRequest(String endPoint) {
		System.out.println(endPoint);
	}
	
public void sendRequest(String endPoint,String requestBody,Boolean requestStatus) {
          System.out.println(endPoint);
	
          
          
	if (requestStatus.equals(true)) {
		System.out.println("The request is successful.");
	}
	
	else{
		System.out.println("The request is not successful.");
	}
	System.out.println(requestBody);
}



public static void main(String[] args) {
	APIClient obj = new APIClient();
	obj.sendRequest("Name");
	obj.sendRequest("Age", "Email-id", false);
}
}