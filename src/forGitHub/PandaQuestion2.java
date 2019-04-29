package forGitHub;

import java.util.Scanner;

public class PandaQuestion2 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in); 
		int answer = 4;
		int answer1 = 0;
	
		
		 do {	
			
		System.out.print("What is the best thing about pandas? ");
		 
		 System.out.println("");
		 	System.out.println("1. They are cute");
			System.out.println("2. They are fluffy");
			System.out.println("3. They'll eat your face off");
			System.out.println("4. All of the above");
		System.out.println("Answer: ");
			answer1 = in.nextInt();
		
		if(answer1 != answer) {
		 System.out.println("Not quite, try again? ");
		 boolean input2 =in.nextBoolean();
			
			if(input2 == true) {
				System.out.println("Awesome lets try again!");
				
				
			}//supposed to loop back to beginning but is instead skipping to the end
			else if (input2 == false) {
				System.out.println("Aww sad panda....");
				break;//skips to the end script
			
			}
			
		}//end first if statement
		else if(answer1==answer ) { 
				System.out.println("Correct! Pandas are awesome");
				break;
		}//end else if and 
		}while(answer1 == 4); {
			
			 System.out.println("Have a nice day!");
		 }//while end
				
			
			}
						
		 }//block end
	
		

