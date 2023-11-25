package com.icici;

public class BankImpl implements Bank {

	int balance;

	BankImpl(int balance){
		this.balance=balance;
	}


	@Override 
	public void deposit(int amount) {
		System.out.println("Depositing Rs."+amount);
		balance=balance+amount;  					//balance += amount; 	
		System.out.println("Amount Deposited Successfully");
	}

	@Override
	public void withdraw(int amount) {
		if(amount<= balance) {
			System.out.println("Withdrawing Rs."+amount);
			balance=balance - amount;  					 //balance -= amount;
			System.out.println("Amount withdrawn Succseefully");
		}
		//custom exception
		else {
			//InvalidBalanceException ->RTE/E -> getMessage() -> throw ->handle it using try & catch
		try {
			throw new InsufficientBalanceException("Insufficient Balance");
		}
		catch(Exception e){
			String message=e.getMessage();
			System.out.println(message);
		}
	}
	}

	@Override
	public int getBalance() {
		return balance;

	}


}
