// wap to illustrate finally in case where exception do not occure in the program
public class Finally {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            System.out.println(14/2);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs!");
        }
        finally {
            System.out.println("I execute always and if exception is not present then after try block.");
        }
    }
}
