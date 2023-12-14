/* wap to demonstrate working of interface inside another interface. */

interface Test {
	interface Yes
	{
		void show();
	}
}
class Demonstrate implements Test.Yes
{
	public void show()
	{
		System.out.println("Show Method Of Interface");
	}
	public static void main(String[] args){
		Test.Yes obj;
		Demonstrate D = new Demonstrate();
		obj = D;
		obj.show();
    }
}
