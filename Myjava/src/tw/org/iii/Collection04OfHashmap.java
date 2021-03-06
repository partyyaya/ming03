package tw.org.iii;

import java.util.HashMap;
import java.util.Set;

public class Collection04OfHashmap {

	public static void main(String[] args) {
		//HashMap類似collection但不適collection
		HashMap<String,Object> map = new HashMap<>();
		Object o1 = map.put("name", "ming");
		map.put("weight", 80);
		map.put("gender", true);
		Object o2 = map.put("name", "ming2");
		System.out.println(o2);//會印出放入name的前一個object
		System.out.println(map.get("gender"));
		System.out.println(map);
		map.put("weight", 60.7);
		System.out.println(map.get("weight"));
		
		Set<String> s1 = map.keySet();
		for(String s2:s1){
		System.out.println(s2+" "+map.get(s2));
		}
	}

}
