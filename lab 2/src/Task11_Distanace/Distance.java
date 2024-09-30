package Task11_Distanace;

public class Distance {
    double feet;
    double inches;

    public void distance() {
        System.out.println("These is components of Distance");
    }
 public void distance(double a, double b) {
        feet = a;
        inches = b;

    }

    void display() {
        System.out.println("The feets are " + feet + " and the inches are: " + inches);
    }

}
