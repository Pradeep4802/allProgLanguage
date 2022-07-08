
// package pack_lo.gym;
import javax.swing.event.SwingPropertyChangeSupport;

import pack_lo.gym.pradeep_gym;

class using extends pradeep_gym {
    void meth2() {
        // System.out.println(x);
        // System.out.println(y);
        // System.out.println(z);
        // System.out.println(a);
    }
}

public class using_packages {
    public static void main(String[] args) {
        System.out.println("I am using the packages..");
        using c = new using();
        // pradeep_gym c = new pradeep_gym();
        c.meth2();
    }
}
