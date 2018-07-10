// Immutable classes

package demo1;

public final class demo4 {
private final String name;
private final String day;
demo4(String name, String day)
{
	this.name=name;
	this.day=day;
}
	String getName()
	{
		return this.name;
	}
	String getDay()
	{
		return this.day;
	}
	
	public static void main(String args[])
	{
		demo4 dem=new demo4("Devansh","Thursday");
		System.out.println("Name:"+dem.name);
		System.out.println("Day:"+dem.day);
	//	dem.day="Friday";
	//	dem.name="Vib";
		
	}
}
