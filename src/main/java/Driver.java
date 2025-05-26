import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Counter counts:" + counter.getCount());
		
		counter.increasedBy(1);
		
		System.out.println("Counter counts:" + counter.getCount());
		
		counter.decreasedBy(2);
		
		System.out.println("Counter counts:" + counter.getCount());
                
                counter.multiplyBy(3);
		
		System.out.println("Counter counts:" + counter.getCount());
		
	}

}
