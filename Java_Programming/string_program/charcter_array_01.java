public class charcter_array_01 {
    public static void main(String[] args) {
        String str = "Jason Gibson";
        char array[] = new char[15];
        str.getChars(0, 12, array, 0);
        // str.getChars(srcBegin, srcEnd, dst, dstBegin);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println(array[5]);
        System.out.println(array[6]);
        System.out.println(array[7]);
        System.out.println(array[8]);
        System.out.println(array[9]);
        System.out.println(array[10]);
        System.out.println(array[11]);
        System.out.println(array[12]);
        // System.out.println(array[4]);
    }
}
