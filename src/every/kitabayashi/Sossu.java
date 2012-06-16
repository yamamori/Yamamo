//2012/05/19
//素数を導き出すプログラム
//xとyに素数を求めたい範囲を入力して実行する

package every.kitabayashi;

public class Sossu {
	public static void main(String[] args) {

		int x = 1; // 検査の最小値
		int y = 2000; // 検査の最大値

		while (x <= y) { // xがyより小さい限り処理を繰り返す
			boolean ans = true;
			for (int i = 2; i <= x - 1; i++) { // 初期値：iを2; 条件式：iとx-1比べてる;
												// iがx-1以下なら繰り返し処理をする
				if (x % i == 0) {
					ans = false;
					break;
				} else {

				}
			}
			if (ans == true) {
				System.out.println(x); // xの値（素数）を出力
				x++; // xに1を足す
			} else {
				x++; // xに1を足す
			}
		}
	}
}
