
class pair {
    long first, second;

    public pair(long first, long second) {
        this.first = first;
        this.second = second;
        System.out.println(first);
        System.out.println(second);
    }
}

class findMinMax {
    public static pair getMinMax(long a[], long n) {
        // Write your code here
        // long max = a[0];
        // long min = a[0];
        // for (int i = 1; i < a.length; i++) {
        //     if(max < a[i]) {
        //         max = a[i];
        //     }
        //     if (min > a[i]) {
        //         min = a[i];
        //     }
        // }

        // 2nd method
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;
        for(long e:a){
            min=Math.min(min,e);
            max=Math.max(max,e);
        }
        pair ans=new pair(min,max);
        return ans;

        // return new pair(max,min);
    }
    public static void main(String[] args) {
        long a[] = {3,2,1,56,1000,167};
        long N = a.length;
        // pair res1 = new pair(getMinMax(a, N));
        getMinMax(a, N);
    }
}