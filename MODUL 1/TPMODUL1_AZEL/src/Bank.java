import java.util.ArrayList;

public class Bank {
    ArrayList<Account> Accounts;
	
	
	public void setAccounts(ArrayList<Account> accounts) {
		Accounts = accounts;
	}
	public Bank() {
		this.Accounts = new ArrayList<>();
	}
	public void AddAccount(Account account) {
		Accounts.add(account);
    }
	public void RemoveAccount(String AccountNumber) {
	        for (Account account : Accounts) {
	            if (account.getAccountNumber().equals(AccountNumber)) {
	            	Accounts.remove(account);
	                System.out.println("Akun " + account.getName() + " Berhasil Dihapus!");
	                break;
	            }
	        }
	}
	
	public Account GetAccount(String AccountNumber) {
        for (Account account : Accounts) {
            if (account.getAccountNumber().equals(AccountNumber)) {
                return account;
            }
        }
        return null;
    }
	
	public ArrayList<Account> getAllAccounts() {
		return Accounts;
	}
}


