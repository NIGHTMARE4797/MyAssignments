package week3day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class FindSecondLargestNumber {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	//index value start from'0'
			
			List<Integer> value=new ArrayList<Integer>();
			value.add(3);
			value.add(2);
			value.add(11);
			value.add(4);
			value.add(6);
			value.add(7);
		

			System.out.println(value);
			
			System.out.println("Total size of List :"+value.size());
		
			
			Collections.sort(value);
			System.out.println(value);
			
			System.out.println("Second largest number:"+value.get(4));
		}}	
