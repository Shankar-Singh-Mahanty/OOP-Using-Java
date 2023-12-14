// WAP where the name of the instance variables and methods in super and sub classes are same.
// Hence, by default only sub class members are accessible.

class Parent {
    String str = "Super Class";
    void instance() {
        System.out.println("I am the instance variable of " + str);
    }
}
// child inherits parent
class Child extends Parent {
    String str = "Sub Class";
    // overriding the instance() method.
    void instance() {
        System.out.println("I am the instance variable of " + str);
    }
}
class OverRiding {
    public static void main(String[] args) {
        // creating an object of child class which have access to both child and parent.
        Child obj = new Child();
        // calling the instance() method
        obj.instance();
    }
}
