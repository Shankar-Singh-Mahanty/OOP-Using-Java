/*  wap where calculate() method of super class is overridden by the calculate() method
of sub class. the behavior of the calculate() method is dynamically decided */

class Parent{
    public void calculate(){
        System.out.println("Super Class Method is Calculated");
    }
}
class Child extends Parent{
    public void calculate(){
        System.out.println("Sub Class Method is Calculated by Overridden");
    }
}

class Main{
    public static void main(String[] args) {
        Child C1 = new Child();
        C1.calculate();
    }
}