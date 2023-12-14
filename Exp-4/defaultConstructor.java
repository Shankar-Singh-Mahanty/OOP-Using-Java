//  WAP to prove that the default constructor of the super class,
//  is available to subclass by default, calling super class default constructor from sub class.

class defaultConstructor {
    int a;
    double d;
    String s;
    boolean Shankar;

    // creating default constructor
    defaultConstructor() {
        System.out.println("Hi I am a default constructor.");
    }
}

class defCon {
    public static void main(String[] args) {
        // creating an object of class defaultconstructor
        // after creation of object it will invoke the default constructor
        defaultConstructor obj = new defaultConstructor();
        // default constructor provide default values to the objects.
        System.out.println(obj.a);
        System.out.println(obj.d);
        System.out.println(obj.s);
        System.out.println(obj.Shankar);
    }
}
