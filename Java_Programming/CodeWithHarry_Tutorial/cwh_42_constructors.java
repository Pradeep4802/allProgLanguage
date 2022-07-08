
class MyMainEmployee {
    private int id;
    private String name;

    public MyMainEmployee(String MyName) {
        id = 45;
        name = MyName;
    }

    public MyMainEmployee() {
        id = 45;
        name = "Pradeepkumar";
    }

    public MyMainEmployee(String Myname , int id) {
        this.id = id;
        name = Myname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }
}

public class cwh_42_constructors {
    public static void main(String[] args) {
        MyMainEmployee harry = new MyMainEmployee("CodeWith Haryy",45);
        // harry.setName("CoeWithHarry");
        // harry.setId(34);
        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}
