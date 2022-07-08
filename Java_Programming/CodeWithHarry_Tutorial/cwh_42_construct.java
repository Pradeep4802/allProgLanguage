
class MyEmploye {
    private int id;
    private String name;

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

public class cwh_42_construct {
    public static void main(String args[]) {
        MyEmploye harry = new MyEmploye();
        // harry.id = 45;
        // harry.name = "CodeWithHarry";  --> Throws an error due to private access modifier
        harry.setName("CodeWithHarry");
        System.out.println(harry.getName());
        harry.setId(234);
        System.out.println(harry.getId  ());
    }
}
