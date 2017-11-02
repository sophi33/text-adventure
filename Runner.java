/* this class runs the start of the program
*/



import java.util.ArrayList;
import java.util.Scanner;


public class Runner {
	//tesing with main

	public static void main(String[] args){
	

		Splash splash = new Splash();
		splash.splashScreen();
		
		
		//declare to start getting user input
		
		Scanner scanner = new Scanner(System.in);
		
		//Prompt the user with a question to provide input
		
		System.out.println("Welcome");
		
		System.out.println("What's your name?");
		
		String name = scanner.next();
		
		System.out.println("Hi " + name + "!");
		
		System.out.println("How many friends do you want?");
		
		int numberOfFriends = scanner.nextInt();
		
		//declare an array list 
		ArrayList<Student> list = new ArrayList<>();
		
		
		//initialize a list of students from user input
		
		for(int i = 0; i < numberOfFriends; i++){
			list.add(new Student());
			list.get(i).setGender("female");
			list.get(i).setAge(18);
		
		}
		
		
		System.out.println("These are your friends!");
		
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
		
		Teacher t = new Teacher();
		t.setName("Professor Tuy");
		t.setDepartment("Computer Science");
		
		System.out.println("You run into your favorite teacher, " + t.getName() + ", part of the " + t.getDepartment() + " department. Their skin looks a little green...");
	
	}

}
		
		