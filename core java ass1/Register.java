
import java.util.*;
public class Register 
{
    public static void main(String[] args) 
  {
        Scanner scr = new Scanner(System.in);
        int count = 0;

        System.out.println("Enter the Username");
        String uName = scr.nextLine();

        System.out.println("Enter the Password");
        String uPass = scr.nextLine();

        System.out.println(uName + " you are Registered Successfully");

        System.out.println(" PLEASE ENTER BELOW YOUR LOGIN DETAILS");

            System.out.println("Enter the Username");
            String lName = sc.nextLine();

            System.out.println("Enter the Password");
            String lPass = sc.nextLine();

        while (count <= 2) 
	{

            if ((!uName.equals(lName)) || (!uPass.equals(lPass))) 
		{
                System.out.println("WARNING: USERNAME OR PASSWORD MISMATCH");

                System.out.println("Enter the Username");
                lName= sc.nextLine();

                System.out.println("Enter the Password");
                lPass= sc.nextLine();

          	 } 
			else {
                		System.out.println("YOU ARE LOGGED IN");
                		break;
           		     }
          		  count++;

        }
       		 if (count > 2)	
		 {
            		System.out.println("PLEASE CONTACT ADMIN");
      	 	 }
	
    }
}
