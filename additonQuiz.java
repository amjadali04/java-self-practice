package CH2_Elementary_prog_DL;
import java.util.Scanner;
public class additonQuiz {
    public static void main(String[] args) {
        int num1 =(int)System.currentTimeMillis()%10;
         int num2 =(int)System.currentTimeMillis()*7%10;
         Scanner Sc =new Scanner(System.in);
         System.out.println(" what is the additon of "+num1 + num2+"?");
         int answer = Sc.nextInt();
         System.out.println(num1 +" + "+ num2+" = " +answer+" is  "+(num1 + num2 == answer));
    }
    
}
