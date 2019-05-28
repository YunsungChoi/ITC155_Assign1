
public class SelectionSort {
	
	
	public static void SelectionSort1 (int[] Array) {
		
		
		// for every element in the array
		for (int i= 0; i < Array.length-1; i++) {
			int index=i;
			
			//look for the next index element to compare the size
			for (int j = i+1; j < Array.length; j++) {
				
				/* ******* 
				 * Here standard selection sort would find the smaller number
				 * and switch ( send it to the front ) the position with the target number.
				 * which makes Array[j] > Array[index].
				 * I end up finding out that the answer is just switching the Operator.
				 * Since we are, anyway, switching positions of two numbers in the array
				 * I do not see any other reason fixing other parts of the class, while
				 * Array[j] < Array[index] will move the bigger numbers to the end of the array.
				 */
				if(Array[j] < Array[index]) index =j;
			}
			
			// Switch the position of two numbers compared from above.
			int Num = Array[index];
			Array[index] = Array[i];
			Array[i] = Num;
			
		}
		
		// print the result
		for (int i: Array)
		System.out.print(i + ", ");
		
		
	}
	
	public static void main(String[] args) {
		// test for the method.
		int[] arr1 = {99,27,10,5,94,31,49,60,77,83,120};
		SelectionSort1(arr1);

	}
	/* Perhaps This is not what the answer must look like .
	 * But from my understanding, standard selection sort and modified selection sort
	 * algorithms are alike therefore one must not be faster than another and the complexity class
	 * must be equal as O(N^2)...
	 */

}



