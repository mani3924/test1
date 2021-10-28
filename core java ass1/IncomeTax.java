import java.util.Scanner;

public class IncomeTax
 {
    public static void main(String[] args)
   {
        Scanner s=new Scanner(System.in);
        double tax=s.nextDouble();
        if (tax>=0 && tax<=180000) 
	{
            System.out.println("tax payable in % is : NILL ");
        }
        else if(tax>180000 && tax<=300000) 
	{
            System.out.println(" tax payable in % is : 10 ");
        }
        else if(tax>300000 && tax<=500000) 
	{
            System.out.println(" tax payable in % is : 20 ");
        }
        else if(tax>500000 && tax<=1000000) 
	{
            System.out.println(" tax payable in % is : 30 ");
        }
        else
	{

            System.out.println("tax payable in % is : 40 ");
        }
    }
}
