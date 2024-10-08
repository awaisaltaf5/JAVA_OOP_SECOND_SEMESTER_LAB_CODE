
class HotDogStand {
    // Instance variables
    private String standID;
    private int hotDogsSold;

    // Constructor to initialize standID and hotDogsSold
    public HotDogStand(String standID, int hotDogsSold) {
        this.standID = standID;
        this.hotDogsSold = hotDogsSold;
    }

    // Method to increment the number of hot dogs sold
    public void justSold() {
        hotDogsSold++;
    }

    // Getter method to get the number of hot dogs sold
    public int getHotDogsSold() {
        return hotDogsSold;
    }

    // Getter method to get the stand ID
    public String getStandID() {
        return standID;
    }
}

// Main class to test HotDogStand
 class Main {
    public static void main(String[] args) {
        // Creating three hot dog stands with initial sales
        HotDogStand stand1 = new HotDogStand("10A", 5);
        HotDogStand stand2 = new HotDogStand("11A", 8);
        HotDogStand stand3 = new HotDogStand("12A", 3);

        // Simulating hot dogs being sold
        stand1.justSold();  // stand1 sells a hot dog
        stand2.justSold();  // stand2 sells a hot dog
        stand2.justSold();  // stand2 sells another hot dog
        stand3.justSold();  // stand3 sells a hot dog

        // Displaying the number of hot dogs sold for each stand
        System.out.println("Hot Dog Stand " + stand1.getStandID() + " sold " + stand1.getHotDogsSold() + " hot dogs.");
        System.out.println("Hot Dog Stand " + stand2.getStandID() + " sold " + stand2.getHotDogsSold() + " hot dogs.");
        System.out.println("Hot Dog Stand " + stand3.getStandID() + " sold " + stand3.getHotDogsSold() + " hot dogs.");
    }
}
