class Super {
    public void display() {
        System.out.println("Super Class Display");
    }
}

class Sub extends Super {
    // @Override
    public void display() {
        System.out.println("Sub Class Display");
    }
}

class TV {
    public void switchON() {
        System.out.println("TV is switched ON");
    }

    public void changeChannel() {
        System.out.println("TV channel is Changes");
    }
}

class smartTV extends TV {
    @Override
    public void switchON() {
        System.out.println("Smart TV is Switched ON");
    }

    @Override
    public void changeChannel() {
        System.out.println("Smart TV channel is Changes");
    }

    public void browse() {
        System.out.println("Smart TV Browsing");
    }
}

class Car {
    public void start() {
        System.out.println("Car Started");
    }

    public void accelerate() {
        System.out.println("Car is Accelerated");
    }

    public void changeGear() {
        System.out.println("Car Gear Changed");
    }
}

class luxuryCar extends Car {
    @Override
    public void changeGear() {
        System.out.println("Automatic Gear");
    }

    public void openRoof() {
        System.out.println("Sun Roof is Opened");
    }
}

public class overRiding {
    public static void main(String[] args) {
        // Super sup = new Sub();
        // sup.display();

        // Sub s = new Sub();
        // s.display();

        // TV t = new TV();

        // t.switchON();
        // t.changeChannel();

        // TV t = new smartTV();
        // t.switchON();
        // t.changeChannel();

        // luxuryCar c1 = new luxuryCar();
        Car c1 = new luxuryCar(); // Reference of superclass and object of subclass
        // Car c = new Car();
        c1.start();
        c1.accelerate();
        c1.changeGear();
        // c1.openRoof();  // It gives error bcoz we cannot call subclass method from superclass reference
    }
}