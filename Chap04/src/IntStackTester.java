//int型スタックの利用例
import java.util.Scanner;
class IntStackTester {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		IntStack s = new IntStack(100);		//最大100個プッシュできるスタック

		while(true){
			System.out.println("現在のデータ数："+s.size()+"/"+s.capacity());
			System.out.print("(1)プッシュ　(2)ポップ　(3)ピーク "+"(4)ダンプ　(0)終了：");

			int menu = stdin.nextInt();
			if(menu ==0)break;

			int x;
			switch(menu){
			case 1:							//プッシュ
				System.out.print("データ：");
				x = stdin.nextInt();
				try{
					s.push(x);
				}catch(IntStack.OverflowIntStackException e){
					System.out.println("スタックが満杯です");
				}
				break;

			case 2:
				try{
					x = s.pop();
					System.out.println("ポップしたデータは"+x+"です");
				}
			}
		}

	}

}
