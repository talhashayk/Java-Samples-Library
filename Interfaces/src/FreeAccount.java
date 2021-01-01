
public final class FreeAccount extends AbstractAccount{

	public FreeAccount(int accNum) {
		super(accNum);
	}

	public int withdraw(int amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("Negative Amount");
		}
		
		final int currentBalance = getBalance();
		
		if (currentBalance < amount) return 0;
		
		setBalance(currentBalance - amount);
		
		return amount;
	}

}
