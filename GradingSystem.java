package CH2_Elementary_prog_DL;
import java.util.Scanner;
/*This code calculates grade on the basis of marks and 
attendence ,also uses nested condition: if grade is A+
and attendence is less than 75 grade reduced to----->A due to low attendence*/

public class GradingSystem {
    public static void main(String[] args) {
        float marks;
        float attendance;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter your marks between 1 and 100: ");
        marks = Sc.nextFloat();
        System.out.print("Enter your  attendence in persentage without % sign");
        attendance = Sc.nextFloat();
        if(marks >=85 && marks <100){
            if(attendance >= 75){
                System.out.println(" grade A+");
            }
            else
            System.out.println("Grade A");
        }
        else if(marks >=70){
            if(attendance >= 75){
                System.out.println("grade A");
            }
            else
                System.out.println("grade B+");
        }
        else if(marks >= 60){
            if(attendance >=75){
            System.out.println("grade B+");
            }
            else 
                System.out.println("grade B");

        }
        else if(marks >= 50){
            if(attendance>=75){
                System.out.println("grade B");
            }
            else
                System.out.println("grade c+");
        }
        else if(marks => 40){
            if(attendance >= 75){
                System.out.println("grade c+ "); 
            }
            else
                System.out.println("grade c");
        }
        else if (marks<40){
            if(attendance >=75){
                System.out.println("grade c ");
            }
            else
                System.out.println("you failed");
        }
        else {
            System.out.println("plz enter valid marks or attendence");
        }
        
        
    }
    

}

