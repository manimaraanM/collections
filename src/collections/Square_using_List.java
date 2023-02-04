package collections;



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Square_using_List {

	static List squaredList(int num1, int num2, int num3, int num4, int num5) {
	    // Add your code below this line  
	    List<Integer>	squaredNums=Arrays.asList(num1*num1,num2*num2,num3*num3,num4*num4,num5*num5);
	    
	    return squaredNums;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		int num4 = in.nextInt();
		int num5 = in.nextInt();
		
		System.out.println(squaredList(num1,num2,num3,num4,num5));
	}
}
