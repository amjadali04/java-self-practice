package CH2_Elementary_prog_DL;
import java.util.Scanner;

public class SentilValueLoop {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer other than 0 ");
        int data = sc.nextInt();
        int sum = 0;
        while(data !=0){
            sum+=data;
         System.out.println("Enter an integer other than 0 ");
         data = sc.nextInt();
            
        }
        System.out.println("the sum is : "+sum);

    }
    
}
