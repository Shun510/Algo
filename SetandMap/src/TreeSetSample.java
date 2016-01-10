import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class TreeSetSample {

	public static void main(String[] args) {
		Set<String>set=new TreeSet<String>();
		set.add("C");
		set.add("A");
		set.add("B");
		set.add("B");
		
		for(String item:set){
			System.out.println(item);
		}
		System.out.println(" ");

		Iterator<String> iter = set.iterator();
		while(iter.hasNext()){
			String item = iter.next();
			System.out.println(item);
		}
		System.out.println("");
		
		set.remove("A");
		
		for(String item:set){
			System.out.println(item);
		}
	}

}
