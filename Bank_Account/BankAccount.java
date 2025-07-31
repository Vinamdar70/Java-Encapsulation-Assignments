package Bank_Account;
import java.util.*;
public class BankAccount {
      
	private int accountNumber;
	private String accountHolder;
	private double balance;
	public int amount;
	
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		if(balance>0) {
		this.balance = balance;
		}else {
			System.out.println("Error: Cannot enter negative Balance.");
		}
	}
	
	public void deposit(int amount) {
		this.amount=amount;
		balance=balance+amount;
		
	}
	
	public void withdraw(int amount) {
		this.amount=amount;
		if(balance>= amount ) {
			balance=balance-amount;
		}else {
			System.out.println("Insufficent Balance...");
		}
	}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	BankAccount b1=new BankAccount();
	System.out.println("Enter the Balance.");
	b1.setBalance(sc.nextDouble());
	int ch;
	do {
		System.out.println("============SBI Bank=============");
	System.out.println("Enter the Choice");
	System.out.println("1.Deposite Amount");
	System.out.println("2.Withdraw Amount");
	System.out.println("3.Exit");
	System.out.println("================================");
	 ch=sc.nextInt();
	switch(ch) {
	       case 1:
	    	   System.out.println("Enter the Amount: ");
	    	   int money=sc.nextInt();
	    	   b1.deposit(money);
	    	   System.out.println("Remaining Balance is : "+b1.getBalance());
	    	   break;
	    	  
	       case 2:
	    	   System.out.println("Enter the Amount: ");
	    	   int money1=sc.nextInt();
	    	   b1.withdraw(money1);
	    	   System.out.println("Remaining Balance is : "+b1.getBalance());
	    	   break;
	    	   
	       case 3:
	    	    System.out.println("Visit Again. Thank you!");
				break;
				
			default:
				System.out.println("Please Enter Correct Choice... ");
				break;
		
	}
	}while(ch!=3);
}
	
	
}
