package CH2_Elementary_prog_DL;
import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        float marks;
        float attendence;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter ur marks between 1 and 100: ");
        marks = Sc.nextFloat();
        System.out.print("Enter ur attendence in persentage without % sign");
        attendence = Sc.nextFloat();
        if(marks >=85 && marks <100){
            if(attendence >= 75){
                System.out.println(" garde A+");
            }
            else
            System.out.println("Grade A");
        }
        else if(marks >=70){
            if(attendence >= 75){
                System.out.println("grade A");
            }
            else
                System.out.println("grade B+");
        }
        else if(marks >= 60){
            if(attendence >=75){
            System.out.println("grade B+");
            }
            else 
                System.out.println("grade B");

        }
        else if(marks >= 50){
            if(attendence>=75){
                System.out.println("grade B");
            }
            else
                System.out.println("grade c+");
        }
        else if(marks > 40){
            if(attendence >= 75){
                System.out.println("grade c+ "); 
            }
            else
                System.out.println("grade c");
        }
        else if (marks>=40){
            if(attendence >=75){
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