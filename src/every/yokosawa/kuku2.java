package every.yokosawa;

public class kuku2 {

	/**
	 * 素晴らしいです！
	 * メソッドも使いこなしてますね。使い方も合ってます。
	 * 全体的に、インデントや、閉じタグの位置がおかしいですので、気をつけてください。
	 * （Ctrl＋Shift＋F）で、正しいインデントになります。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int kuku[][] = new int[9][9]; //int型の二次元配列kukuを定義。9*9まで対応できるよう準備

		/**
		 * 九九なので、１～９を明示している点が素晴らしいですね。
		 * */
		for (int junodan = 1; junodan <= 9; junodan++) { //kuku[5][6]には、5*6=30の結果が入るように配列に値を入れていく
			for (int ichinodan = 1; ichinodan <= 9; ichinodan++) {
					kuku[junodan-1][ichinodan-1] = junodan * ichinodan;}
		}
		
		String kuku2[][] = new String[9][9]; //スペースメゾッドから受け取るためのString型の二次配列kuku2を準備
		kuku2 = SpaceMethod(kuku); //int型のkukuを送り込み、String型のkuku2をスペースを入れた状態で受け取る

		
		/**
		 * こちらも秀逸ですね。
		 * １～９でjunodanをループさせ、
		 * １～８でichinodanをループさせた方が、直感的でしたね。
		 * */
		for (int junodan = 0; junodan <= 8; junodan++) { //段の終わり（9番目）で改行されるようにln型のsysoutを使用
			for (int ichinodan = 0; ichinodan <= 7; ichinodan++) {
					System.out.print(kuku2[junodan][ichinodan]);
			}
			System.out.println(kuku2[junodan][8]);	
		}

	}
	
	
	/**
	 * 素晴らしいです。
	 * int[][]→String[][]への変換メソッドですね。
	 * int→Stringの変換メソッドを用意すると、総合のループ回数を減らせそうですね。
	 * */
	static String[][] SpaceMethod(int[][] kuku) { //スペースを入れて、int系のkukuをString系のkuku2に変換するメゾッド
		String kuku2[][] = new String[9][9];

		for (int junodan = 0; junodan <= 8; junodan++) { //int型のkukuを参照し、一桁の数にのみスペースを入れてkuku2に代入
			for (int ichinodan = 0; ichinodan <= 8; ichinodan++) {
				if(kuku[junodan][ichinodan] < 10){
					kuku2[junodan][ichinodan] = "│　"+kuku[junodan][ichinodan];
				}else {kuku2[junodan][ichinodan] = "│"+kuku[junodan][ichinodan];
		}

		}}
			return kuku2;
}}
