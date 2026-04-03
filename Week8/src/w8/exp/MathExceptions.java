package w8.exp;

public class MathExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dividing");
		int num = 10;
		int den = 0;
		float result;
		
		try {
			result = num/den;
			System.out.println("Result is "+ result);
		}catch(ArithmeticException err) {
			System.out.println(err.getMessage());
		}
		
		System.out.println("Rest of the code");
	}

}
