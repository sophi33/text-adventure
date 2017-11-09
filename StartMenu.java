
public class StartMenu implements Menu{

		public StartMenu(){
		
		}
		
		//menu selection
		public void selection(int option){
		
		switch(option){
		case 1: 
			System.out.println("Starting game!");
			break;
			
		case 2: 	
			System.out.println("Loading game!");
			break;
			
		default:
			System.out.println("Goodbye!!!!!!!!!!!!!!");
			break;

			}
		}
		
		//draws the menu
		public void drawMenu(){
			System.out.println(" -  MENU - ");
			System.out.println("  1. START GAME  ");
			System.out.println("  2. LOAD GAME  ");
			System.out.println("  3. EXIT  ");
			System.out.println(" Choose an option ");


		}

	
}