package class30;
class Synch implements Runnable {
	
	Synch synch;
	Thread t;
	String name;
	static double num;

	Synch() {
		

	}

	Synch(Synch synch, String name) {
		this.synch = synch;
		this.name = name;
		t = new Thread(this, name);
		System.out.println(t);
		t.start();
	}

	public void run() {

		synch.process(name);

	}

	public void process(String name) {

		System.out.println(name + " About to calculate SQRT...");
		synchronized(this) {
			System.out.println(name + ": Inside the BLOCK!");
			try{
				Thread.sleep(2500);
			} catch(Exception e) {}
			System.out.println(name + ": " + Math.sqrt(num));
			System.out.println(name + ": exiting...");
		}

	}

	public static void main(String a[]) {

		num = Double.parseDouble(a[0]);
		Synch obj = new Synch();
		Synch s1 = new Synch(obj, "One");
		Synch s2 = new Synch(obj, "Two");
		Synch s3 = new Synch(obj, "Three");

		//...

	}

}
