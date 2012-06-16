package every.yokosawa;

public class hanoi {
	static int disk = 3;
	static int count = 0;

	public static void main(String arg[]) {
		move('A', 'B', 'C', disk);
	}

	static void move(char a, char b, char c, int n) {
		if (n == 0) {
			return;
		} else {
			move(a, c, b, n - 1);
			count++;
			System.out.println(count + "回目　" + a + "から" + b + "へ動かしました");
			move(c, b, a, n - 1);
		}
	}

}