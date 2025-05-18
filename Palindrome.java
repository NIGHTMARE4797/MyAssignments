package sel;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=101; 
		int output=0; 
		int rem; 
		for (int i=input;i>0;i=i/10) 
				{
			         rem= i%10; 
			        	        
	output=(output*10)+rem;
		}
		
		{
			if (input==output)
				
				System.out.println("Number is palindrome");
			else
				System.out.println("Number is not palindrome");
			
	}
	}

}
