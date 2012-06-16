//2012/05/19
//最大公約数を求めるプログラム
//調べる値を【keisan1】と【keisan2】に入力して実行する

package every.kitabayashi;

public class Max {
	public static void main(String[] args) {

		int kensa1 = 2; // 検査の値1
		int kensa2 = 3; // 検査の値2

		// 入力チェックを入れる

		if (kensa1 <= 0 || kensa2 <= 0) {
			System.out.println("検査の値のどちらかが0のため、検査は行いません。");
		} else if (kensa1 == kensa2) {
			System.out.println("検査の値は同じです。" + "最大公約数は" + kensa1 + "です。");
		} else {

			int shiraberu1;
			int shiraberu2;

			if (kensa1 < kensa2) {
				shiraberu1 = kensa1;
				shiraberu2 = kensa2;
			} else {
				shiraberu1 = kensa2;
				shiraberu2 = kensa1;
			}

			for (int i = shiraberu1; i > 0; i--) {
//			for (int i = shiraberu1; i <=shiraberu2; i--) {
//			これでも動くがiがshiraberu2より小さくなることがないため、プログラムとしてだめ
				if (shiraberu1 % i == 0) {
					if (shiraberu2 % i == 0) {
						System.out.println(String.valueOf(shiraberu1) + "と" + shiraberu2 + "の最大公約数は" + i + "です");
						break;
					} else {
				
					}
				} 
				else {
				
				}
//				System.out.println(shiraberu1 + "と" + shiraberu2 + "最大公約数はありません");
			}
		}
	}
}
