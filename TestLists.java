import java.util.*;



public class TestLists{

	//main method, start of this program
	public static void main(String[] args){
		
		
		
		int num1 = 3; //100, 56
		String word = "3"; //"word", "cat", "sdkfnkjndkjvnsk!"
		boolean b = true; //false
		char character = '3'; //'x', '!'
		double decimalNum = 3.3; //o.3333, 5.234, 1.1
		
		//implement array
		String[] names = {"John", "Kayden", "Alex", "Sophie", "Benjy", "Ethan"};
		
		int[] listOfNum = {1, 85, 2, 3, 4};
		
		//System.out.println(names[1]);
		
		System.out.println(listOfNum[0]);
		System.out.println(listOfNum[1]);
		System.out.println(listOfNum[2]);
		System.out.println(listOfNum[3]);
		System.out.println(listOfNum[4]);
//		System.out.println(listOfNum[5]);


		listOfNum[1] = 2; //overwrite 85 with 2

		
			for(int index = 0; index < listOfNum.length; index++){
				System.out.println(listOfNum[index]);
			}
			
			
			
			ArrayList<String> words = new ArrayList<String>();
			words.add("pink"); //add elements
			words.add("time");
			
			System.out.println(words.get(0)); //get first element

			
			
		}
	
	}