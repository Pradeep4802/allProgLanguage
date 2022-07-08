class phone {
    int x = 10;

    public void showtime() {
        System.out.println("Timing is 8 pm");
    }

    public void greet() {
        System.out.println("Good Morning");
    }

    public void on() {
        System.out.println("Turning on phone");
    }
}

class smartphone extends phone {
    int x = 20;

    public void music() {
        System.out.println("Playing a music");
    }

    public void swagat() {
        System.out.println("aapka swagat hai");
    }

    public void on() {
        System.out.println("Turning on smartphone");
    }
}

public class cwh_49_dynamic_method_dispatch {
    public static void main(String[] args) {
        // phone obj = new phone();
        // smartphone smobj = new smartphone();
        // obj.on();
        phone obj = new smartphone(); // Yes it is allowed
        // smartphone obj = new phone(); // Not allowed
        obj.showtime();
        obj.on();
        System.out.println(obj.x);
        // obj.music(); Not allowed
    }
}
