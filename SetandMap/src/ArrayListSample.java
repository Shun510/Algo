
import java.util.ArrayList;
public class ArrayListSample {
	public static void main(String[] args){
		ArrayList<String>list = new ArrayList<String>();
		list.add("東京");
		list.add("ロンドン");
		list.add("パリ");
		list.add("パリ");
		
		for(int i = 0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		System.out.println(" ");
		
		list.remove(1);
		
		for(int i = 0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		System.out.println(" ");
		
		list.add(2,"バンコク");
		
		for(int i = 0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}

}
