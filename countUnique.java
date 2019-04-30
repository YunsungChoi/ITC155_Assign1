import java.util.*;





public class countUnique {
	
	static ArrayList<Integer> list = new ArrayList<Integer>();
	

	public static void main(String[] args) {
		
		// to test the result, create an array list, and call the method
		// check if the result is equal to 5
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(7);
		list.add(3);
		list.add(-1);
		list.add(2);
		list.add(3);
		list.add(7);
		list.add(2);
		list.add(15);
		list.add(15);
		
		
		countuniques(list);
		
		

	}
	
	public static int countuniques(ArrayList<Integer> list) {
		
		/* 	Since HashSet does not store duplicate numbers, 
		* 	create a HashSet and add every single numbers on the 'list'
		*	to the 'set'. And return the size of it.
		*/	
		HashSet<Integer> set = new HashSet<Integer>();
		
		for (int n: list) {
			set.add(n);
			
		}
	System.out.println(set.size());
	return set.size();	
	}
	

}
