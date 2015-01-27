package ba.bitcamp.edibimamovic.exercises;

public class Greetings extends Thread {
	private int id;
	private static int totalCount =0;

	public Greetings(int id) {
		this.id = id;
	}

	public void greetingCount() {
		for (int i = 0; i < 5; i++) {
			System.out.printf("Hello from %d just counted to: %d, total count is: %d \n", id, i, totalCount);
			increaseCount();
		}

	}

	public void run() {
		greetingCount();
	}
	
	public synchronized void increaseCount(){
		totalCount++;
	}

	public static void main(String[] args) throws InterruptedException {

		Greetings[] gr = new Greetings[5];

		for (int i = 0; i < gr.length; i++) {
			gr[i] = new Greetings(i);
			gr[i].start();

		}

		for (Greetings g : gr) {

			g.join();
		}
		System.out.println("Gotovo");
	}
}
