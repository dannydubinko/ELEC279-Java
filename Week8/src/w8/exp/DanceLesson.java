package w8.exp;

import java.util.Scanner;

public class DanceLesson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Female Dancers");
		int female = sc.nextInt();
		
		System.out.println("Enter the number of Male Dancers");
		int male = sc.nextInt();
		
		try {
			if(male ==0 && female ==0)
				throw new Exception("Lesson Cancelled, No Students");
			else if(male == 0)
				throw new Exception("Lesson Cancelled, No males");
			else if(female ==0)
				throw new Exception("Lesson Cancelled, No females");
			
			if(male != female)
				throw new ArithmeticException("Numbers missmatch, No pairing");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			sc.close();
		}
	}

}
