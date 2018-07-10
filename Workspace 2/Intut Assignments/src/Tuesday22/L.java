package Tuesday22;

class L {
	
	static int num = 10;
	double d = 5.5;

	static class M {

		static String name = "Hello";

		void showIn() {
			//L l1 = new L();
			System.out.println(new L().d);
			System.out.println(num);
		}

	}

	public static void main(String a[]) {
		M m1 = new M();
		m1.showIn();
	}



}
