package w8.exp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMissMatchExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = 0;
		boolean done = false;
		
	
		while(!done) {
			
			try {
				System.out.println("Enter an Integer");
				number = sc.nextInt();
				done = true;
			}catch(InputMismatchException e) {
				sc.nextLine();
				System.out.println("Not a valid Input");
				System.out.println("Try again");
			}finally{
				System.out.println("Fianlly");
				//sc.close();
				//break;
			}
				
		}
		
		sc.close();
	
	}

}
