package sel;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number =8, number1=0, number2= 1;
		int number3;
		for (int i=0; i<=number; i++) {
			System.out.print(number1 + ", ");
			number3= number1+ number2;
			number1= number2;
			number2= number3;
		}
	}

}
