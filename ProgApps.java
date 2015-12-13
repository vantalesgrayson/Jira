import java.util.*;

/**
 *This class gets the name of a user and its basic information
 *Name:
 *Age:
 *Birthdate:
 *Address:
 **/
public class ProgApps{
	Scanner kbd = new Scanner(System.in);
	String name = "";
	int age = 0;
	String date = "";
	String address = "";
	
	
	public static void main(String []args){
		ProgApps toRun = new ProgApps();
		toRun.run();
		
	}
	
	/**
	 *Return a String variable for the name, birthdate, and address
	 */
	public String inputString(){
		String toReturn = kbd.nextLine();
		return toReturn;
	}
	/**
	 *Return an int variable for the age
	 */
	public int inputInteger(){
		int number = kbd.nextInt();
		return number;
	} 
	
	public void run(){
		System.out.println("Please input your name: ");
		name = inputString();
		System.out.println("Please input your age: ");
		//input for age
		System.out.println("Please input your birthdate(mm/dd/yyy): ");
		//input for birthdate use inputString method
		System.out.println("Please input your address: ");
		//input for address use inputString method
		printResults();
	}
	public void printResults(){
		System.out.println("Your Name: "+ name);
		// Print for age
		// Print for birthdate
		// Print for address
	}
}