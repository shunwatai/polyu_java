import javax.swing.JOptionPane;
//import java.util.Scanner;


public class dialogbox {
		public static void main (String args[]) {
		//Scanner user_input= new Scanner(System.in);
		
		String firstname;
		//System.out.print("Enter your firstname:");
		firstname=JOptionPane.showInputDialog("First Name", "Enter your first name");
		
		String lastname;
		//System.out.print("Enter your lastname:");
		lastname=JOptionPane.showInputDialog("Last Name", "Enter your last name");

		String fullname;
		fullname="Hello "+firstname+" "+lastname;
		
//		JOptionPane.showMessageDialog(null,fullname,"Name",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,fullname,"Name",JOptionPane.WARNING_MESSAGE);

        String breadth;
        breadth=JOptionPane.showInputDialog("Rectangle Breadth");
        //Integer.parseInt("6");
        int area=Integer.parseInt("6")*Integer.parseInt("2");
        JOptionPane.showMessageDialog(null, "answer="+area);
		
        System.exit(0);
	}
}
