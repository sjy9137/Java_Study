package userException;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		
		account.Deposit(20000);
		System.out.println(account.getBlance());
		
		try {
			account.withdraw(10000);
			account.withdraw(10000);
			account.withdraw(10000);
			System.out.println(account.getBlance());
		}catch(SjyException e) {
			e.printType();
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}
	}
}
