
public class fibonacciTwo {
	
	static final int MAX = 9;
	/** Print the Fibonacci sequence for values < MAX */
	
	public static void main(String[] args) {
	int lo = 1;
	int hi = 1;
	System.out.println(lo);
	while (hi < MAX) {
		System.out.println(hi);
		hi = lo + hi;
		lo = hi - lo;
		}

	}

}
