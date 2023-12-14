/* wap where myclass's calculate() method is available to all the objects and 
hence every object can calculate the square value. */

class My_Class{
    private int calculate(int a){
        System.out.println("Square of "+ a + " is: "+ a * a);
        return 0;
    }
    public static void main(String[] args) {
        My_Class Obj1 = new My_Class();
        Obj1.calculate(8);
        My_Class Obj2 = new My_Class();
        Obj2.calculate(15);
        My_Class Obj3 = new My_Class();
        Obj3.calculate(23);
    }
}