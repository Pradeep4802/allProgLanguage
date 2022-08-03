

public class x_power_y_02 {
    public static int calcPower(int x,int n) {
        if (n%2==0) {
            return calcPower(x,n/2) * calcPower(x,n/2);
        }
        else {
            return calcPower(x,n/2) * calcPower(x,n/2) * x;
        }
    } 
    public static void main(String[] args) {
        int n = 3,y = 4;
        int power = calcPower(n,y);
        System.out.println(power);
    }
}
