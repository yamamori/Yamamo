package sample.array;

public class ArraySample {

	public static void main(String[] args) {
		
		// ----------------------
		// １次元配列
		String[] arrString;
		arrString = new String[3];	// ←ここは配列のサイズ
		
		// 入れる : 配列は、０～数える。
		// つまり、サイズが３なら、０～２までしか存在しない。
		arrString[0] = "AAA";
		arrString[1] = "BBB";
		arrString[2] = "CCC";
		
		// String[] arrString = {"きくち","やまも","おおうえ"};
		
		// 取得
		String str0 = arrString[0];
		String str1 = arrString[1];
		String str2 = arrString[2];
		
		// ループの例：その１
		for (int i = 0; i < arrString.length; i++) {
			System.out.println("配列の表示(１回目)：" + arrString[i]);
		}
		
		System.out.println("-------");
		
		// ループの例：その２
		for (String str : arrString) {
			System.out.println("配列の表示(２回目)：" + str);
		}
		
		// ----------------------
		// 2次元配列 : 表と一緒。
		// String[3][3]は、「縦に３ * 横に３」で、Stringの変数が宣言されるイメージ
		String[][] arrString2;
		arrString2 = new String[3][3];
		arrString2[0][0] = "縦０・横０番目";
		arrString2[0][1] = "縦０・横１番目";
		arrString2[0][2] = "縦０・横２番目";
		arrString2[1][0] = "縦１・横０番目";
		arrString2[1][1] = "縦１・横１番目";
		arrString2[1][2] = "縦１・横２番目";
		arrString2[2][0] = "縦２・横０番目";
		arrString2[2][1] = "縦２・横１番目";
		arrString2[2][2] = "縦２・横２番目";
	}
}
