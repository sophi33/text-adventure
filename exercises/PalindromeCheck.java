
import java.util.Scanner;
public class PalindromeCheck
{  

	public static void main(String args[])
	{  

		System.out.println("Enter a three-digit number and I will determine whether it is a palindrome!");

		int palindrome = new Scanner(System.in).nextInt();
		        

		 if(isPalindrome(palindrome))
	     {
	        System.out.println("Your number " + palindrome + " is a palindrome!");
	     }
  		 else
  		 {
       		System.out.println("Your number " + palindrome + " is NOT a palindrome :(");
    	 }       
	}
				
	/* Java method to check if number is palindrome or not */
	public static boolean isPalindrome(int number) 
	{
	    int palindrome = number; // copied number into variable
	    int reverse = 0;

		while (palindrome != 0) 
    	{
            int remainder = palindrome % 10;  /* modules operator returns remainder*/ 
            reverse = reverse * 10 + remainder; 

            palindrome = palindrome / 10; /* division operator returns quotient*/
        }

        /* if original and reverse of number is equal means
         number is palindrome in Java */
        if (number == reverse) 
        {
            return true;
        }
        return false;
	}
}



    

        
