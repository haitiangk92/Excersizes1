package bankClass;

public class Bank {
	private int acctNum;
	private float balance;
	private String name;
	
	public Bank() {
		
	}

	public Bank(int acctNum, float balance, String name) {
		this.acctNum = acctNum;
		this.balance = balance;
		this.name = name;
	}

	public int getAcctNum() {
		return acctNum;
	}

	public void setAcctNum(int acctNum) {
		this.acctNum = acctNum;
	}

	public float getBalance() {
		return balance;
	}

	private void setBalance(float balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean deposit(float amount) {
		if(amount > 0) {
			balance += amount;
			return true;
		}
		
		return false;
	}
	
	public int withdraw(float amount) {
		int returnVal = 1;
		
		if(amount < 0) {
			returnVal = -1;
		}else if(amount > balance) {
			returnVal = 0;
		}else {
			balance -= amount;
		}
		
		return returnVal;
	}

	@Override
	public String toString() {
		return "Bank [acctNum = " + acctNum + ", balance = " + balance + ", name = " + name + "]";
	}
	
	
}
