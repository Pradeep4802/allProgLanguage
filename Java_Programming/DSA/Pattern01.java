public class Pattern01 {
    public static void main(String[] args) {
        patternUNK(5);
    }

    static void patternUNK(int n) {
        int i,j;

        for(i = 1; i <= n ; i++) {
            for(j = 1; j <= n; j++) {
                if(j == 1 || j == n || i == 1 || i == n) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void pattern28(int n) {
        for (int i = 0; i < 2 * n; i++) {
            int c = i > n ? 2 * n - i : i;

            int nos = 456;
            for (int s = 0; s < nos; s++) {
                System.out.println(" ");
            }
            for (int j = 0; j < c; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int i = 0; i < 2 * n; i++) {
            int c = i > n ? 2 * n - i : i;
            for (int j = 0; j < c; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}