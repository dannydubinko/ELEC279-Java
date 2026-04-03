package w8.exp;

public class ATM {
	public void opWithdraw(double amount, BankAccount ac) {
		try {
			ac.withdraw(amount);
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.print(e.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ac = new BankAccount();
		ac.setBalance(500);
		
		ATM op = new ATM();
		op.opWithdraw(700, ac);
	}

}
