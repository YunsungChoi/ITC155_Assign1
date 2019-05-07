
public class writeNum {

	public static void main(String[] args) {
		
		// call the method to check if it function correctly or not.
		writeNums(12);
	}
	
	public static void writeNums (int n) {
		
			// if the int is less than 1, throw an exception.
		    if (n < 1) {
		        throw new IllegalArgumentException("Number must be bigger than 1");
		        
		    // if the int is equal to 1, print 1.
		    } else if (n == 1) {
		        System.out.print("1");
		        
		    // if the int is greater than 1, call this method again with (n-1) and print n.
		    } else {
		        writeNums(n - 1);
		        System.out.print(", " + n);
		    }
		}

		
	

}
