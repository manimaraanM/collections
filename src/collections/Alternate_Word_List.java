package collections;

/*Every other: Given a List of five (5) words entered by the user, create a new List called newList that 
 * contains every other List item from the original List starting with the first item.

Print (to the console) the old List using "The old List is: ", and the new List using "The new List is: "
*/


import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Alternate_Word_List {

	static void halfList(List<String> words) {
		// Add your code below this line 
		List<String> newwords=new ArrayList<>();
		for(int i=0;i<words.size();i++) {
			if(i%2==0) {
				newwords.add(words.get(i));
			}
		}
		
		System.out.println("The old List is:" +words);
		System.out.println("The new List is: " +newwords);
		Collections.sort(newwords);
		System.out.println("The new sorted list is: " +newwords);
		// Add your code above this line 
	}

    // DO NOT CHANGE THE CODE BELOW THIS LINE
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word1, word2, word3, word4, word5;
		word1 = in.nextLine();
		word2 = in.nextLine();
		word3 = in.nextLine();
		word4 = in.nextLine();
		word5 = in.nextLine();
		List<String> words = new ArrayList<>();
		words.add(word1);
		words.add(word2);
		words.add(word3);
		words.add(word4);
		words.add(word5);
		
		halfList(words);
		
	}
}