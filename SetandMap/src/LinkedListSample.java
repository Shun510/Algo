import java.util.LinkedList;
public class LinkedListSample {
	public static void main(String[] args){
		LinkedList<String>list = new LinkedList<String>();
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
