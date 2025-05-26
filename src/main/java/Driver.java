import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Counter count:" + counter.getCount());
		
		counter.increasedBy(5);
		
		System.out.println("Counter count:" + counter.getCount());
		
		counter.decreasedBy(2);
		
		System.out.println("Counter count:" + counter.getCount());
                
                counter.multiplyBy(6);
		
		System.out.println("Counter count:" + counter.getCount());
		
	}

}
