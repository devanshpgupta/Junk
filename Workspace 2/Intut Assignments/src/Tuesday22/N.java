package Tuesday22;
class N {

	int x = 10;
	int num = 20;

		class P {
			public int x=10;
			void showIn() {
				System.out.println("Hello!");
			}

		}

	/*void test() {
		// showIn()....?
	}*/

	public static void main(String a[]) {
		//...
		N n=new N();
		System.out.print(n.new P().x);
	}


}
