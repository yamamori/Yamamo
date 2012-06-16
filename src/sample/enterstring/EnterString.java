package sample.enterstring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnterString {
	
	public static void main(String[] args) {
		String str1 = "";
		String str2 = "";
		
		// サンプル：文字列の入力
		try {
			InputStreamReader ir = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ir);
			
			System.out.println("西暦を入力してください");
			str1 = br.readLine();

			System.out.println("月を入力してください");
			str2 = br.readLine();
			
		} catch (IOException e) {
			System.out.println("Exception : " + e);
		}
		System.out.println(str1 + " : " + str2);
		
		// サンプル：文字列⇒数字変換
		Integer integer_A = Integer.parseInt(str1);
		Integer integer_B = Integer.parseInt(str2);
		
		int a = integer_A.intValue();
		int b = integer_B.intValue();

		// これで、aとbは数字
		
	}
}
