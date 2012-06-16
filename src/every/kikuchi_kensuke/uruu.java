package every.kikuchi_kensuke;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class uruu {
	
	private static int enterNumeric(BufferedReader br, String message)
			throws IOException {
		while (true) {
			System.out.println(message);
			String str = br.readLine();

			// validation
			if (str == null || str.equals("")) {
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
		int caye = 0;
		try { // 入力ストリームの生成
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			caye = enterNumeric(br, "西暦を入力してください");

		} catch (IOException e) {
			System.out.println("Exception : " + e);
		}
		cheak_uruu(caye);
	}

	public static void cheak_uruu(int y) {
		int urudoshi = y;

		if (urudoshi % 4 == 0 && !(urudoshi % 100 == 0) || urudoshi % 400 == 0) {
			System.out.print("その年はうるう年だよ");
		} else {
			System.out.print("その年はうるう年じゃないよ");
		}
	}
}
