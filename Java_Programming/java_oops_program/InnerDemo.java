/*
*
* Inner class
*	Member class
*	static class
*	Anonymous class
*/


class Outer
{
	static int a;
	public static void show()
	{
	
	}
	
	static class Inner     // Outer$Inner.class
	{
		public void display()
		{
			System.out.println("in Display builkt");
		}
	}
}
public class InnerDemo
{
	// varible, method
	
	public static void main(String[] args) {
		Outer obj = new Outer();
		obj.show();
		
		// Outer.Inner obj1 = obj.new Inner();
		Outer.Inner obj1 = new Outer.Inner();  // For static class
		obj1.display();
	}
}