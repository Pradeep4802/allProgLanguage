public class gmail {
    public static void main(String[] args) {
        String str = "programmer@gmail.com";
        int num = str.indexOf('@');
    
        String user = str.substring(0,num);
        System.out.print(user + " ");
        // System.out.println(num + " ");
        String domain = str.substring(num+1, str.length());
        System.out.print(domain + " ");

        // if(domain.equals("gmail.com")) {
        //     System.out.println("Yes, It is Gmail");
        // }
        // else {
        //     System.out.println("No, It is not a Gmail");
        // }
        int j = domain.indexOf(".");
        String name = domain.substring(0,j);
        // System.out.println(domain.startsWith("gmail"));
        System.out.println(name.equals("gmail"));
    }}