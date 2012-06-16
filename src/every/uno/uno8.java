package every.uno;

import java.util.Random;

public class uno8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// じゃんけん開始

		int a = 0;
		int b = 0;
		int c = (a + 1) % 3;

		// Aさんの
		Random r = new Random();
		a = r.nextInt(3);
		if (a == 0) {
			System.out.println("Aさん：グー");
		} else if (a == 1) {
			System.out.println("Aさん：チョキ");
		} else {
			System.out.println("Aさん：パー");
		}

		// Bさんの手
		b = r.nextInt(3);
		if (b == 0) {
			System.out.println("Bさん：グー");
		} else if (b == 1) {
			System.out.println("Bさん:チョキ");
		} else {
			System.out.println("Bさん：パー");
		}

		// じゃんけん判定
		if (a == b) {
			System.out.println("あいこ");
		} else if (b == c) {
			System.out.println("Aの勝ち");
		} else {
			System.out.println("Bの勝ち");
		}
	}
}
