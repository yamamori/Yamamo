package every.anji;

import java.io.*;

public class max {

	public static void main(String args[]) throws IOException {
		System.out.println("整数を2つ入力してください");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
		String str2 = br.readLine();

		int x = Integer.parseInt(str1); // 文字を数字に変換する。
		int y = Integer.parseInt(str2);

		while (x > 0 && y > 0) { // 余りと割る数が0になるまで
			int amari = x % y;
			x = y;
			y = amari;
		}
		int tmp1 = Integer.parseInt(str1);
		int tmp2 = Integer.parseInt(str2);

		System.out.println(x + "は最大公約数である。");
		System.out.println(tmp1 * tmp2 / x + "は最小公倍数である。");
	}
}