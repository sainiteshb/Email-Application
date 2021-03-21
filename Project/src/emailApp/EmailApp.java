package emailApp;

public class EmailApp {
 
	public static void main(String args[])
	{
		//  Passing the employee name
		Email em1 = new Email("Sai","Nitesh");
		
		// Showing all the info
	        System.out.println(em1.showInfo());
	}
}
