package every.ishihara;

//九九のプログラム

public class Quiz8_1_yama {
	
	/**
	 * 素晴らしいですね。IfとFor文は使いこなせてるように見えます。
	 * */
	public static void main(String[] args){
		System.out.println("-------------------------------------------");
		
		/**
		 * 九九ですので、
		 * for (int num1 = 1; num1 < 10; num1++) {
		 * for (int num1 = 1; num1 <= 9; num1++) {
		 * の方が、可読性は高そうですね。
		 * */
		for (int num1 = 1; num1 < 10; num1++) {
			for (int num2 = 1; num2 < 10; num2++) {
				int b = num1 * num2;
				if (num2 < 9) {
					
					/**
					 * if文の書き方のコツですが、
					 * 下は１つのIf文に、else Ifと続いています。
					 * つまり、関連性がある訳ですね。
					 * 
					 * その場合、
					 * (b <= 9)
					 * (9 < b)
					 * 
					 * と、大なり小なりの方向を合わせてあげると、可読性が高まります。
					 * */
					if (b <= 9) {
						
						/**
						 * おまけ：頑張っているようですので、おまけです。
						 * String.format()という、Stringのメソッドは便利です。
						 * 
						 * ※ここに、Stringの全機能が載ってます。
						 * http://java.sun.com/j2se/1.5.0/ja/docs/ja/api/java/lang/String.html#format(java.lang.String, java.lang.Object...)
						 * 「検索の方法：JAVA String」です。
						 * 
						 * ※サンプル
						 * http://www.ne.jp/asahi/hishidama/home/tech/java/formatter.html
						 * 「検索の方法：JAVA String.format()」です。
						 * 
						 * 「本で学習→サンプル・プログラム→キーワードを検索」
						 *　の流れを習慣にすると、一見、作業が増えて、スピードが遅そうですが、
						 *　結果的には、同じ時間で、３倍くらい、成長していると思います。
						 * */
						System.out.print("  " + b + "  ");
					}
					else if(b > 9){
						System.out.print(" " + b + "  ");
						
					}			
				}
				else{
					if (b <= 9) {
						System.out.println("  " + b + "  ");
					}
					else if(b > 9){
						System.out.println(" " + b + "  ");
					}
				}
			}
		}
		System.out.println("-------------------------------------------");
			
	}

}
