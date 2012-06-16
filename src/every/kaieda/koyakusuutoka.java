package every.kaieda;

public class koyakusuutoka {

	/**
	 * XXX : 表示が多く、とても見やすくて素晴らしいですね。
	 * XXX : デクリメント（small--）を利用したり、宣言を省略したりと、for文の理解度はかなり高いと感じました。
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int x = 150;
		int x = 10;
		int y = -1;

		/**
		 * XXX : 仮に、x,yが、ユーザ（人）が入力した値と仮定し、
		 * ０以下の数値が入力された場合、結果が何もでなくなってしまいますね。
		 * */
		
		if (x == y) {
			System.out.println("数字が同じです。");

		} else {
			if (x > y) {
				/** 
				 * XXX : 「small」は、for文の中のカウントとしてのみ、利用しているようですので、
				 * for文の中の第一区画で、宣言と初期化を行った方がいいです。
				 * */
				int small = y;
				for (; 1 <= small; small--)
					if (x % small == 0 && y % small == 0) {
						System.out.println("最大公約数は");
						System.out.println(small);
						System.out.println("です。");

						System.out.println("最小公倍数は");
						System.out.println(x * y / small);
						System.out.println("です。");

						break;
					} else {
					}
			} else {
				/** 
				 * XXX : この処理は、上の処理と殆ど同じですね。
				 * ということは、同じではない場所（今回だとsmallの値がxなのか、yなのかですね）を、
				 * 事前にチェックしておくことで、同じ処理を２箇所に書かずに済みそうですね。
				 * */
				int small = x;
				for (; 1 <= small; small--)
					if (x % small == 0 && y % small == 0) {
						System.out.println("最大公約数は");
						System.out.println(small);
						System.out.println("です。");

						System.out.println("最小公倍数は");
						System.out.println(x * y / small);
						System.out.println("です。");

						break;
					}
			}

		}

	}

}
