class Employee
{
    float salary = 50000;
    void totalSalary()
    {
        System.out.println("The Employee Salary is :" +salary);

    }
}
class Manager extends Employee
{
    float incentive =15000;
    void totalsalary()
    {
        System.out.println("The Manager Salary is :" +(salary+incentive));
    }
}
class Labour extends Manager
{
    double overtime=6500;
    void totalsalary()
    {
        System.out.println("The Salary of the Labours is"+(overtime+salary));

    }
}
public class EmployeeSalarys
{
    public static void main(String args[])
{
        Labour t = new Labour();
        System.out.println("Total Salary Of Employees In Organisation is "+ (t.salary+(t.incentive+ t.overtime)));

    }
}