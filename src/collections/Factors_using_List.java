package collections;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Factors_using_List {

	
	static void factors(int userNumber) {
		// Write your code below this line
		List<Integer> num=new ArrayList<>();
		for(int i=1;i<userNumber;i++) {
			if(userNumber%i==0) {
				num.add(i);
			}
		}
		System.out.println(num);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int userNumber = in.nextInt();
		factors(userNumber);
	}
	
}
