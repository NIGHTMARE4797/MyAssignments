package week3day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMissingElement {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	//index value start from'0'
			Integer[] inputs = {1,2,3,4,10,6,8};
			
			List<Integer> Numbers=new ArrayList<Integer>(Arrays.asList(inputs));
			Collections.sort(Numbers);
			System.out.println(Numbers);
			
			int first = Numbers.get(0);
			int last = Numbers.get(Numbers.size()-1);
			
			
			for (int i = first+1; i<last; i++) {
				if(!Numbers.contains(i)){
					System.out.println("Missing Element  :"+i);
			}
			
			}
			}	
		}



	
		

	
	

	
