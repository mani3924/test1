import java.util.Scanner;

class SimpleCompound
{
Public Static void main(String [] args)
{
Scanner scr =new Scanner(System.in);
System.out.println("Enter the Principal: ");
int principal=scr.nextInt();

System.out.println("Enter the Rate: ");
double rate=scr.nextDouble();

System.out.println("Enter the time: ");
double time=scr.nextDouble();

double s_interest= (principal*rate*time)/100;
double amount= principal * Math.pow(1+(rate/s_interest),s_interest*time);
double c_interest= amount- principal;

System.out.println("Principal :"+ principal);

System.out.println("Rate :"+ rate);

System.out.println("Time :"+ time);

System.out.println("Simple Interest :"+ s_interest);

System.out.println("Compound Interest :"+ c_interest);

}
}
