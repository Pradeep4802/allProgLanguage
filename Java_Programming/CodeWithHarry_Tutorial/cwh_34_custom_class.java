class Employee {
    int id;
    int salary;
    String name;
    public void printDetails() {
        System.out.println("My ID is " + id);
        System.out.println("and my name is " + name);
        System.out.println("and my salary is " + salary);
    }

    public int getSalary() {
        return salary;
    }
}

public class cwh_34_custom_class {
    public static void main(String args[]) {
        System.out.println("This is a custom class");
        Employee harry = new Employee();  // Instantaiating a new Employee Object
        Employee john = new Employee();  // Instantaiating a new Employee Object

        // Setting Attributes for harry
        harry.id = 12;
        harry.salary = 34;
        harry.name = "CodeWithHarry";

        // Setting Attributes for john
        john.id = 18;
        john.salary = 12;
        john.name = "John Tripathi";
        // Printing the Attributes
        // System.out.println(harry.id);
        // System.out.println(harry.name);
        harry.printDetails();
        john.printDetails();

        int salary = john.getSalary();
        System.out.println(salary);
    }
}
