package every.kikuchi_kensuke;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.DAY_OF_WEEK;
import static java.util.Calendar.SUNDAY;

public class mainen {
	
	/** 
	 * 入力 や、整数チェックのサンプルです。
	 * */
	private static int enterNumeric(BufferedReader br, String message) throws IOException{
		while(true){
			System.out.println(message);
			String str = br.readLine();
			
			// validation
			if(str == null || str.equals("")){
				continue;
			}
			
			// get number
			int num = 0;
			try {
				num = Integer.parseInt(str);
			} catch (Exception e) {
				System.out.println("整数以外が入力されました。");
				continue;
			}
			return num;
		}
	}
	
	/**
	 * 全体的に良くできてますね。
	 * formatを利用していて、とてもシンプルなソースになっていると思います。
	 * 可読性も高く、理解しやすかったです。
	 * 
	 * うるう年をどのように計算したか？
	 * は、今度、お会いした際に、質問しますね。
	 * 
	 * カレンダーを使わずに実現するというのも、面白いかもしれませんね。
	 * ただ、、、ちょっと、面倒ですが・・・
	 * */
	public static void main(String[] args) {
		String str1 = null;
		String str2 = null;
		
		int int_A = 0;
		int int_B = 0;

		try {
			InputStreamReader ir = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
//			System.out.println("西暦を入力してください");
//			str1 = br.readLine();
//
//			System.out.println("月を入力してください");
//			str2 = br.readLine();
			
			int_A = enterNumeric(br, "西暦を入力してください");
			int_B = enterNumeric(br, "月を入力してください");
			
		} catch (IOException e) {
			System.out.println("Exception : " + e);
		}

		/**
		 * 入力値のチェックを入れた方がいいです。
		 * nullのままだと、エラーになるように思います。
		 * 
		 * また、入力される数値が、１～１２月の間とは限りませんので、
		 * 範囲チェックも必要そうですね。
		 * 例）.
		if(str1 == null || str1.equals("")){
			System.out.println("西暦が入力されませんでした。");
			return;
		}
		if(str2 == null || str2.equals("")){
			System.out.println("月が入力されませんでした。");
			return;
		}
		 * */
		int caye = Integer.parseInt(str1);
		int camo = Integer.parseInt(str2);
		int cada = 1;

		Calendar cal1 = Calendar.getInstance();

		/**
		 * 月を-1するところ勉強してますね。
		 * 何故-1しているかが、ＪＡＶＡカレンダーのポイントです。
		 * */
		cal1.set(caye, camo - 1, cada);
		int max_day = cal1.getActualMaximum(DAY_OF_MONTH);
		int day_youbi = cal1.get(DAY_OF_WEEK);

		System.out.printf("　～ %d年%2d月 ～　%n", caye, camo);
		String youbi[] = {  "Sun","Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

		for (int youbi1 = 0; youbi1 <= 6; youbi1++) {
			if (youbi1 == 6) {
				System.out.printf("|%1$2s%n", youbi[youbi1]);
			} else {
				System.out.printf("|%1$2s", youbi[youbi1]);
			}
		}
		
		/**
		 * この「SUNDAY」が、何を表しているか？
		 * なぜ、ここでいきなり使えるのか？
		 * 「public static final int」が、どういう意味を持つのか？
		 * 
		 * これらの質問に、全て答えられるなら、２５０点ですね。
		 * */
		int syoubi;
		if (day_youbi < SUNDAY) {
			syoubi = (day_youbi + 7) - SUNDAY;
		} else {
			syoubi = day_youbi - SUNDAY;
		}
		int check = 0;
		for (int tyosei = 0; tyosei < syoubi; tyosei++) {
			System.out.printf("    ");
			check++;
		}
		for (int hiniti = 1; hiniti <= max_day; hiniti++) {
			if (check < 6) {
				System.out.printf("|" + "%2d ", hiniti);
			} else {
				System.out.printf("|" + "%2d%n", hiniti);
			}
			check = ++check % 7;
		}
	}
}