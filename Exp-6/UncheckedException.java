// wap how to handle unchecked exception,using try and catch block
public class UncheckedException {
    public static void main(String[] args) {
        String s = null;
        try {
            if(s.equals("Shankar"))
                System.out.println("YES!");
        } catch (NullPointerException e) {
            System.out.println("Object Reference can't be null.");
        }
    }
}
