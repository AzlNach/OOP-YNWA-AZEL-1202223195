public class Account {
    private String Name;
	public String AccountNumber;
	public double Balance;
	 
	public Account(String Name,String AccountNumber,double Balance) {
		this.Name=Name;
		this.AccountNumber=AccountNumber;
		this.Balance=Balance;
	}
	public void deposit(double amount_deposite) {
		Balance +=amount_deposite ; 
		System.out.println("Saldo akun "+Name+" setelah menyetor: "+ Balance);
		
	}
	
	public boolean withdraw(double amount_withdraw) {
		if (Balance >= amount_withdraw) {
			Balance -= amount_withdraw;
			System.out.println("Saldo akun " + Name + " setelah menarik uang :" + Balance );
			return true;
		}
		System.out.println("Saldo Anda tidak cukup");
		return false;
	}
	
	
	
	 public String getName() {
		return Name;
	}

	
	public String getAccountNumber() {
		return AccountNumber;
	}

	
	public double getBalance() {
		return Balance;
	}
}
