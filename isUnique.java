import java.util. *;



public class isUnique {


	public static void main(String[] args) {
		// add keys and values in 'map'
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("Kendrick", "Perkins");
		map.put("Stuart", "Regs");
		map.put("Jessica", "Miller");
		map.put("Brues", "Reges");
		map.put("Hal", "Perins");
		
		isUniques(map);
		
		

	}
	
	public static boolean isUniques(Map<String, String> map) {
		HashSet<String> set = new HashSet<String>();
		
		// bring every single value out
		for (String key : map.keySet()) {
			String value = map.get(key);
			
			//and see if the value existed before
			if (set.contains(value)) {
				System.out.println("false"); 
				return false; 
			}
			
			// add the value on set for a reference
			set.add(value);
		
		}
		System.out.println("true");
		return true;
	}
	

	
}