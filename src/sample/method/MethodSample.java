package sample.method;

import java.util.ArrayList;

public class MethodSample {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 7;
		
		// 足し算をしてくれるメソッドを呼ぶ
		int sumResult = 0;
		sumResult = sumValue(x, y);
		
		System.out.println("足し算メソッドを使った結果：" + sumResult);
		
		// 掛け算をしてくれるメソッドを呼ぶ
		int multidResult = 0;
		multidResult = MultipliedValue(x, y);
		
		System.out.println("掛け算メソッドを使った結果：" + multidResult);
	}
	
	// メソッド（関数）の例
	private static int sumValue(int num1, int num2){
		int answer = num1 + num2;
		return answer;
	}
	private static int MultipliedValue(int num1, int num2){
		int answer = num1 * num2;
		return answer;
	}
	
	// Over load の例
	private static ArrayList<String> getItemList(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("聖なる剣");
		list.add("邪悪な剣");
		list.add("光の玉");
		list.add("闇の衣");
		return list;
	}
	private static ArrayList<String> getItemList(boolean isHikari){
		ArrayList<String> list = new ArrayList<String>();
		if(isHikari){
			list.add("聖なる剣");
			list.add("光の玉");			
		}else{
			list.add("邪悪な剣");
			list.add("闇の衣");			
		}
		return list;
	}
}
