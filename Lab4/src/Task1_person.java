import java.util.Scanner;
public class Task1_person {
    String name;
    int age;
    public Task1_person() {
        name=" ";
        age=0;
    }
    public Task1_person(int a, String n) {
        age = a;
        name = n;
    }
    public void display() {
        System.out.println("Name:" + name + "\nAge:" + age);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the 1st person Name:");
        String n1=input.nextLine();
        System.out.println("Enter the age:");
        int a1=input.nextInt();
        input.nextLine();
        System.out.println("Enter the 2nd person Name:");
        String n2=input.nextLine();
        System.out.println("Enter the age:");
        int a2=input.nextInt();
        Task1_person show1 = new Task1_person();
        Task1_person show2 = new Task1_person();
        Task1_person person1 = new Task1_person(a1, n1);
        Task1_person person2 = new Task1_person(a2, n2);
        person1.display();
        person2.display();
    }
}


