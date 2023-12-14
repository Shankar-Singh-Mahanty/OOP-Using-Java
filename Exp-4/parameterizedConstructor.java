// WAP to understand that the parameterized constructor of the super class can be called from
// sub class using super () calling super class parameterized constructor from sub class.

import java.util.Scanner;
class paraSup {
    int c;
    paraSup(byte a, byte b) {
        c = a + b;
        System.out.println("Sum is:" + c);
    }
}

class parameterizedConst extends paraSup {
    parameterizedConst(byte a, byte b) {
        super(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        byte a = sc.nextByte();
        System.out.print("Enter the value of b: ");
        byte b = sc.nextByte();

        new parameterizedConst(a, b);
        sc.close();
    }
}