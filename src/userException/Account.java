package userException;

public class Account {
	//필드
	private long balance;
	
	//생성자
	public Account() {
		
	}
	//매서드
	public long getBlance() {
		return this.balance;
	}
	public void Deposit(int money) {
		this.balance += money;
	}
	
	public void withdraw(int money) throws SjyException {
		if(this.balance >= money) {
			balance -= money;
		}else {
			throw new SjyException("금액이 부족하여 인출이 불가능 합니다.");
		}
	}
}
