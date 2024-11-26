interface printable2{
    void print();
}
interface showable{
    void show();
}
class rectangle implements printable2,showable{
    public void print(){
        System.out.println("Drawing Rectangle");
    }
    public void show(){
        System.out.println("Show the Rectangle");
    }
}
class circle implements printable2{
    public void print(){
        System.out.println("Drawing Circle");
    }
}
public class Task3_Interfaces {
    public static void main(String[] args) {
circle c=new circle();
c.print();
rectangle r=new rectangle();
r.print();
r.show();
    }
}
