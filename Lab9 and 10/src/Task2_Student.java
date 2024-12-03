abstract class student{
    abstract void takeExam();
}
class phdSTD extends student{
    public void takeExam(){
        System.out.println("Student is giving Final Defence!");
    }
}
class gradSTD extends student{
    public void takeExam(){
        System.out.println("Student is solving Final Paper!");
    }
}
public class Task2_Student {
    public static void main(String[] args) {
        phdSTD p=new phdSTD();
        p.takeExam();
        gradSTD g=new gradSTD();
        g.takeExam();
    }
}
