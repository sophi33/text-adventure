public class LoopExercise
{

public static void main(String args[]){

	int n = 15;
	int result = n;

    for(int i = 1; i < n; i++){

         result = result * (n - i);
    }
    System.out.println(result);
      
   }          

}