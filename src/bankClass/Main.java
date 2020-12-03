package bankClass;

public class Main {

	public static void main(String[] args) {
		Bank banks[] = new Bank[4];
		
		
		
		banks[0] = new Bank(123,(float) Math.round(Math.random() * 100000)/100,"Janet");
		banks[1] = new Bank(456,(float) Math.round(Math.random() * 100000)/100,"Brian");
		banks[2] = new Bank(789,(float) Math.round(Math.random() * 100000)/100,"Lizzy");
		banks[3] = new Bank(321,(float) Math.round(Math.random() * 100000)/100,"Sam");
		
		Bank sorted[]  = sortBankAccounts(banks);
		
		for(Bank bank: sorted) {
			System.out.println(bank);
		}

	}
	
	public static Bank[] sortBankAccounts(Bank[] banks) {
		Bank temp[] = new Bank[banks.length];
		
		for(int i = 0; i < temp.length; i++) {	
			float max = 0;
			int maxIdx = -1;
			for(int j = 0; j < banks.length; j++) {
				if(banks[j] != null && banks[j].getBalance() > max) {
					max = banks[j].getBalance();
					maxIdx = j;
				}	
			}
			temp[i] = banks[maxIdx];
			banks[maxIdx] = null;
		}		
		return temp;
	}
 
}
