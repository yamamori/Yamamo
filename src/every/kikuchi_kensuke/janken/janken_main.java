package every.kikuchi_kensuke.janken;

public class janken_main {
	public static void main(String[] args) {

		System.out.println("+-----------------------------------+");
		System.out.println("+　　　　　　　　　　　ジャンケン・・・・　     　　  　　　　　 +");
		System.out.println("+-----------------------------------+");

		int kekka_haisha = 0;
		int counter = 1;
		int janken_end = 0;
		int Ajanken = 1;
		int Bjanken = 1;
		int Cjanken = 1;

		while (janken_end == 0) {

			System.out.println("+-----------------------------------+");
			System.out.println("+　　　　　　　　　　　　　　" + counter
					+ "回目　　　　　　  　　　　　　+");
			System.out.println("+-----------------------------------+");

			String Mr_A = "なし";
			String Mr_B = "なし";
			String Mr_C = "なし";
			// メソッド化
			if (kekka_haisha == 1) {
				player player_B = new player();
				player player_C = new player();
				Bjanken = player_B.janken();
				Cjanken = player_C.janken();

				Mr_B = dasite.dasite_hantei(Bjanken);
				Mr_C = dasite.dasite_hantei(Cjanken);
				Ajanken = 0;
			} else if (kekka_haisha == 2) {
				player player_A = new player();
				player player_C = new player();
				Ajanken = player_A.janken();
				Cjanken = player_C.janken();

				Mr_A = dasite.dasite_hantei(Ajanken);
				Mr_C = dasite.dasite_hantei(Cjanken);
				Bjanken = 0;
			} else if (kekka_haisha == 3) {
				player player_A = new player();
				player player_B = new player();
				Ajanken = player_A.janken();
				Bjanken = player_B.janken();

				Mr_A = dasite.dasite_hantei(Ajanken);
				Mr_B = dasite.dasite_hantei(Bjanken);
				Cjanken = 0;
			} else {
				player player_A = new player();
				player player_B = new player();
				player player_C = new player();
				Ajanken = player_A.janken();
				Bjanken = player_B.janken();
				Cjanken = player_C.janken();

				Mr_A = dasite.dasite_hantei(Ajanken);
				Mr_B = dasite.dasite_hantei(Bjanken);
				Mr_C = dasite.dasite_hantei(Cjanken);

			}
			if (Ajanken == 0 || Bjanken == 0 || Cjanken == 0) {
				if (Ajanken == 0) {

					System.out.println("ポン！！");
					System.out.println("Bさんは:" + Mr_B);
					System.out.println("Cさんは:" + Mr_C);
					if (Bjanken - Cjanken==1 || Bjanken == 1 && Cjanken == 3) {
						System.out
								.println("+-----------------------------------+");
						System.out.println("+　　　　　　　　　　　　　Bさんの勝利　　　　　　　　　　 +");
						System.out
								.println("+-----------------------------------+");
						janken_end = 1;
					} else if (Cjanken - Bjanken==1 || Cjanken == 1
							&& Bjanken == 3) {
						System.out
								.println("+-----------------------------------+");
						System.out.println("+　　　　　　　　　　　　　Cさんの勝利　　　　　　　　　　 +");
						System.out
								.println("+-----------------------------------+");
						janken_end = 1;
					} else {
						System.out
								.println("+-----------------------------------+");
						System.out.println("+　　　　　　　　　　　　　　あいこ！！　　　　  　　　　　 +");
						System.out
								.println("+-----------------------------------+");
						counter++;
						kekka_haisha = 1;
					}
				} else if (Bjanken == 0) {
					System.out.println("ポン！！");
					System.out.println("Aさんは:" + Mr_A);
					System.out.println("Cさんは:" + Mr_C);

					if (Ajanken - Cjanken==1 || Ajanken == 1 && Cjanken == 3) {
						System.out
								.println("+-----------------------------------+");
						System.out.println("+　　　　　　　　　　　　　Aさんの勝利　　　　　　　　　　 +");
						System.out
								.println("+-----------------------------------+");
						janken_end = 1;
					} else if (Cjanken - Ajanken==1 || Cjanken == 1
							&& Ajanken == 3) {
						System.out
								.println("+-----------------------------------+");
						System.out.println("+　　　　　　　　　　　　　Cさんの勝利　　　　　　　　　　 +");
						System.out
								.println("+-----------------------------------+");
						janken_end = 1;
					} else {
						System.out
								.println("+-----------------------------------+");
						System.out.println("+　　　　　　　　　　　　　　あいこ！！　　　　  　　　　　 +");
						System.out
								.println("+-----------------------------------+");
						counter++;
						kekka_haisha = 2;
					}
				} else {
					System.out.println("ポン！！");
					System.out.println("Aさんは:" + Mr_A);
					System.out.println("Bさんは:" + Mr_B);
					if (Ajanken - Bjanken==1 || Ajanken == 1 && Bjanken == 3) {
						System.out
								.println("+-----------------------------------+");
						System.out.println("+　　　　　　　　　　　　　Aさんの勝利　　　　　　　　　　 +");
						System.out
								.println("+-----------------------------------+");
						janken_end = 1;
					} else if (Bjanken - Ajanken==1 || Bjanken == 1
							&& Ajanken == 3) {
						System.out
								.println("+-----------------------------------+");
						System.out.println("+　　　　　　　　　　　　　Bさんの勝利　　　　　　　　　　 +");
						System.out
								.println("+-----------------------------------+");
						janken_end = 1;
					} else {
						System.out
								.println("+-----------------------------------+");
						System.out.println("+　　　　　　　　　　　　　　あいこ！！　　　　  　　　　　 +");
						System.out
								.println("+-----------------------------------+");
						counter++;
						kekka_haisha = 1;
					}
				}

			} else {
				System.out.println("ポン！！");
				System.out.println("Aさんは:" + Mr_A);
				System.out.println("Bさんは:" + Mr_B);
				System.out.println("Cさんは:" + Mr_C);

				if (Bjanken == Cjanken && Ajanken - Bjanken == 1
						|| Ajanken == 1 && Bjanken == 3 && Bjanken == Cjanken) {

					System.out.println("+-----------------------------------+");
					System.out.println("+　　　　　　　　　　　　　Aさんの勝利　　　　　　　　　　 +");
					System.out.println("+-----------------------------------+");
					janken_end = 1;
				} else if (Ajanken == Cjanken && Bjanken - Ajanken == 1
						|| Bjanken == 1 && Ajanken == 3 && Cjanken == Ajanken) {
					System.out.println("+-----------------------------------+");
					System.out.println("+　　　　　　　　　　　　　Bさんの勝利　　　　　　　　　　 +");
					System.out.println("+-----------------------------------+");
					janken_end = 1;

				} else if (Bjanken == Ajanken && Cjanken - Bjanken == 1
						|| Cjanken == 1 && Bjanken == 3 && Bjanken == Ajanken) {

					System.out.println("+-----------------------------------+");
					System.out.println("+　　　　　　　　　　　　　Cさんの勝利　　　　　　　　　　 +");
					System.out.println("+-----------------------------------+");
					janken_end = 1;

				} else if (Ajanken != Bjanken && Bjanken != Cjanken
						&& Cjanken != Ajanken || Ajanken == Bjanken
						&& Ajanken == Cjanken) {

					System.out.println("+-----------------------------------+");
					System.out.println("+　　　　　　　　　　　　　　あいこ！！　　　　  　　　　　 +");
					System.out.println("+-----------------------------------+");

					counter++;
				} else {
					janken_result.janken_kekka(Ajanken, Bjanken, Cjanken);
					kekka_haisha = janken_result.janken_haisha(Ajanken,
							Bjanken, Cjanken);
					counter++;
				}
			}
		}
	}

}
