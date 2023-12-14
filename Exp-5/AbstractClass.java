/* wap where the abstract class myclass has one abstract method which has
got various implementations in sub classes. */

abstract class MyClass{
    abstract int getRateOfIntrest();
}
class SBI extends MyClass{
    int getRateOfIntrest() {return 8;}
}
class PNB extends MyClass{
    int getRateOfIntrest() {return 7;}
}
class HDFC extends MyClass{
    int getRateOfIntrest() {return 9;}
}

public class AbstractClass{
    public static void main(String[] args) {
        MyClass B;
        B = new SBI();
        System.out.println("Rate of intrest in SBI is: "+ B.getRateOfIntrest()+" %");
        B = new PNB();
        System.out.println("Rate of intrest in PNB is: "+ B.getRateOfIntrest()+" %");
        B = new HDFC();
        System.out.println("Rate of intrest in HDFC is: "+ B.getRateOfIntrest()+" %");
    }
}