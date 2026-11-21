package CH2_Elementary_prog_DL;
import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        
        Scanner Sc =new Scanner(System.in);
        System.out.print("Enter a year to check whether it is leep or not : ");
     int year =Sc.nextInt();
     boolean isleapYear =(year % 4 ==0)&&(year % 100 !=0)||(year % 400 ==0);
     System.out.println(year+" is a leap year? "+isleapYear);
    }
    
}
