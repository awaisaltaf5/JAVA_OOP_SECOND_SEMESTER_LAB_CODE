interface printable1{
    void print();
}
interface Drawable{
    void draw();
}
interface Showable extends printable1,Drawable{
    void show();
}
class Test implements Showable{
    public void print(){
        System.out.println("Printable Interfaces");
    }
    public void draw(){
        System.out.println("Drawable Interfaces");
    }
    public void show(){
        System.out.println("Showable Interfaces");
    }
}
public class Task4_Interfaces {
    public static void main(String[] args) {
        Test t=new Test();
        t.show();
        t.draw();
        t.print();
    }
}
