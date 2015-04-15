import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class TestFor1000Elements {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();

		Set set10 = new HashSet();

		System.out.println("Adding 1000 elements");
		for (int i = 1; i < 1001; i++) {
			String s = Integer.toString(i);
			set10.add(s);
		}

		System.out.println("Browsing 1000 elements");
		Iterator iterator = set10.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Look if 7 exists");
		Iterator iterator1 = set10.iterator();
		while (iterator1.hasNext()) {
			if ("7".equals(iterator1.next())){
				System.out.println("Element 7 exists");
			}
		}
		
		System.out.println("Removing 1000 elements");
		for (int i = 1; i < 11; i++) {
			String s = Integer.toString(i);
			set10.remove(s);
		}
		
        long endTime = System.currentTimeMillis();
        long time= endTime-startTime;
        
        System.out.println("Time for 1000 elements: "+ time+"Ms");

	}

}
