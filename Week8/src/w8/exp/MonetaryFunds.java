package w8.exp;

public abstract class MonetaryFunds {
	public abstract void withdraw(double amount) throws NegativeBalanceException;
}
