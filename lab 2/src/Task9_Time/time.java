package Task9_Time;

class time {
    int hour, min, sec;

    public void setTime(int a, int b, int c) {
        hour = a;
        min = b;
        sec = c;

    }

    void display() {
        System.out.println("The Time is " + hour + ":" + min + ":" + sec + "PM");

    }
}