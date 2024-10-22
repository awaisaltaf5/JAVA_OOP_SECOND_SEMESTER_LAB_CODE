
class specie{
   public void move(){
       System.out.println("The animal is running");
   }
}
class cheeta extends specie{
    @Override
public void move(){

    System.out.println("The Cheeta is running");
}

}
public class Task3_Part2_Inheritence_Animal {
    public static void main(String[] args) {
specie A=new specie();

//ANIMAL Cheeta=new cheeta();
cheeta c=new cheeta();
A.move();
c.move();
    }
}
