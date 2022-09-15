package Numbers;

import java.util.HashMap;
import java.util.Iterator;

public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> capitalMap = new HashMap<String,String>();
		
		capitalMap.put("India", "New Delhi");
		capitalMap.put("USA", "Washington");
		capitalMap.put("UK", "London");
		capitalMap.put(null, "Berlin");
		
		// iterator over the keys by using ketSet
		Iterator<String> it = capitalMap.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			String value = capitalMap.get(key);
			System.out.println("Key " + key + "Value " + value);
		}
		
		capitalMap.forEach((k,v)->System.out.println("key ++ " + k + "value ++"+v));
		
	}

}
