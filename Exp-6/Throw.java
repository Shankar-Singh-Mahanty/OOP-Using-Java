// wap to forcibly create the exception
public class Throw {
    public static void divideByZero() {
        throw new ArithmeticException("Trying to divide by 0");
    }
    public static void main(String[] args) {
        divideByZero();
    }
}

