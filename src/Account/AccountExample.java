package Account;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();

		account.SetBalance(10000);
		System.out.println("���� �ܰ� : " + account.getBalance());

		account.SetBalance(-100);
		System.out.println("���� �ܰ� : " + account.getBalance());

		account.SetBalance(2000000);
		System.out.println("���� �ܰ� : " + account.getBalance());

		account.SetBalance(300000);
		System.out.println("���� �ܰ� : " + account.getBalance());
	}
}
