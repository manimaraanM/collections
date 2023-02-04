package collections;

import java.util.ArrayList;
import java.util.List;

public class SampleClassList {
	public static void main(String[] args) {
		
		List<numbers> n1=new ArrayList<numbers>();
		
		numbers n2=new numbers(10,5);
		
		
		
		for(int i=0;i<5;i++) {
			n1.add(n2);
		}
		
		System.out.println(n1.size());
		for(numbers num:n1) {
			//System.out.println(num.getNum2());
			num.display();
			
		}
		
		
		
	}
	
	

}
