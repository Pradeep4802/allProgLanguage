class Singleton {
    private float coffeeQty;
    private float milkQty;
    private float waterQty;
    private float sugarQty;
    // static int count = 0;

    static private Singleton my = null;

    private Singleton() {
        coffeeQty=1;
        milkQty=1;
        waterQty=1;
        sugarQty=1;
    }

    public void fillWater(float qty) {
        waterQty = qty;
    }

    public void fillSugar(float qty) {
        sugarQty = qty;
    }

    public float getCoffee() {
        return 0.15f;
    }

    static Singleton getInstance() {
        if (my == null) {
            my = new Singleton();
        }
        return my;
    }
}

public class CoffeeMachine {
    public static void main(String[] args) {
        Singleton m1 = Singleton.getInstance();
        Singleton m2 = Singleton.getInstance();
        Singleton m3 = Singleton.getInstance();

        System.out.println(m1+" "+m2+" "+m3);
        if (m1==m2 && m1==m3) {
            System.out.println("Same");
        }
    }
}