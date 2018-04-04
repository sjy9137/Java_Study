package account;

public class Account {
	
	static final int MIN_BALANCE =0;
	static final int MAX_BLANCE = 1000000;
	
	private int Balance;

	void setBalance(int Balance) {
		if (Balance < MIN_BALANCE || Balance > MAX_BLANCE) {
			this.Balance = this.Balance;
		} else {
			this.Balance = Balance;
		}
	}

	int getBalance() {
		return this.Balance;
	}
}
