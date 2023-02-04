package collections;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Product_list {
	public static void main(String[] args) {
	    //DO NOT CHANGE CODE BELOW
		Scanner in = new Scanner(System.in);
		int indexVal = in.nextInt();
		List<String> productList = new ArrayList<>(); 
		
		productList.add("Macbook");
		productList.add("HP Notebook");
		productList.add("iPhone 12");
		productList.add("Acer Aspire");
		productList.add("Windows Surface");
		productList.add("Galaxy S20");
		//DO NOT CHANGE CODE ABOVE
		
		// Write your code below this line
		if(indexVal>=0 && indexVal<productList.size()) {
			for(int i=0;i<productList.size();i++) {
				if(indexVal == i) {
					System.out.println(productList.get(i));
				}
			}
			
		}
		else {
			System.out.println("No product can be found with that product number.");
		}
	}
}