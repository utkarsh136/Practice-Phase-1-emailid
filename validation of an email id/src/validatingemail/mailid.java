package validatingemail;

import java.util.Scanner;

public class mailid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter your Email: ");
	      String emailid = sc.next();
	      String check = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
	      //Matching the given phone number with regular expression
	      boolean result =emailid  .matches(check);
	      if(result) {
	         System.out.println("Given email-id is valid");
	      } else {
	         System.out.println("Given email-id is not valid");
	      }
		// TODO Auto-generated method stub
	      
	}

}
