interface Bicycle {
    int a = 5; // here variables 'a' is final

    void applyBrake(int decrement);

    void speedUp(int increment);
}

interface HornBicycle {
    // int a = 5; // here variables 'a' is final

    void blowHornK3g();

    void blowHorn3mn();
}

class AvonCycle implements Bicycle, HornBicycle {
    void blowHorn() {
        System.out.println("Pee Pee Poo Poo");
    }

    public void applyBrake(int decrement) {
        System.out.println("Applying Brake");
    }

    public void speedUp(int increment) {
        System.out.println("Applying SpeedUP");
    }

    public void blowHornK3g() {
        System.out.println("Kabhi Khushi Kabhi Gum pee pee pee pee");
    }

    public void blowHorn3mn() {
        System.out.println("main hoon naa po po po po po");
    }
}

public class cwh_54_interfaces {
    public static void main(String[] args) {
        AvonCycle cycle = new AvonCycle();
        cycle.applyBrake(1);
        // you can create properties in Interfaces
        System.out.println(cycle.a);
        // You can modify the properties in Interfaces as they are final
        // cycle.a = 45;
        // System.out.println(cycle.a);

        cycle.blowHornK3g();
        cycle.blowHorn3mn();
    }
}
