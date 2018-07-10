package class1;
//We have created an abstract class Observer and 
//a concrete class Subject that is extending class Observer.
public abstract class Observer  {
	  protected Subject subject;

	public abstract void update();
}
