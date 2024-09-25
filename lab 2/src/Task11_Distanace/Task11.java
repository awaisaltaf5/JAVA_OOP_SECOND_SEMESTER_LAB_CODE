package Task11_Distanace;

import java.util.Scanner;

public class Task11{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter teh feets:");
        double a=input.nextDouble();
        System.out.println("Enter the inches");
        double b=input.nextDouble();
        Distance d1=new Distance();
        d1.distance();
        d1.display();
        d1.distance(a,b);
        d1.display();
    }
}

