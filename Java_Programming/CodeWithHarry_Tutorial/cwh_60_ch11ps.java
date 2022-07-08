abstract class Pen {
    abstract void write();

    abstract void refill();
}

class FountainPen extends Pen {
    void write() {
        System.out.println("Write");
    }

    void refill() {
        System.out.println("Refill");
    }

    void changeNib() {
        System.out.println("Changing the nib.");
    }
}

class monkey {
    void jump() {
        System.out.println("Jumping...");
    }

    void bite() {
        System.out.println("Biting...");
    }
}

interface BasicAnimal {
    void eat();

    void sleep();
}

class human extends monkey implements BasicAnimal {
    void speak() {
        System.out.println("Hello sir!!!");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}

abstract class TelePhone {
    abstract void ring();

    abstract void lift();

    abstract void disconnect();
}

class SmartTelePhone extends TelePhone {
    public void ring() {
        System.out.println("Phone is ringing.");
    }

    public void lift() {
        System.out.println("Phone was lifted.");
    }

    public void disconnect() {
        System.out.println("Phone was disconnected.");
    }
}

interface TvRemote {
    void vol();

    void channel();
}

interface SmartTvRemote extends TvRemote {
    void automatic();

    void extra_automatic();
}

class Tv implements SmartTvRemote {
    public void vol() {
        System.out.println("Increase and decrease the volume.");
    }

    public void channel() {
        System.out.println("Change the channel.");
    }

    public void automatic() {
        System.out.println("Channel will change automatically.");
    }

    public void extra_automatic() {
        System.out.println("Channel will extra automatically.");
    }
}

public class cwh_60_ch11ps {
    public static void main(String[] args) {

        // Q1 + Q2
        FountainPen pen = new FountainPen();
        pen.changeNib();

        // Q3
        human h = new human();
        h.sleep();

        // Q4
        TelePhone tel = new SmartTelePhone();
        tel.lift();

        // Q5
        monkey m1 = new human();
        m1.jump();
        m1.bite();
        // m1.speak(); --> Cannot use speak method because the reference is monkey which
        // does not have speak method

        BasicAnimal lovish = new human();
        // lovish.speak(); --> error
        lovish.eat();
        lovish.sleep();

        // Q6 + Q7
        SmartTvRemote sm = new Tv();
        sm.vol();
        sm.automatic();
    }
}
