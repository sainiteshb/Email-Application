package emailApp;

import java.util.Scanner;

public class Email {
   
	private String firstName;
	private String lastName;
	private String password;
	private String alternateEmail;
	private int mailboxCapacity;
	private String department;
	private int defaultPasswordlength = 10;
	private String companyName = "Ncompany.com";
	private String email;
	
	
	// Receiving firstname and lastname
	public Email(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created:"+" "+this.firstName +" "+this.lastName);
		
		// Calling the method for department
		this.department = setDepartment();
		System.out.println("Department"+":"+ this.department);
		
		// Returning password
		this.password = randomPassword(defaultPasswordlength);
		System.out.println("Password"+" : "+ this.password);
		
		// Combine elements to generate email 
		email = firstName.toLowerCase() + "."+lastName.toLowerCase()+"@"+ department +"."+ companyName;
	    System.out.println("Your Email is: "+ email);
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
	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		char[] password = new char[length];
		for(int i=0;i<length ; i++)
		{
			int rand = (int)(Math.random()*passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
				
	}
	
	// Setting the mailbox capacity

	// Setting an alternate email
	
	// Changing password
}
