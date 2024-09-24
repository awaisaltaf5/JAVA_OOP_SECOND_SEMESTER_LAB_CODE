public class Task2 {
    int a;int b; int c;

    public int add(int x,int y){
        a=x;
        b=y;
        return c=a+b;


    }

    public static void main(String[] args) {
        Task2 c=new Task2();

        int result=c.add(4,5);
        System.out.println("The sum is: "+result);
    }


}
