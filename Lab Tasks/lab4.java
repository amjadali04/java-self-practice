import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your university name: ");
        String uniName = sc.nextLine();

        System.out.print("Enter your department name: ");
        String department = sc.nextLine();

        System.out.print("Enter total students in the department: ");
        int totalStudent = sc.nextInt();

        System.out.println("\nUniversity name: " + uniName);
        System.out.println("Department name: " + department);

        if (totalStudent < 0) {
            System.out.println("Total students cannot be negative.");
        } else {
            System.out.println("Total students in department: " + totalStudent);
            System.out.println("Even roll numbers:");
            for (int i = 2; i <= totalStudent; i += 2) {
                System.out.println("Roll no: " + i);
            }
        }

        sc.close();
    }
}
