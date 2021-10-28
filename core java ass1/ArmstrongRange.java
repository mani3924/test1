
class ArmstrongRange
{
Public static void main(String [] args)
{
System.out.println(" Armstrong numbers between 100 to 999 :");
for(int j=100;j<999;j++)
{
int t1=j;
int length=0;
	while(t1 !=0)
	{
	length=length+1;
	t1=t1/10;
	}
int t2=j;
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
}
if(arm==j)
{  
   System.out.println(j);
}
}
}