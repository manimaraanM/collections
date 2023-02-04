package collections;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Sum_using_List {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1, num2, num3, num4;
		num1 = in.nextInt();
		num2 = in.nextInt();
		num3 = in.nextInt();
		num4 = in.nextInt();
		sumList(num1, num2, num3, num4);
		
	}
	static void sumList(int num1, int num2, int num3, int num4) {
		
		int num5=num1+num2+num3+num4;
		List<Integer> numList=Arrays.asList(num1,num2,num3,num4,num5);
		System.out.println(numList);
	}

}
/*Create a new List of integers: 
 * Given four integer numbers stored in the variables num1, num2, num3, and num4, create a List that stores all of the values,
 *  and stores the sum of all the values in the last element in the List. Print the List to the console.
 */