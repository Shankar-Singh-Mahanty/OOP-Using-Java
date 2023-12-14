/* wap to check to access of a private inner class from an outside class or not. */

class Outer{
    private class Inner{
        private void show(){
            System.out.println("I am inside inner class method.");
        }
    }
    public static void main(String[] args) {
        Outer Obj = new Outer();
        Inner Obj1 = Obj.new Inner();
        Obj1.show();
    }
}