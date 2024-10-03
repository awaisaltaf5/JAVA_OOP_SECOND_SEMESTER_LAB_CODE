package Lab3.src;
import java.util.Scanner;

public class Task7_employee {
    String name;int code;int date,month,year;
    int jdate,jmonth,jyear;
    int tenure;
    public void data(String n,int c,int d,int m,int y){
name=n;
code=c;
date=d;
month=m;
year=y;

    }
    public void check(){
        Scanner jinput=new Scanner(System.in);
        System.out.print("\nPlease enter the joining Year:");
        jyear=jinput.nextInt();
        tenure=year-jyear;
        if(jyear<=0||jyear>year){
            System.out.println("Invalid Joing year!");
            return;
        }

        tenure=year-jyear;
        if(tenure>3){

            System.out.println("Name:"+name+"\nCode:"+code+"\nJoining Year: "+jyear+"\nTenure is greater than 3 years!");
        }
        else if(tenure==3){
            System.out.println("Name:"+name+"\nCode:"+code+"\nJoining Year: "+jyear+"\nTenure is equal to 3 years!");

        }
        else if(tenure<3){
            System.out.println("Name:"+name+"\nCode:"+code+"\nJoining Year: "+jyear+"\nTenure is less than 3 years!");
        }
        else{
            System.out.println("Invalid year!");
        }
    }

    public static void main(String[] args) {

        String name;int code;int date,month,year;
        int jdate,jmonth,jyear;
        System.out.println("PLease enter year information in this Format: 05/09/2024");
        Task7_employee e1=new Task7_employee();
        e1.data("Muhammad Awais Altaf",1234,15,6,2024);
        e1.check();



    }

}
