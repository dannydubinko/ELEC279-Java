package w8.exp;

public class BankAccount extends MonetaryFunds{
	private double balance;
	
	public void setBalance(double in) {
		this.balance = in;
	}
	public void withdraw(double amount) throws NegativeBalanceException{
		if(amount > this.balance) {
			throw new NegativeBalanceException("Ypou don't have enough money");
		}
		balance -= amount;
	}
}
