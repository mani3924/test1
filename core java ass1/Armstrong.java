import java.util.Scanner;
class Armstrong
{
Public static void main(String [] args)
{
System.out.println("Enter a number:");
Scanner scr= new Scanner(System.in);
int num=scr.nextInt();
int t1=num;
int length=0;
	while(t1 !=0)
	{
	length=length+1;
	t1=t1/10;
	}
int t2=num;
int mul=1, arm=0;
	while(t2 !=0)
	{
	int rem =t2%10;
	for(int i=1;i<=length;i++)
	    { 
		mul=mul*rem;
	    }
		arm=arm+mul;
		t2=t2/10;
	}
if(arm==num)
{
   System.out.println(num +"is armstrong");
}
 else
{
	System.out.println(num +"is not a armstrong");
}
}
}