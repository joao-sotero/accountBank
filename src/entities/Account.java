
package entities;

	public class Account {
	
		private int accountNumber; 
		private String accountHolder;
		private double balance;
		
		public Account() {
			
		}
		
		
		public Account(int accountNumber, String accountHolder) {
			this.accountNumber = accountNumber;
			this.accountHolder = accountHolder;
		}
		
		
		
		public Account(int accountNumber, String accountHolder, double balance) {
			super();
			this.accountNumber = accountNumber;
			this.accountHolder = accountHolder;
			this.balance = balance;
		}



		public int getAccountNumber() {
			return accountNumber;
		}


		public void setAccountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
		}


		public String getAccountHolder() {
			return accountHolder;
		}


		public void setAccountHolder(String accountHolder) {
			this.accountHolder = accountHolder;
		}

		
		public void deposit(double deposit ) {
			balance += deposit; 
		}

		public void withdraw(double withdraw) {
			balance -= withdraw + 5 ;
		}
	
		public String toString() { 
			return "Account: " 
					+ accountNumber
					+ ", HOLDER: " 
					+accountHolder
					+", BALANCE: $ " 
					+ balance;
}
		}