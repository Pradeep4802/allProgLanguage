
class OuterLocal {
    int a = 45;
    static char c = 'A';

    void NotAccess() {
        class InnerLocal {
            int a = 220;   
            int x = 10;

            void dark() {
                System.out.println(x + " " + c + " " + OuterLocal.this.a);
            }

        }
        InnerLocal il = new InnerLocal();
        il.dark();

    }
}

public class LocalInner {
    public static void main(String[] args) {
        OuterLocal ol = new OuterLocal();
        // OuterLocal.InnerLocal il = ol.new InnerLocal();
        // ol.sowDemo();
        ol.NotAccess();
    }
}