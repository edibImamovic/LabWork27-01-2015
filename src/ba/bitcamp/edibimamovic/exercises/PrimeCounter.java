package ba.bitcamp.edibimamovic.exercises;

import java.util.*;

public class PrimeCounter extends Thread {

	private int start;
	private int end;
	private static int counter;
	private Date startTime;
	private Date endDate;

	public PrimeCounter(int start, int end) {
		super();
		this.start = start;
		this.end = end;
		counter = 0;
	}

	public void run() {

	}

	private static boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		PrimeCounter pc = new PrimeCounter(1, 30);
		pc.start();
		System.out.println(pc);
	}

}
