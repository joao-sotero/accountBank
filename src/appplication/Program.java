package appplication;

import java.util.Locale;

import java.util.Scanner;
import entities.Account;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account acc = new Account();
				
		System.out.println("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine(); 
	    String accountHolder = sc.nextLine();
	    
	    System.out.println("Is there na initial deposit:(S/N)? ");
	    char initialDeposit = sc.next().charAt(0);   
	    
	    if(initialDeposit == 's') {
	    
	    	System.out.println("Enter initial deposit value: ");
	    	double balance = sc.nextDouble();
	    	 acc = new Account(accountNumber, accountHolder, balance);
	  
	    }else {
	    	
	    	 acc = new Account(accountNumber, accountHolder);
	    	
		   }
	    
	    
	    System.out.println("Account data: ");
	    System.out.println(acc);
	    
	    System.out.println();
	    System.out.println("Enter a deposit value: ");
	    double deposit = sc.nextDouble();
	    acc.deposit(deposit);
	    System.out.println(acc);
	    
	    System.out.println();
	    System.out.println("Account data: ");
	    System.out.println("Enter a withdraw value:  ");
	    double withdraw = sc.nextDouble();
	    acc.withdraw(withdraw);
	    System.out.println(acc);
	    
	    
	    
	    
	    
	    
	    
	    sc.close();
	}
}

