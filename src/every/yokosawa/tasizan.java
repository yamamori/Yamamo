package every.yokosawa;

public class tasizan {

	/**
	 * 完璧ですね。この問題は簡単すぎましたね。
	 * インデントが間違ってますので、気をつけてください。
	 */
	public static void main(String[] args) {
	int ans =0; //答えであるansを定義し初期化
	
	/**
	 * 問題は、１～１００まででしたので、
	 * 初期値は、１からの方が可読性が高かったですね。
	 * */
	for(int i = 0;i <= 100;i++){
		ans = ans+i;
	}							//自然数に一つ大きい自然数を足していく計算
	
	System.out.println(ans); //演算結果の表示
	
	}

}
