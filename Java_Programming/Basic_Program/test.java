class person {
    void message() {
        System.out.println("this is person class ");
    }
}

class student extends person {
    void message() {
        System.out.println("This is student class");
    }

    void display() {
        message();
        super.message();
    }
}

class test {
    public static void main(String[] args) {
        student s = new student();
        s.display();
    }
}