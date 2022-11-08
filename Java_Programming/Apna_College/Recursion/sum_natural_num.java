public class sum_natural_num {
    public static int sum(int n) {
        if(n == 1) {
            return 1;
        }
        int sumn1 = sum(n-1);
        int sum1 = n + sumn1;
        return sum1;
    } 
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));;
    }
}
