class parent{
    public void displayP(){
        System.out.println("This is Parent class!");
    }
}
class child extends parent{
    public void displayC(){
        System.out.println("This is Child class!");
    }
}

public class Tut1_Inheritence {
    public static void main(String[] args) {
        child c1=new child();
        c1.displayP();
        c1.displayC();
    }
}
