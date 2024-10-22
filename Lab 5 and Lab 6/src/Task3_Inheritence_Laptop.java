class electronicDevice{
    String brand;
    String model;
    public electronicDevice(String brand,String model){
        this.brand=brand;
        this.model=model;
    }
    public void turnOn(){
        System.out.println("Turning on...");
    }
    public void turnOf(){
        System.out.println("Turning off...");
    }
    public void showDetail(){
        System.out.println("Laptop Brand:"+brand+"\nLaptop Model"+model);
    }
}
class laptop extends electronicDevice{
    String operatingSysytem;
    double screenSize;
    public laptop(String brand,String model,String operatingSysytem,double screenSize){
super(brand,model);
this.screenSize=screenSize;
this.operatingSysytem=operatingSysytem;
    }
    public void showDetail(){
        super.showDetail();
        System.out.println("Operating System:"+operatingSysytem+" Screen Size:"+screenSize);
    }

}
public class Task3_Inheritence_Laptop {
    public static void main(String[] args) {
laptop l=new laptop("HP","X2R456","\nWindow 11",345.0);
l.turnOn();
l.showDetail();
l.turnOf();
    }
}
