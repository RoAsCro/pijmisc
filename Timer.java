
public class Timer implements Runnable {

	int name = 0;
	int duration = 0;
	
	public Timer(/*int name, int duration*/) {
		//notifyAll();
		
	}
	
	public static void main(String args[]) {
		Timer t = new Timer();
		for (int i = 0; i < 3; i++) {
			Thread th = new Thread(t);
			th.start();

		}
		
	}

	public synchronized void task(int input) {
		
		try {
			Thread.sleep(input); // sleep 1000ms = 1 second
		} catch (InterruptedException ex) {
			// Nothing to do in this case, just sleep less...
		}
		try {
			wait();
		} catch (InterruptedException ex) {
			
		}
		System.out.println("Finished Tasks " + name);
	}

	@Override
	public synchronized void run() {
		notifyAll();
		System.out.print("Enter the duration ");
		int input = Integer.parseInt(System.console().readLine());
		System.out.println();
		name++;
		
		task(input);
		
	}

}
