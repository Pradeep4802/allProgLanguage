public class findTheFine {

    public static long totalFine(long n, long date, long car[], long fine[]) {
        // 1st method

        // long sum = 0;
        // if(car.length == fine.length) {
        // if(date % 2 == 0) {
        // for (int i = 0; i < n; i++) {
        // if(car[i] % 2 != 0) {
        // sum += fine[i];
        // }
        // }
        // }
        // else {
        // for (int i = 0; i < n; i++) {
        // if(car[i] % 2 == 0) {
        // sum += fine[i];
        // }
        // }
        // }
        // }
        // return sum;

        // 2nd method
        long even = 0, odd = 0;
        for (int i = 0; i < n; i++) {
            if (car[i] % 2 == 0)
                even += fine[i];
            else
                odd += fine[i];
        }
        if (date % 2 == 0)
            return odd;
        else
            return even;
    }

    public static void main(String[] args) {
        // long arr[] = {2375, 7682, 2325, 2352};
        long arr[] = { 2, 10, 4, 7, 4, 4, 5, 3, 8 };
        long fine[] = { 2, 3, 10, 6, 4, 2, 5, 2, 8 };

        long N = arr.length;
        long dates = 3;
        System.out.println(totalFine(N, dates, arr, fine));
    }
}