// wap how to handle checked exception,using try and catch block
public class CheckedException {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Class.forName("checked_exception");
        } catch (ClassNotFoundException e) {
            System.out.println("Class does not exist! Check the name of the class");
        }
    }
}
