package sample.janken;

public class Main {

	/**
	 * 複数人でジャンケン
	 */
	public static void main(String[] args) {
		System.out.println("ジャン・ケン・・・");
		
		// sample : player を作る
		Player player_A = new Player();
		Player player_B = new Player();
		Player player_C = new Player();
		
		// sample : playerにジャンケンさせる
		JankenResults A_jankenResult = player_A.janken();
		JankenResults B_jankenResult = player_B.janken();
		JankenResults C_jankenResult = player_C.janken();
		
		System.out.println("ポン！！");
		System.out.println("Aさん : " + A_jankenResult.name());
		System.out.println("Bさん : " + B_jankenResult.name());
		System.out.println("Cさん : " + C_jankenResult.name());
		
		// TODO : 最後の１人が勝つまで、ジャンケンは続きます。
		// TODO : 勝者を表示してください。
	}

}
