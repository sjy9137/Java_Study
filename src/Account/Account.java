package Account;

public class Account {
	private int Balance;

	void SetBalance(int Balnce) {
		if (Balnce < 0) {
			this.Balance = this.Balance;
		} else if (Balnce > 1000000) {
			this.Balance = this.Balance;
		} else {
			this.Balance = Balnce;
		}
	}

	int getBalance() {
		return this.Balance;
	}
}
