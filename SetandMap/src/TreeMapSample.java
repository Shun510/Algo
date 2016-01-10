import java.util.TreeMap;

public class TreeMapSample {

	public static void main(String[] args) {
		TreeMap<String,String> map= new TreeMap<String,String>();
		map.put("red","赤");
		map.put("blue","青");
		map.put("green","緑");
		map.put("green","緑");
		
		System.out.println(map.get("blue"));
		System.out.println(" ");
		
		for(String key:map.keySet()){
			System.out.println(key+"="+map.get(key));
		}
		System.out.println(" ");
		
		map.remove("green");
		
		for(String key:map.keySet()){
			System.out.println(key+"="+map.get(key));
		}

	}

}
