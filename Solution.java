package com.icici;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		//scanner 
		//upcast
		//while
		//display menu
		//switch case

		Scanner scan=new Scanner(System.in);

		Bank bank=new BankImpl(1000);

		System.out.println("Welcome to ICICI Bank");
		while(true) {

			System.out.println("1.Deposit Amount\n2.Withdraw Amount\n3.View Balance\n4.Exit");

			int choice =scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the amount to be deposited:");
				int amountToDeposit=scan.nextInt();
				bank.deposit(amountToDeposit);				//bank.deposit(scan.nextInt());
				break;
			case 2:
				System.out.println("Enter the amount to be withdrawn");
				int amounttowithdraw=scan.nextInt();
				bank.withdraw(amounttowithdraw);			//bank.withdraw(scan.nextInt());
				break;
			case 3:
				System.out.println("Available Balance: Rs:"+bank.getBalance() );
				break;
			case 4:
				System.out.println("Thank You.....Visit Again!!!!");
				System.exit(0);

			default:
				try {
					throw new InvalidChoiceException("Invalid Choice");
				}
				catch(Exception e){
					String message=e.getMessage();
					System.out.println(message);

				}

			}
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");

		}
	}
}
