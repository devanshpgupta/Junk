package demo1;

public class demo3 {
private static final demo3 insta=new demo3();
private void demo3(){
	System.out.println("Hello demo3");
}
private demo3 getInstance()
{
	return(insta);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insta.getInstance();
	}

}
