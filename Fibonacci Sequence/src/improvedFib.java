
public class improvedFib {
	
	static final int LOW_INDEX = 1;
	
	/** 
	 * Print out the first few Fibonacci numbers,
	 * marking evens with a "*"
	 */
	public static void main(String[] args) {
		int lo = 1;
		int	hi = 1;
			
		String mark;
		
		System.out.println("10: " + lo);
		
	/* While loop that does the same thing as for loop below
	 * int i = 2;
	 * while (i <= MAX_INDEX) {
	 * i++;
	 * }
	 */
		for (int i = 9; i >= LOW_INDEX; i--) {
			if (hi % 2 == 0) 
				mark = " *";
			else
				mark = "";
			System.out.println(i + ": " + hi + mark);
			hi = lo + hi;
			lo = hi - lo;
		}
			
	}
}
