// WAP to check whether a static method can access the instance variable or not.
public class Demo {
    int i = 10;
    public static  void main(String[] args)
    {
        System.out.println(i);
    }
}
// This will give rise to Compile Time Error as we are trying to access a non-static variable from a static block which is not allowed.
// But We Can still access the data by creating an object of This class 'd1'(say) and then acess by dot(.) operator Eg d1.i.