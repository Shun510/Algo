import java.util.Scanner;

class SeqSearch {

	//配列aの先頭n個の要素からkeyと一致する要素を線形探索//
	static int seqSearch(int[] a,int n,int key){
		int i=0;
		
		while(true){
			if(i==n)		//探索失敗(-1を返却)
				return -1;
			if(a[i] ==key)	//探索成功(インデックスを返却)
				return i;
			i++;

		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("要素数:");
		int num = stdIn.nextInt();
		int[] x = new int[num];	//要素数numの配列
		
		for(int i=0;i<num;i++){
			System.out.print("x["+i+"]:");
			x[i] = stdIn.nextInt();
		}
		System.out.print("探す値："); //キー値の読み込み
		int ky = stdIn.nextInt();
		
		int idx = seqSearch(x,num,ky);	//配列xから値がkyの要素を探索
		
		if(idx == -1)
			System.out.println("その値の要素は存在しません");
		else
			System.out.println("その値はx["+idx+"]にあります");
	}

}
