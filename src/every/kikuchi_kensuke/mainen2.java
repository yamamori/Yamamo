package every.kikuchi_kensuke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.DAY_OF_WEEK;
import static java.util.Calendar.SUNDAY;

public class mainen2 {
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
	
	public static void main(String[] args) {
		int caye=0;
		int camo=0;
		int cada = 1;
		
		try { // 入力ストリームの生成
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 caye = enterNumeric(br, "西暦を入力してください");
         camo = enterNumeric(br, "月を入力してください");

		} catch (IOException e) {
			System.out.println("Exception : " + e);
		}

		Calendar cal1 = Calendar.getInstance();
		
		cal1.set(caye, camo - 1, cada);
		int max_day = cal1.getActualMaximum(DAY_OF_MONTH);
		int day_youbi = cal1.get(DAY_OF_WEEK);

		String youbi[] = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

		System.out.printf("　～ %d年%2d月 ～　%n", 2012, 5);

		for (int youbi1 = 0; youbi1 <= 6; youbi1++) {
			if (youbi1 == 6) {
				System.out.printf("|%1$2s%n", youbi[youbi1]);
			} else {
				System.out.printf("|%1$2s", youbi[youbi1]);
			}
		}

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
		int[][] tab1 = new int[6][7];
		int hiniti = cada;
		mainen: for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 6; j++) {
				tab1[i][j] = hiniti;
				
				if (check == 6) {
					System.out.print(String.format("|%3d", hiniti) + "\n");
					check = -1;
				} else if (hiniti == max_day) {
					System.out.print(String.format("|%3d", hiniti));
					break mainen;
				} else {
					System.out.print(String.format("|%3d", hiniti));
				}
				hiniti++;
				check++;
			}
		}
	}
}
