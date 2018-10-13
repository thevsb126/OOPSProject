package watermanagement;

import java.util.Scanner;
import java.io.*;

public class Mainclass {

	public static void main(String[] args) throws Exception{
		File f1 = new File(".\\Family.txt");
		File f2 = new File(".\\Factory.txt");
		InputStream in1 = new FileInputStream(".\\Family.txt");
		OutputStream out1 = new FileOutputStream(".\\Family.txt");
		InputStream in2 = new FileInputStream(".\\Factory.txt");
		OutputStream out2 = new FileOutputStream(".\\Factory.txt");
		Scanner sc = new Scanner(System.in);
		int opt = 1, opt1 = 1, opt2, opt3, opt4, opt5; String username, pass;
		int fno, num1, num2;
		Family[] fam = new Family[100]; Factory[] fact = new Factory[100];
		for(int j=0;j<100;j++) {
			fam[j] = new Family();
			fact[j] = new Factory();
		}
		
		do {
			System.out.println("Welcome to the water management system!");
			System.out.println("Which person are you?");	
			System.out.println("1. Admin");
			System.out.println("2. User");
			System.out.println("3. Exit");
			System.out.print("\nEnter your choice:");
			opt2 = sc.nextInt();
			if(opt2==1) {
				
				do {
					int i = 4;
					
					while(i>0) {
						
						if((i<4)&&(i>0)) {
							System.out.println("Wrong username/password. Number of tries left: " + i);
						}
						
						if(i==0) {
							System.out.println("Wrong credentials entered more than 3 times. Terminating application.");
							return;
						}
						
						System.out.println("Enter username: ");
						username = sc.next();
						System.out.println("Enter password: ");
						pass = sc.next();
						
						if(username.equals("rajasekar")&&pass.equals("sekar123")) {
							do {
								System.out.println("Welcome Rajasekar! What do you want to do?");
								System.out.println("1. Enter data");
								System.out.println("2. Modify existing data");
								System.out.println("3. Delete data");
								System.out.println("4. Check info");
								System.out.println("5. Log off");
								System.out.println("Enter your choice: ");
								opt3 = sc.nextInt();
								switch(opt3) {
								case 1: System.out.println("Is the data about a family(1) or a factory(2)?");
										opt4 = sc.nextInt();
										if(opt4==1) {
											System.out.println("Enter the family number:");
											fno = sc.nextInt();
											System.out.println("Enter the number of adults:");
											num1 = sc.nextInt();
											System.out.println("Enter the number of minors:");
											num2 = sc.nextInt();
											Family temp = new Family(fno, num1, num2);
											fam[fno].insert(fam, fno);
										}
										else {
											System.out.println("Enter the factory number:");
											fno = sc.nextInt();
											System.out.println("Enter the type of the factory:");
											num1 = sc.nextInt();
											System.out.println("Enter the number of workers:");
											num2 = sc.nextInt();
											Factory temp = new Factory(fno, num1, num2);
											fact[fno] = temp;
										}
										break;
										
								case 2: System.out.println("Is the data about a family(1) or a factory(2):");
										opt4 = sc.nextInt();
										if(opt4==1) {
											System.out.println("Enter the index you want to modify:");
											fno = sc.nextInt();
											System.out.println("Enter the new number of adults:");
											num1 = sc.nextInt();
											System.out.println("Enter the new number of minors:");
											num2 = sc.nextInt();
											Family temp = new Family(fno, num1, num2);
											fam[fno] = temp;
										}
										break;
								case 3: System.out.println("Is the data about a family(1) or a factory(2):");
										opt4 = sc.nextInt();
										if(opt4==1) {
											System.out.println("Enter the index of the data you want to delete:");
										}
								case 4: System.out.println("What list do you want to see?(Family=1,Factory=2");
										opt4 = sc.nextInt();
										if(opt4==1) {
											for(int k=0;k<fam.length;k++) {
												fam[k].getDetails();
											}
										}
										else {
											for(int k = 0;k<fact.length;k++) {
												fact[k].getDetails();
											}
										}
										break;
								default: System.out.println("Please enter a valid option.");
										
								}
								System.out.println("Do you want to continue operating?<yes=1,no=0>");
								opt5 = sc.nextInt();
							}while(opt5==1);
							
						}
						
						else {
							i--;
							continue;
						}
					}
					System.out.println("Do you want to login again?<yes=1,no=0>");
					opt1 = sc.nextInt();
				}while(opt1==1);
			}
			else if(opt2==2){
				do {
					System.out.println("Welcome to consumer login!");
					System.out.println("Enter your category:");
					System.out.println("1. Family");
					System.out.println("2. Factory");
					System.out.println("Enter your option:");
					opt2 = sc.nextInt();
					if(opt2==1) {
						System.out.println("Enter your number:");
						fno = sc.nextInt();
						System.out.println("Your details:");
						fam[fno].getDetails();
						System.out.println("Would you like to request for extra water?<yes=1,no=0>");
						opt3 = sc.nextInt();
						if(opt3==1) {
							
						}
					}
				}while(opt1==1);
			}
			else {
				System.out.println("Thank you for using the water management system!");
				return;
			}
		}while(opt==1);

	}

}
