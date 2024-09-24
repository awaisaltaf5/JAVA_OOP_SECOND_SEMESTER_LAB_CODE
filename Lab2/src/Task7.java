import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=input.nextLine();
        System.out.println("Enter your Roll No:");
        int roll=input.nextInt();
        System.out.println("Enter 1st number:");
        int a=input.nextInt();
        System.out.println("Enter Second  number:");
        int b=input.nextInt();
        System.out.println("Your Name is "+name);
        System.out.println("and Your Roll No is "+roll);
        System.out.println("The sum is "+(a+b));
    }
}
