package every.yokosawa;

import java.util.ArrayList;
public class kuku {

	/**
	 * 今のところ、同じ問題を、ArrayListと配列でチャレンジしたのは、恐らく、横澤さんだけだと思います。
	 * 違いを理解できていましたら、完璧です！
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> Integerlist = new ArrayList<Integer>(); //Intを格納するArrayList、Integerlistを定義し初期化
		

		for (int hidari = 1; hidari <= 9; hidari++) { //Integerlistに九九の値を1つずつ入れる計算
			for (int migi = 1; migi <= 9; migi++) {
					Integerlist.add(hidari * migi);}
		}		
		
		ArrayList<String>Stringlist; //Stringを格納するArrayList、Stringlistを定義
		Stringlist = SpaceMethod(Integerlist); //Integerlistをスペース作成のためのメゾッドに送り込み、Stringlistを受け取る
		
		int loop = 0; //リストの表示に使うためのint変数loopを定義初期化

		for (int n = 0; n <= 8; n++) { //段の一番最後（9番目）の時だけ改行されるlnのsysoutを使用し整列
			for (int i = 0; i <= 7; i++) {

				System.out.print((String) Stringlist.get(loop));
				loop = loop + 1;
			}
			System.out.println(Stringlist.get(loop));
			loop = loop + 1;
			/**
			 * 【おまけ】
			 * loop = loop + 1;
			 * は
			 * loop += 1;
			 * という書き方もできます。
			 * */
		}
	}
	
	
	
	static ArrayList<String> SpaceMethod(ArrayList<Integer> IntegerList) { //Integerlistを受け取り、スペースを入れたStringlistを生成するためのメゾッド
		ArrayList<String> Stringlist = new ArrayList<String>();

		for (int loop = 0; loop < IntegerList.size(); loop++) { //Integerlistを参照し、9より小さい数字にのみスペースを入れてStringlistに反映
			if (IntegerList.get(loop) <= 9) {
				Stringlist.add("│  " + IntegerList.get(loop));
//			} else if (IntegerList.get(loop) > 99) { //3桁以上の数字にも対応できるように。おまけ。
//				Stringlist.add("│" + IntegerList.get(loop));
			} else
				Stringlist.add("│ " + IntegerList.get(loop));
		}

		return Stringlist;
	}
}
