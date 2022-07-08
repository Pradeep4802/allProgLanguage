class Test {
    int i,j;
    Test(int i,int j) {
        this.i = i;
        this.j = j;
    }

    boolean object(Test o) {
        if (o.i == i && o.j == j) 
            return true;
        else
            return false;
    }
}

public class pass_obj_para_03 {
    public static void main(String args[]) {
        Test ob1 = new Test(100,22);
        Test ob2 = new Test(100,22);
        Test ob3 = new Test(-1,-1);

        System.out.println("ob1 == ob2: " + ob1.object(ob2));
        System.out.println("ob1 == ob3: " + ob1.object(ob3));
    }
}
