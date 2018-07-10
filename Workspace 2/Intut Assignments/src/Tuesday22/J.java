package Tuesday22;

class J { // Outer class
	
	private int num = 10;
	String name = "Robert";

	class K { // Inner class

		int id = 25;

		void showIn() {
			System.out.println(id);
			System.out.println(name);
			System.out.println(num);
		}

	}

	/*void showOut() {
		K k1 = new K();
		k1.showIn();
	}*/

	K getInnerClass() {
		return new J().new K();
	}

	public static void main(String a[]) {
		J j1 = new J();
		//j1.showOut();

		//j1.K k1 = new j1.K(); // different meaning in the syntax.
		//k1.showIn();

		j1.new K().showIn();
		System.out.println(j1.new K().id);

		j1.getInnerClass().showIn();

		
	}

}

/*
java.lang.Object
java.lang.String
java.util.ArrayList
*/





