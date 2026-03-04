package CH2_Elementary_prog_DL;
import java.lang.reflect.Array;
import java.util.Scanner;

public class oneD_ArrayAvg {
    public static void main(String[] args) {
        int[]array= new int[8];
        Scanner Sc =new Scanner(System.in);
        int sum =0;
        System.out.println("Enter "+array.length+" integer numbers to cal average");
        for(int i = 0; i<array.length;i++){
            array[i] = Sc.nextInt();
             sum+=array[i];
             
        }
        float avg = sum/array.length;
        System.out.println("your average of array elements is : "+avg);
        
    }
}
