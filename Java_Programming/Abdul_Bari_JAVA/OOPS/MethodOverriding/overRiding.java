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

public class overRiding {
    public static void main(String[] args) {
        // Super sup = new Sub();
        // sup.display();

        // Sub s = new Sub();
        // s.display();

        // TV t = new TV();

        // t.switchON();
        // t.changeChannel();

        TV t = new smartTV();
        t.switchON();
        t.changeChannel();
    }
}