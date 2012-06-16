package every.yokosawa;
import java.util.Scanner;
import java.util.Calendar;

public class mannen {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		
		Scanner y = new Scanner(System.in);
		System.out.println("年号を入力してください");
		int year = y.nextInt();
		
		Scanner mo = new Scanner(System.in);
		System.out.println("月を入力してください");
		int month = mo.nextInt();
		if(month <= 0 || month>12){
			System.out.println(month+"月なんてねーよ！調子のんなハゲ！");
			return;
		}
		
		calendar.set(year, month-1, 1, 0, 00, 01);

		int[] monthlist = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (year % 4 == 0 && year % 400 ==0) {
			monthlist[2] = 29;
		}
		//うるう年の時は、2月を29日間にする！ただし、400年に1度のうるう年にならない日は除く！

		int matrix[][] = new int[6][7];
		//カレンダーの升目を用意する！縦６、横７の４２マス

		int c = 1;
		int b = calendar.get(Calendar.DAY_OF_WEEK)-1;
		for (int a = 0; a <= 5; a++) {
			while (b <= 6) {
				if (c <= monthlist[calendar.get(Calendar.MONTH)]) {
					matrix[a][b] = c;
					c += 1;
					b += 1;
				}else break;
			}
			b = 0;
		}
		//参照する月の１日の曜日によって、先ほど用意した二次元配列matrixに文字を入力していく。
		//日曜日ならば[0][0]から、月曜日なら[0][1]から、土曜日なら[0][6]から。
		
		

		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		for (int n = 0; n <= 5; n++) {
			for (int m = 0; m <= 5; m++) {
				if (matrix[n][m] <= 9 && matrix[n][m] != 0) {
					System.out.print("│  " + matrix[n][m]);
				} else if (matrix[n][m] != 0) {
					System.out.print("│ " + matrix[n][m]);
				} else {
					System.out.print("│   ");
				}
			}
			if (matrix[n][6] <= 9 && matrix[n][6] != 0) {
				System.out.println("│  " + matrix[n][6] + "│");
			} else if (matrix[n][6] != 0) {
				System.out.println("│ " + matrix[n][6] + "│");
			} else {
				System.out.println("│   │");
			}
		}
	}
}
		//数字が一桁ならスペース２個、１個ならスペース一個とかをつっこみつつ二次元配列matrixを表示していく
