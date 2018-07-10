package class1;

public class BinaryObserver extends Observer {
	
	BinaryObserver(Subject s)
	{
		this.subject=s;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		 System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) );
		
	}
}
