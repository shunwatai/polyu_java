import java.util.Scanner;

public class test02 {
		public static void main (String args[]) {
		Scanner user_input= new Scanner(System.in);
		
		String firstname;
		System.out.print("Enter your firstname:");
		firstname=user_input.next();
		
		String lastname;
		System.out.print("Enter your lastname:");
		lastname=user_input.next();

		String fullname;
		fullname=firstname+" "+lastname;
		
		System.out.println("Your name is: "+fullname);
		
		System.out.println("test!!!");
	}
}

