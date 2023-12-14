/* Suppose Flipkart wants to integrate HDFC bank code into their shopping cart for their customer’s convenience.
Flipkart wants when their customers purchase any product from Amazon then they do payment through HDFC bank.
But to do payment Flipkart does not have its own HDFC bank. So, they will have to take the help of the HDFC bank.
Write a Java code to solve this requirement using interface.            */

import java.util.Scanner;
// create an interface for HDFC bank
interface HDFCBank {
    // interface method to do payment
    void doPayment(double amount);
}
// create a class for Flipkart
class Flipkart {
    // a field to store the HDFC bank object
    private final HDFCBank hdfc;
    // a constructor to initialize the HDFC bank object
    public Flipkart(HDFCBank hdfc) {
        this.hdfc = hdfc;
    }
    // a method to purchase a product from Amazon
    public void purchaseProduct(String product, double price) {
        System.out.println("Purchasing " + product + " from Amazon");
        // call the doPayment method of HDFC bank object
        hdfc.doPayment(price);
    }
}
// create a class that implements HDFC bank interface
class MyHDFCBank implements HDFCBank {
    // implementation of abstract method
    public void doPayment(double amount) {
        System.out.println("Doing payment of " + amount + " through HDFC bank");
    }
}
// create a main class to test the code
public class Interface {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // create an object of MyHDFCBank class
        MyHDFCBank myHdfc = new MyHDFCBank();
        System.out.println("Enter product name: ");
        String product = input.nextLine();
        System.out.println("Enter product price: ");
        double price = input.nextDouble();
        // create an object of Flipkart class and pass the MyHDFCBank object as an argument
        Flipkart flipkart = new Flipkart(myHdfc);
        // call the purchaseProduct method of Flipkart object
        flipkart.purchaseProduct(product, price);
        input.close();
    }
}