public class Task5 {
    double a;double b; double c;double l;

    public double add(double x,double y){
        a=x;
        b=y;
        return c=a+b;
    }
    public double add(double x,double y,double z){
        a=x;
        b=y;
        l=z;
        return c=a+b+l;
    }

    public static void main(String[] args) {
        Task5 c=new Task5();

        double result1=c.add(4.56,5.89);
        double result2 =c.add(4.56,5.89,5.66);

        System.out.println("The sum is: "+ result1);
        System.out.println("The sum is: "+ result2);
    }
}
