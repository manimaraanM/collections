package collections;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Listcreation {
	
	static void createList(int endNum) {
		List<Integer> list=new ArrayList<Integer>();
		for(int i=1;i<=endNum;i++) {
			list.add(i);
		}
		System.out.println(list);
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int endNum = in.nextInt();
		
		createList(endNum);
	}

}
