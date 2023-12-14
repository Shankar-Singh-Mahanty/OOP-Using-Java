// WAP of method overloading by changing the number of arguments and data types of arguments.

public class MethodOverloading {
    public static  void main(String[] args) {
        System.out.println("The Volume Of Cube Is : " +volume(3,3,3));
        System.out.println("The Volume Of Sphere Is : " +volume(3));
    }

    public static double volume(int a,int b,int c)
    {
        return a*b*c;
    }
    public static double volume(double r)
    {
        return 4/3 * Math.PI * r * r *r;
    } 

}
