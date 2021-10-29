class Bank
{

    void totalMoneyInBank()
    {
        System.out.println("The Employee total salary is :" );

    }
}
class SavingAcoount extends Bank
{
    float fixedDeposits =200000;
    void totalMoney()
    {
        System.out.println("total money in savings account :" +fixedDeposits);
    }
}
class CurrentAcccount extends SavingAcoount 
{
    double cashCredit=600000;
    void totalMoney()
    {
        System.out.println("The total money in current account "+cashCredit);

    }
}
public class BankTotalMoney
{
    public static void main(String args[])
	{

        CurrentAcccount m=new CurrentAcccount();
      
        m.totalMoney();
        m.totalMoney(); 

        System.out.println("Total Money in the Bank  is "+( m.fixedDeposits+m.cashCredit));

    }
}