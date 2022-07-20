public class TOH2 {
    public static void TowerOfHanoi(int n,String src,String help,String dest) {
        if (n == 1) {
            System.out.println("Transfer Disk " + n + " from " + src + " to " + dest);
        }
    }
    public static void main(String[] args) {
        int n = 3;
        TowerOfHanoi(n, 'S', 'H', 'D');
    }   
}
