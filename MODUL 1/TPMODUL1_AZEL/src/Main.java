public class Main {
    public static void main(String[] args) {
		Bank bank = new Bank();

        Account Azel = new Account("Azel_SI4603", "1202223195", 150000.0);
        Account Dhivi = new Account("Dhivi_SI4603", "1202220022", 200000.0);
        Account Ridho = new Account("Rhido_SI4603", "1202223395", 300000.0);
        
        System.out.println("Saldo Akun "+Azel.getName()+": "+Azel.getBalance());
        System.out.println("Saldo Akun "+Dhivi.getName()+": "+Dhivi.getBalance());
        System.out.println("Saldo Akun "+Ridho.getName()+": "+Ridho.getBalance()+"\n");

        bank.AddAccount(Azel);
        bank.AddAccount(Dhivi);
        bank.AddAccount(Ridho);

      
        Azel.deposit(50000.0);
        Ridho.withdraw(20000.0);

        bank.RemoveAccount("12022001234");

   
        System.out.println("\n"+"Daftar Semua Akun dalam Bank:");
        for (Account account : bank.getAllAccounts()) {
            System.out.println("Nama: " + account.getName() + ", Nomor Akun: " + account.getAccountNumber() + ", Saldo: " + account.getBalance());
        }
	}
}
