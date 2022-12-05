import java.util.concurrent.*;

public class TextLoop implements Runnable {
	public static final int COUNT = 10;
	private final String name;
	

	public TextLoop(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < COUNT; i++) {
			sleep(i);
		}
	}

	private void sleep(int j) {
		try {
			System.out.print("Sleeping for a second, loop" + j + " " + name);
			for (int i = 0; i < 5; i++) {
				Thread.sleep(200);
				System.out.print(". " + name.substring(name.length()-1));
			}
			System.out.println(name + " loop " + j + " done!");
		} catch (InterruptedException ex) {
			ex.printStackTrace(); // Nothing to do, sleep a bit less
		}
	}

	public static void main(String args[]) {
		if (args.length < 1 || (!args[0].equals("0") && !args[0].equals("1"))) {
			System.out.println("USAGE: java TextLoop <mode>");
			System.out.println(" mode 0: without threads");
			System.out.println(" mode 1: with threads");
		} else if (args[0].equals("0")) {
			for (int i = 0; i < 10; i++) {
				Runnable r = new TextLoop("Thread " + i);
				r.run();
			}
		} else {
			for (int i = 0; i < 2; i++) {
				Runnable r = new TextLoop("Thread " + i);
				Executor t = new ScheduledThreadPoolExecutor(1);
				t.execute(r);
				//t.start();
			}
		}
	}
}