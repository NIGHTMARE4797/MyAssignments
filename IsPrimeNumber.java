package sel;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=13;
		boolean primenumber = true;
		for(int i=2;i<=number/2  ;i++)
			if(number%i==0)
			primenumber=false;
		
		
 if(primenumber==false)
        System.out.println("It is not a Prime number");
        else
        	System.out.println("It is a Prime number");
    }}
  

