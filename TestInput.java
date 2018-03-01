			/*
				Test string manipulation and user input validation	
				*/

			import java.util.Scanner; //import for user input
			public class TestInput{


			
					//main method

				public static void main(String[]args){


						//instantiate Scanner object to get user input
					Scanner input = new Scanner(System.in);
					String userName = "";
					int letterCount = 0;
					int numberCount = 0;

					//prompt the user for userName
					System.out.println("Create a username. ");
					System.out.println("Username must be at least 4 characters long \n"
						+ "with at least 3 letters and 1 number. ");


						while(true){
									//get user response
									userName = input.next();


									System.out.println("You chose the username: " + userName);


									//check user input is at least 4 characters
										if(userName.length() >= 4){	
											System.out.println("Hi, " + userName);
											break;
										}
										else{//username is not at least 4 characters, tell the user that there is an error with given username
											System.out.println("Username needs to be at least 4 characters long");
										}

						//check each letter in username for a number
						for(int i = 0; i < userName.length(); i++){

							if(Character.isDigit(userName.charAt(i)))
								numberCount++;  //numberCount = numberCount + 1
						

						//check if the current character is a letter
						if(Character.isLetter(userName.charAt(i))){

								letterCount++;
							}
						}
									}

				if (numberCount > 0 && letterCount > 2){
					System.out.println("Your username passes validation. ");
				}

				else{
					System.out.println("Username needs at least 3 characters and at least 1 number. ");
				}

						}
				}

		