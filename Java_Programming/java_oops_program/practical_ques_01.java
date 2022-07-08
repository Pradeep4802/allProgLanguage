class sports {
    private long s_code;
    private String s_name;
    private int fees;
    private int duration;
    
    sports() {
        s_code = 1001;
        s_name = "Cricket";
        fees = 500;
        duration = 70;
    }

    sports(int s_code, String s_name, int duration ) {
        this.s_code = s_code;
        this.s_name = s_name;
        this.duration = duration;
    }

    void showsport() {
        
    }
}

public class practical_ques_01 {
    public static void main(String[] args) {
        sports x = new sports();
        sports y = new sports(1002,"Football",80);
    }
}
