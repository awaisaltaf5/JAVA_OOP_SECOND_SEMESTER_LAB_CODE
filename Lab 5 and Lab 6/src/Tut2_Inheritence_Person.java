class person {
    String name;
    int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;

    }
    public  void display() {
        System.out.println("Name is "+name+" and age is "+age);

    }
}
class teacher extends person{
    String Subject;
    public teacher(String name,int age,String Subject){
        super(name,age);
        this.Subject=Subject;
    }
    public void teach(){
        System.out.println("Teaches: "+Subject);
    }

}
class student1 extends person{
    String Grade;
    public student1(String name, int age,String Grade) {
        super(name, age);
        this.Grade=Grade;
    }
    public void status(){
        System.out.println("Grade: "+Grade);
    }
}
public class Tut2_Inheritence_Person {
    public static void main(String[] args) {
teacher t=new teacher("Mr.Waqar",28,"Programing Fundamental");
student1 s=new student1("Muhammad Awais Altaf",19,"A+");
t.display();
t.teach();
s.display();
s.status();
    }
}
