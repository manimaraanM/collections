package collections;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class PrintIndex_List {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char userLetter = in.next().charAt(0);
		
		List<Character> alphabet = new ArrayList<>();
		for (int i = 97; i < (97+26); i++) {
		    alphabet.add((char) i);
		}
		
		findLetter(alphabet, userLetter);
	}
	
	static void findLetter(List alphabet, char userLetter) {
		
	
		int valueIndex = alphabet.indexOf(userLetter);
		System.out.println(valueIndex);

}
}
/*Print Index of userLetter: Given a List of Character called alphabet,
search the list for the Character stored in userLetter and print to the console the index value of that Character.
*/