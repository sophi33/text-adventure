/* this class runs the start of the program
*/



import java.util.ArrayList;
import java.util.Scanner;


public class Runner {
	//tesing with main

public static void main(String[] args){

	
	/*
	//call splash object
	Splash splash = new Splash();
	
		//call splash screen	
		splash.splashScreen();
		
		splash.the_endScreen();
		}
	

	*/

	Person casey = new Person();

	casey.setName("Casey");

	System.out.println("Name: " + casey.getName());

	Person mark = new Person("Mark", "cool guy", 45, "75");
	mark.setHealth("33");
	System.out.println("Name: " + casey.getName() + " " + casey.getAge() + " " + mark.getHealth());

	//declare all objects at least one of each

	Student student = new Student ();
	Person fred = new  Person("Fred", "student", 19, "100");

	//declare array of type parent class
	Person[] person = new Person[3];

	// put each object into array

	person[0] = student;
	person[1] = casey;
	person[2] = mark;

	//print out each object in array

	System.out.println(person[0]);
	System.out.println(person[1]);
	System.out.println(person[2]);




	//Student student_casey = new Student("Casey", "Student", 19, "100");
	
	
	
	
	

	}

}
		
		