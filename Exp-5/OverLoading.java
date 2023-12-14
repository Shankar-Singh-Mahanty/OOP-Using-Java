/* wap to create sample class which contains two methods 
with the same name but with different signatures */

class Sample {
    void test(int a){
        System.out.println("Entered value "+ a + " is Integral");
    }
    void test(double a){
        System.out.println("Entered value "+ a + " is Double");
    }
    public static void main(String[] args) {
        Sample Ob1 = new Sample();
        Ob1.test(8);
        Ob1.test(15.23);
    }
}
