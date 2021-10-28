
import java.util.Scanner;

class Results
 {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter First Subject1  Marks");
        int subject1=scr.nextInt();

        System.out.println("Enter First Subject2 Marks");
        int subject2=scr.nextInt();

        System.out.println("Enter First Subject3 Marks");
        int subject3=scr.nextInt();

        if (subject1>=60 && subject2>=60 && subject3>=60) 
	{
            System.out.println("Passed");
        }
        else if (((subject1>=60&&subject2>=60)) ||  ((subject2>=60&&subject3>=60 )) || ((subject3>=60&&subject1>=60 ))) 
	{
            System.out.println("Promoted");
        }
        else if(subject1>60|| subject2 >60|| subject3>60 || (subject1<60&&subject2<60&&subject3<60))	
	 {
            System.out.println("Failed");
         }
        else
        {
            System.out.println("entered data is invalid");
        }
    }
}
