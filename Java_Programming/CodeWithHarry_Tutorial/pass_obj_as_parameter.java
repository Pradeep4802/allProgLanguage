
class printer {
    public void print(Paper p) {
        p.setText("Get Lost");
    }
}

class Paper {
    String text;

    public void setText(String t) {
        text = t;
    }

    public String getText() {
        return text;
    }
}

public class pass_obj_as_parameter {
    public static void main(String[] args) {
        Paper p = new Paper();
        p.setText("Hello World");
        System.out.println(p.getText());
        printer hp = new printer();
        hp.print(p);
        System.out.println(p.getText());
    }
}
