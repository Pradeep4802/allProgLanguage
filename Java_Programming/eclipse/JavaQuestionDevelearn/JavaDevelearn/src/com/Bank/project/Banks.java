package com.Bank.project;
import java.util.*;

public class Banks {
	static User us[] = new User[5];
	
	static java.util.Scanner sc = new java.util.Scanner(System.in);
	public static int count = 1;
	public static int generateAccount() {
		return count++;
	}
	
	public static void userDetail(int id) {
		for(User u : us) {
			if(u != null) {
				if(u.getId() == id) {
					System.out.println(u);
				}
			}
		}
	}
	
	
	
	public static void main(String args[]) {
		int id=0,acc;
		String name,email,pass;
		long contact;
		int choice = 0;
		int count = 0;
//		int loginChoice = 0;
		int innerLoginChoice = 0;
		do {
			
			System.out.println("EnTer 1 For Register.");
			System.out.println("      2 For Login.");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("-----------------Registration Page------------------");
				System.out.println("Enter ID, NAME, CONTACT, EMAIL, PASSWORD");
				id = sc.nextInt();
				name = sc.next();
				contact = sc.nextLong();
				email = sc.next();
				pass = sc.next();
				acc = generateAccount();
				us[count++] = new User(id,name,contact,email,acc,pass);
				System.out.println("Account Number: " + acc);
				System.out.println("-----------------Registered Successfully------------------");
				break;
				
			case 2:
				System.out.println("-----------------Login Page------------------");
				System.out.println("-------------Enter Account Number-----------------");
				int accNum1 = sc.nextInt();
				System.out.println("-------------Enter Password-----------------");
				String password = sc.next(); 
				for(User s : us) {
					if(s != null) {
						if(s.getAccount() == accNum1 && s.getPassword().equals(password)) {
							System.out.println("--------------------Login Successfully-----------------");
							do {
								System.out.println();
								System.out.println("Enter 1 Check User Details.");
								System.out.println("      2 Check Balance.");
								System.out.println("      3 Deposit.");
								System.out.println("      4 Withdraw.");
								System.out.println("      5 Exit.");
//								System.out.println("Enter ");
								innerLoginChoice = sc.nextInt();
								switch(innerLoginChoice) {
								case 1:
									userDetail(s.getId());
									break;
								
								case 2:
									System.out.println("------------------CHECK BALANCE---------------------");
									double bal = s.getBalance();
									System.out.println("Balance: " + bal);
									System.out.println("------------------BALANCE CHECKED---------------------");
									break;
									
								case 3:
									System.out.println("------------------Enter the Amount TO DEPOSIT----------------");
									double depositAmount = sc.nextDouble();
									s.setBalance(depositAmount);
									break;
									
								case 4:
									System.out.println("------------------Enter the Amount TO WITHDRAW----------------");
									double withdrawAmount = sc.nextDouble();
									if(withdrawAmount <= s.getBalance()) {
										s.setWithdraw(withdrawAmount);
									}
									else {
										System.out.println("---------Amount is not sufficient----------");
									}
									break;
								
								
								case 5:
									System.out.println("----------------------Exit----------------------");
									break;
									
								default: 
									System.out.println("Enter Correct details: ");
									break;
								}	
								
							}while(innerLoginChoice != 5);
						}
						else {
							System.out.println("----------------------Credential is WRONG!!!---------------------------");
							System.out.println("LOGIN Again!!!");
						}
					}
				}
				break;
				
			default:
				System.out.println("-------------------Wrong Option!!!-----------------------------");
				break;
			}		
		}while(choice != 0);
	
	}
}