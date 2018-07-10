package randomizerprimer;

public class Primer implements Runnable {
	
	Thread t;
	String name;
	
	Primer(String name) {
		this.name = name;
		t = new Thread(this, name);
		t.start();
	}
	
	public void run() {
		while(!Randomizer.queue.isEmpty()) {
			RandomNumber number = Randomizer.queue.poll();
			if(number != null && number.getNumber() % 2 == 0) {
				number.setPrime(true);
			}
			else if(number != null && number.getNumber() % 2 != 0) {
				number.setPrime(false);
			}
			System.out.println(name + " : " + number.getNumber());
			Randomizer.primerQueue.add(number);
			/*try{
				Thread.sleep(5);
			} catch(Exception e) {
				
			}*/
		}
	}
	
}
