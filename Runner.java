/* this class runs the start of the program
*/



import java.util.ArrayList;
import java.util.Scanner;

	//tesing with main
	public class Runner {
			

		public static void main(String[] args){

			//SPLASH SCREEN
			Splash splash = new Splash();
			splash.splashScreen();
			//splash.endSplashScreen();
			
			//declare Menu object
			StartMenu menu = new StartMenu();
			
			//set up user input
			Scanner input = new Scanner(System.in);
			int option; // will hold user input for menu option
		
			//loop thru menu until user enters exit press 5 - exit
			do{

			 	//draw menu
			 	menu.drawMenu();
				//get user input
				option = input.nextInt();


				if(option == 1){
				
					//declare to start getting user input			
					Scanner scanner = new Scanner(System.in);
					
					//Prompt the user with a question to provide input
					
					System.out.println("Welcome");
					
					System.out.println("What's your name?");
					
					String name = scanner.next();
					
					System.out.println("Hi " + name + "! It's a beautiful morning, and you're just arriving to class.");
					
					System.out.println("How many classmates are here today?");
					
					int numberOfFriends = scanner.nextInt();
					
					//declare an array list 
					ArrayList<Student> list = new ArrayList<>();
					
					
					//initialize a list of students from user input
					
					for(int i = 0; i < numberOfFriends; i++){
						list.add(new Student());
						list.get(i).setGender("female");
						list.get(i).setAge(18);
					
					}			
					
					System.out.println("These are your classmates!");
					
					for(int i = 0; i < list.size(); i++){
						System.out.println(list.get(i));
					}
					
					Teacher t = new Teacher();
					t.setName("Professor Tuy");
					t.setDepartment("Computer Science");
					
					System.out.println("Your favorite teacher, " + t.getName() 
						+ ", part of the " + t.getDepartment() 
						+ " department walks in and starts teaching. \n From your front row seat, you notice that she \n hasn't blinked or taken a breath since she got in.\n Is she sick? There is a stomach bug going around...but \n this is a little unusual. Her skin is looking a bit purple, and you notice that \n it's because her veins are especially \n prominent – she looks as if she's been struck by lightening and electric volts surged across the \n surface of her epidermis. ");

					option = 3;
				}
				else if(option == 2){
					System.out.println("Loading game..."); //to-do: create this option using file IO
					option = 3;
				}

			   	menu.selection(option);

			 }while(option != 3);


	}
}
		