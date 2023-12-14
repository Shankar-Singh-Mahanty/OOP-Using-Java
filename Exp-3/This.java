// WAP to use “this” keyword to refer to current class parameterized constructor.

public class This {
    int a, b;
    This(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        This c = new This(15,8);
        System.out.println(c.a+ " " +c.b);
    }
}
