// wap how to create user-defined exceptions

class MyException extends Exception{}
public class UserDefinedException {
    public static void main(String[] args) {
        try {
            throw new MyException();
        } catch (MyException ex) {
            System.out.println("Caught User-Defined exception");
            System.out.println(ex.getMessage());
        }
    }
}
