
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


    public static void main(String[] args) {
        //Tut9 t=new Tut9();
        //time s1=t.new time(20,45,45);
        time s1=new time();
        s1.setTime(11,20,33);
        s1.display();

    }
    }




