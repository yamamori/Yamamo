//2012/05/19
//引き算するためのプログラム
//xとyに計算したい値を入力して実行する

package every.kitabayashi;

public class Keisan {
	public static void main(String[] args){
		
		int x = 5;			//計算の1つ目の値
		int y = 10;			//計算の2つ目の値
		
		
		if ( x == y ){		//xとyが同じ数字かどうかの確認

			System.out.println("xとyは同じ数字です。");

		}
		else{
			int ans = x - y;	//xとyの差の計算
			String msgValue = "xとyの差があります。";
			System.out.println(msgValue);
			System.out.println("差は" + ans + "です");
		}
	}
}
