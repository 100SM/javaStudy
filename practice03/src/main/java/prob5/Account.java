package prob5;

public class Account {
	private String accountNo;
	private int balance;

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Account(String accountNo) {
		this.accountNo = accountNo;
		this.balance = 0;
		System.out.println(this.getAccountNo() + " 계좌가 개설되었습니다.");
	}

	public void save(int money) {
		this.setBalance(this.getBalance() + money);
		System.out.println(this.getAccountNo() + " 계좌에 " + money + "만원이 입금되었습니다.");
	}

	public void deposit(int money) {
		this.setBalance(this.getBalance() - money);
		System.out.println(this.getAccountNo() + " 계좌에 " + this.getBalance() + "만원이 출금되었습니다.");
	}
}