//Create a Java program where you can show passing an 
//Inner class definition as a parameter to a method.
package Tuesday22;

public class ParameterizedInnerClass {

	String str1="Outer Class";
	class Inner
	{
		String str2="Inner Class";
		void showIn()
		{
			System.out.println(str1);
			System.out.println(str2);
		}
		
	}
	void showOut(Inner inner)
	{
		inner.showIn();
	}
	public static void main(String a[])
	{
		ParameterizedInnerClass Outer=new ParameterizedInnerClass();
		Outer.showOut(Outer.new Inner());
	//	System.out.println(Inner.str2);
		
	}
	
	
}
