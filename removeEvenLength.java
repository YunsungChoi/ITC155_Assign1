import java.util.ArrayList;

public class removeEvenLength{
	
	public static void main(String[] args) {
		ArrayList<String> arrayStr = new ArrayList<String>();
		arrayStr.add("home");
		arrayStr.add("add");
		arrayStr.add("good");
		arrayStr.add("computer");
		arrayStr.add("broken");
		arrayStr.add("strings");
		arrayStr.add("yunsungchoi");
		arrayStr.add("assignment2");
		arrayStr.add("homework");
		arrayStr.add("evennumber");
		
		
		System.out.println(arrayStr);
		removeEvenLengtht(arrayStr);
		System.out.println(arrayStr);
		
	}
		
	public static void removeEvenLengtht (ArrayList<String> arrayStr) {
	
	for (int i =0; i < arrayStr.size(); i++) {
		String word = arrayStr.get(i);
		
		if (word.length() % 2 == 0) {
			arrayStr.remove(i);
			
			// since index had been changed (-1), started from the previous index number
			i--;
		}
	}
	}
	
}

