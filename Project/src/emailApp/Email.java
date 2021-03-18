package emailApp;

import java.util.Scanner;

public class Email {
   
	private String firstName;
	private String lastName;
	private String password;
	private String alternateEmail;
	private int mailboxCapacity;
	private String department;
	
	
	// Receiving firstname and lastname
	public Email(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created:"+" "+this.firstName +" "+this.lastName);
		
		// Calling the method for department
		this.department = setDepartment();
		System.out.println("Department"+":"+ this.department);
	}
	
	// Asking for department
	
	private String setDepartment() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the department\n1 Sales\n2 Development\n3 Accounting\n0 none\nDepartment:");
		int depChoice = in.nextInt();
		if(depChoice==1) {
			return "sales";
		}else if(depChoice==2) {
			return "dev";
		}
		else if(depChoice==3) {
			return "acct";
		}
		else {
			return "";
		}
	}
	
	// Generating a random password 
	
	// Setting the mailbox capacity

	// Setting an alternate email
	
	// Changing password
}
