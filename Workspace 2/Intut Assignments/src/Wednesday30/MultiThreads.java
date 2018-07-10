package Wednesday30;
// Main - Reverses the string
// Child - Converting a string to upper case

class MultiThreads implements Runnable {

	Thread t;
	String name;
	static String data;
	
	MultiThreads(String name) {
		this.name = name;
		t = new Thread(this, name);
		System.out.println(t);
		//t.setPriority(10);
		t.start(); // Cannot start exec immediately here....
	}

	public void run() {
		for(int i=0;i<data.length();i++) {
			int ch = data.charAt(i);
			ch -= 32;
			System.out.println(name + ": " + (char) ch);
			try{
				Thread.sleep(500);
			} catch(Exception e) {}
		}
		System.out.println(name + " Exiting...");
	}

	public static void main(String a[]) {

		data = a[0];
		MultiThreads m1 = new MultiThreads("One");
		MultiThreads m2 = new MultiThreads("Two");
		MultiThreads m3 = new MultiThreads("Three");
		
		for(int i=data.length()-1;i>=0;i--) {
			System.out.println("Main: " + data.charAt(i));
			try{
				Thread.sleep(1000);
			} catch(Exception e) {}
		}
		System.out.println("Main Exiting...");
	}

}