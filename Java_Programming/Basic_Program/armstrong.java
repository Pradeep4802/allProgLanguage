//java program to print the armstrong number between given range
class armstrong {
    public static void main(String args[]) {
        int x, y;
        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);
        for (int i = x; i <= y; i++) {
            int rem = 0;
            int a, t;
            t = i;
            while (t > 0) {
                a = t % 10;
                rem = rem + (a * a * a);
                t = t / 10;
            }
            if (rem == i) {
                System.out.println(rem);
            }
        }
    }
}
