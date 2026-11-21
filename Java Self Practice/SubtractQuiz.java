package CH2_Elementary_prog_DL;
import java.util.Scanner;
public class SubtractQuiz {
    public static void main(String[] args) {
        int num1 = (int)(Math.random()*10);
        int num2 = (int)(Math.random()*10);
        if (num1 < num2){
            int temp =num2;
            num2 =num1;
            num1 =temp;
                }
         Scanner Sc =new Scanner(System.in);
         System.out.println("what is the "+num1 +" - "+ num2+" ?");
            int Answer = Sc.nextInt();
            if(num1 - num2 ==Answer){
                System.out.println("you are correcrt ");
            }
            else{
                System.out.println("you are wrong " +num1+ " - " +num2+" should be "+ (num1 - num2));
            }

    }
    
}
