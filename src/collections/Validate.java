package collections;

import java.util.ArrayList;
import java.util.List;

public class Validate {
	public static void main(String[] args) {
		List<Integer> s = new ArrayList<Integer>();

		for(int i =0;i<5;i++) {
			System.out.println(s.add(i));
			//add returns true or false. will not return value added.
			
			//need to use get
			
			System.out.println(s.get(i));
		}
		
		System.out.println(s);

	}

}
