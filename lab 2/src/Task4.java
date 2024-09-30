
public class Task4 {
    double a;double b; double c;

    public double add(double x,double y){
        a=x;
        b=y;
        return c=a+b;


    }
    public static void test(){
        System.out.println("This is test Method");
    }
    

    public static void main(String[] args) {
        Task4 c=new Task4();

        double result=c.add(4.56,5.89);
        System.out.println("The sum is: "+result);
        test();





    }


}
