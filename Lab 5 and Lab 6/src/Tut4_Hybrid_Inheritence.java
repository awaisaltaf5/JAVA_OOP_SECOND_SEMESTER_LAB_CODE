class animal {  // Follow Java convention for class names (capitalized first letter)
    String type;
    public void displayType(){
        System.out.println("Type: " + type);
    }
}

class dog extends animal {  // Class name should be Dog, not dog
    String name;
    public void displayName(){
        System.out.println("Dog Name: " + name);
    }
}

class Doggy extends dog {
    double price;
    public void displayPrice(){
        System.out.println("Dog Price: " + price);
    }
}

class Cat extends animal {
    String name;
    public void displayName() {
        System.out.println("Cat Name: " + this.name);
    }
}

public class Tut4_Hybrid_Inheritence {
    public static void main(String[] args) {
        Doggy d1 = new Doggy();
        Cat c1 = new Cat();

        d1.type = "Dog";
        d1.name = "Bull Dog";
        d1.price = 20000;

        c1.name = "Cato";

        d1.displayType();
        d1.displayName();
        d1.displayPrice();
        c1.displayName();
    }
}
