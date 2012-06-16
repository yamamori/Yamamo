package every.anji;

public class Hairetu {

	public static void main(String[] args) {

		int[][] kuku = new int[9][9];

		for (int x = 1; x <= 9; x++) {
			for (int y = 1; y <= 9; y++) {
				if (x * y < 10) {
					System.out.print("  ");
				} else {
					System.out.print(" ");
				}
				kuku[x-1][y-1] = x * y;
				System.out.print(kuku[x-1][y-1]);
			}
			System.out.println();
		}
	}

}
