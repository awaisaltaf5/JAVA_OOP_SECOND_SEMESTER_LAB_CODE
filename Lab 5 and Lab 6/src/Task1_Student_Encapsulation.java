class Student{
    private String name;
    private String rollno;
    private int fees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }
}
public class Task1_Student_Encapsulation {
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("Muhammad Awais Altaf");
        s.setFees(20000);
        s.setRollno("SP23948");
        System.out.println("Name:"+s.getName());
        System.out.println("Roll No:"+s.getRollno());
        System.out.println("Fees:"+s.getFees());

    }
}
