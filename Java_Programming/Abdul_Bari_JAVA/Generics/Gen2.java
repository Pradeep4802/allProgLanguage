import java.lang.*;

class Data<T> {
    private T obj;

    public void setData(T v) {
        obj = v;
    }
    public T getData() {
        return obj;
    }
}

public class Gen2 {
    public static void main(String[] args) {
        Data<String> d = new Data<>();
        d.setData("Hi");

        System.out.println(d.getData());

    }
}
