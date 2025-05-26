package src.main.java;

public class Counter {

	private int count;
	
	public Counter() {
		this.reset();
	}
		
	public void reset() {
		count = 1;
	}
	
	public void increment() {
		count++;
	}
	
	public void decrement() {
		count--;
	}
	
	public int getCount() {
            return count;
	}
        
        public void increasedBy(int by) {
            count += by;
        }

        public void decreasedBy(int by) {
            count -= by;
        }

        public void multiplyBy(int by) {
            count *= by;
        }
}
