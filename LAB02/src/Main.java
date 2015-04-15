import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("-------------Adding-------------");
		
		// 10 Times

		long startTime = System.nanoTime();

		Set<String> set10 = new HashSet<String>();

		for (int i = 1; i < 11; i++) {
			set10.add(Integer.toString(i));
		}
		long endTime = System.nanoTime();
		long time = endTime - startTime;

		System.out.println("Time for adding 10 elements: " + time
				+ " Nano Seconds");
		
		
		// 100 Times
		
		startTime = System.nanoTime();

		Set<String> set100 = new HashSet<String>();

		for (int i = 1; i < 101; i++) {
			set100.add(Integer.toString(i));
		}
		 endTime = System.nanoTime();
		 time = endTime - startTime;

		System.out.println("Time for adding 100 elements: " + time
				+ " Nano Seconds");
		
		// 1000 Times
		
		startTime = System.nanoTime();

		Set<String> set1000 = new HashSet<String>();

		for (int i = 1; i < 1001; i++) {
			set1000.add(Integer.toString(i));
		}
		 endTime = System.nanoTime();
		 time = endTime - startTime;

		System.out.println("Time for adding 1000 elements: " + time
				+ " Nano Seconds");
		
		// 10 000 Times
		
		startTime = System.nanoTime();

		Set<String> set10000 = new HashSet<String>();

		for (int i = 1; i < 1001; i++) {
			set10000.add(Integer.toString(i));
		}
		 endTime = System.nanoTime();
		 time = endTime - startTime;

		System.out.println("Time for adding 10 000 elements: " + time
				+ " Nano Seconds");


		System.out.println("---------------------------------");

		System.out.println("-------------Browsing-------------");

		
		Iterator<String> iterator = set10.iterator();
		startTime = System.nanoTime();
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
		}
		endTime = System.nanoTime();
		time = endTime - startTime;
		System.out.println("Time for browsing 10 elements: " + time
				+ " Nano Seconds");
		
		
		iterator = set100.iterator();
		startTime = System.nanoTime();
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
		}
		endTime = System.nanoTime();
		time = endTime - startTime;
		System.out.println("Time for browsing 100 elements: " + time
				+ " Nano Seconds");


		iterator = set1000.iterator();
		startTime = System.nanoTime();
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
		}
		endTime = System.nanoTime();
		time = endTime - startTime;
		System.out.println("Time for browsing 1000 elements: " + time
				+ " Nano Seconds");
		
		
		iterator = set10000.iterator();
		startTime = System.nanoTime();
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
		}
		endTime = System.nanoTime();
		time = endTime - startTime;
		System.out.println("Time for browsing 10 000 elements: " + time
				+ " Nano Seconds");
		
		System.out.println("---------------------------------");


		System.out.println("-------------Search-------------");
		
		Iterator<String> iterator1 = set10.iterator();
		startTime = System.nanoTime();
		while (iterator1.hasNext()) {
			if ("7".equals(iterator1.next())) {
				System.out.println("Element 7 exists");
			}
		}
		endTime = System.nanoTime();
		time = endTime - startTime;
		System.out.println("Time for searching 1 element in 10: " + time
				+ " Nano Seconds");
		
		
		iterator1 = set100.iterator();
		startTime = System.nanoTime();
		while (iterator1.hasNext()) {
			if ("7".equals(iterator1.next())) {
				System.out.println("Element 7 exists");
			}
		}
		endTime = System.nanoTime();
		time = endTime - startTime;
		System.out.println("Time for searching 1 element in 100: " + time
				+ " Nano Seconds");
		
		
		iterator1 = set1000.iterator();
		startTime = System.nanoTime();
		while (iterator1.hasNext()) {
			if ("7".equals(iterator1.next())) {
				System.out.println("Element 7 exists");
			}
		}
		endTime = System.nanoTime();
		time = endTime - startTime;
		System.out.println("Time for searching 1 element in 1000: " + time
				+ " Nano Seconds");
		
		iterator1 = set10000.iterator();
		startTime = System.nanoTime();
		while (iterator1.hasNext()) {
			if ("7".equals(iterator1.next())) {
				System.out.println("Element 7 exists");
			}
		}
		endTime = System.nanoTime();
		time = endTime - startTime;
		System.out.println("Time for searching 1 element in 10 000: " + time
				+ " Nano Seconds");

		
		
		System.out.println("---------------------------------");
		
		System.out.println("-------------Remove-------------");

		startTime = System.nanoTime();
		for (int i = 1; i < 11; i++) {
			String s = Integer.toString(i);
			set10.remove(s);
		}

		endTime = System.nanoTime();
		time = endTime - startTime;
		System.out.println("Time for removing 10 elements: " + time
				+ " Nano Seconds");
		
		startTime = System.nanoTime();
		for (int i = 1; i < 101; i++) {
			String s = Integer.toString(i);
			set100.remove(s);
		}

		endTime = System.nanoTime();
		time = endTime - startTime;
		System.out.println("Time for removing 100 elements: " + time
				+ " Nano Seconds");
		
		
		startTime = System.nanoTime();
		for (int i = 1; i < 1001; i++) {
			String s = Integer.toString(i);
			set1000.remove(s);
		}

		endTime = System.nanoTime();
		time = endTime - startTime;
		System.out.println("Time for removing 1000 elements: " + time
				+ " Nano Seconds");
		
		startTime = System.nanoTime();
		for (int i = 1; i < 10001; i++) {
			String s = Integer.toString(i);
			set1000.remove(s);
		}

		endTime = System.nanoTime();
		time = endTime - startTime;
		System.out.println("Time for removing 10 000 elements: " + time
				+ " Nano Seconds");

		System.out.println("---------------------------------");
	}

}
