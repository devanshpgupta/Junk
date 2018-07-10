package Wednesday30;
class ThreadInfo {
	
	public static void main(String a[]) {

		//Thread t = Thread.currentThread();
		System.out.println(Thread.currentThread());

		for(int i=5;i>0;i--) {
			System.out.println(i);
			try{
				Thread.sleep(1000);
			} catch(InterruptedException ie) {
				
			}
		}

	}


}