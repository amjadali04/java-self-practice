package CH2_Elementary_prog_DL;
import java.util.Scanner;

public class DowhileSecretNo {
    public static void main(String[] args) {
    int actualNo =8;
    int guess;
    Scanner Sc =new Scanner(System.in);
    System.out.print("guess the number between 1 and 10 : ");
    guess =Sc.nextInt();
        do{
            if(guess > actualNo){
            System.out.println("you gessed wrong ");
            }
            else{

            
                System.out.println("you guessd wrong.");
            }
            System.out.print("Try again : ");
            guess = Sc.nextInt();
        }while(guess != actualNo);
        if(guess == actualNo){
            System.out.println("wow u guess successfuly");
        }
        
    }
    
}
