public class InGameMenu implements Menu{

	public InGameMenu(){
	
	}
	
	public void selection(int option){
	switch(option){
		case 1: 
			System.out.println("You chose: ATTACK ALIEN TEACHER");
			break;
			
		case 2: 	
			System.out.println("You chose: RUN THE HECK OUTTA THERE");
			break;
			
		default:
			System.out.println("You are ripped apart and eaten by your professor!");
			break;
	}
	
	public void drawMenu(){
	
	}
	
	System.out.println(" -  MENU - ");
			System.out.println("  1. ATTACK  ");
			System.out.println("  2. SKIP CLASS  ");
			System.out.println("  3. STAND THERE  ");
			System.out.println(" Choose an option ");
		}
	
}