package userException;

public class Account {
	//�ʵ�
	private long balance;
	
	//������
	public Account() {
		
	}
	//�ż���
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
			throw new SjyException("�ݾ��� �����Ͽ� ������ �Ұ��� �մϴ�.");
		}
	}
}
