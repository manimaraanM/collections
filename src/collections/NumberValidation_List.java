package collections;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NumberValidation_List {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int endNum = in.nextInt();
	
		beginEnd(endNum);
	}
	
	static void beginEnd(int endNum) {
		// Add your code below this line 
List<Integer> endNumList=new ArrayList<Integer>();
if(endNum>0) {
for(int i=0;i<=endNum;i++) {
	endNumList.add(i);
}
System.out.println("The first number in the List is " +endNumList.get(0));
System.out.println("The last number in the List is " +endNumList.get(endNumList.size()-1));
}
else
{
	System.out.println("Your List cannot be created with a number less than one.");
	
}
		// Add your code above this line
	}
}

