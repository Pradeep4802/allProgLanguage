class ObjectPassing {
    int a = 5;

    void changeObjectValue(ObjectPassing o) {
        o.a++;
    }
}

public class obj_pass_para_02 {
    public static void main(String args[]) {
        ObjectPassing ob = new ObjectPassing();
        System.out.println("ob.a=" + ob.a);
        ob.changeObjectValue(ob);
        System.out.println("ob.a=" + ob.a);
    }
}
