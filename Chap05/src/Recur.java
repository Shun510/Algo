import java.util.Scanner;

class Recur {

	// 真に再帰的なメソッド //
	static void recur(int n){
		if(n>0){
			recur(n-1);
			System.out.println(n);
			recur(n-2);
		}
	}
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("整数を入力せよ:");
		int x = stdin.nextInt();
		
		recur(x);
	}

}
