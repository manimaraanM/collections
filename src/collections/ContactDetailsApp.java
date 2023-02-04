package collections;


import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;


public class ContactDetailsApp {
	static Scanner s= new Scanner(System.in);
	static Map<Integer,String> contact=new HashMap<Integer,String>();
	static Set<Integer> phoneNbrs= contact.keySet();
	public static void main(String[] args) {
		System.out.println("**App to enter contact details**");
		System.out.println("================================");
		app();
		System.out.println("**Exit App**");
		
	}
	
	private static void app() {
		int option=0;
		int loop=1;
		
			while(loop>=1) {
				display();
				option=chooseOption();
				if(option>0 && option<4)
				switcher(option);	
				else
					loop=-1;
		}
	}
	
	private static void display() {
		System.out.println("Please choose your option:");
		System.out.println("1.View contact Details");
		System.out.println("2.Add new contact");
		System.out.println("3.Delete  contact");
		System.out.println("4.Exit App");
		System.out.println("------------------------------");
	}
	
	private static int chooseOption() {
		return(s.nextInt());	
	}

	private static void switcher(int opt) {
		switch(opt) {
		case 1:
			viewContact();
			break;
		case 2:
			addContact();
			System.out.println(contact);
			break;
		case 3:
			deleteContact();
			break;
		default:
				break;
		}
	}
	
	private static void addContact() {
		contact.put(4792222,"Roy");
		contact.put(4792223,"Mike");
		contact.put(4792224,"William");
		
	}
	
	private static void viewContact() {
		for(int nbr:phoneNbrs) {
		System.out.println(nbr +"-" +contact.get(nbr));
		}
		
	}
	
private static void deleteContact() {
	System.out.println("Please enter number you want to delete");
	int key = s.nextInt();
	if(contact.containsKey(key)){
		contact.remove(key);
		
	}
	}
}
