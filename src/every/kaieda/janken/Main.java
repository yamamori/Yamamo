package every.kaieda.janken;

public class Main {
	
	/**
	 * 【おまけ】
	 * finalを付けると、「変数：SHACHIKU」は、１回しか値を代入できなくなります。
	 * finalを付けた変数を初期化しおくと（１回の代入を行っておくと）、定数として扱うことができます。
	 * 
	 * staticは、絵を使った方が分かりやすいので、次回の講義で紹介しますね。
	 * */
	private static final String SHACHIKU = "社畜";

	/**
	 * 複数人でジャンケン
	 */
	public static void main(String[] args) {

		// sample : player を作る
		Player player_A = new Player();
		Player player_B = new Player();
		Player player_C = new Player();

		// sample : playerにジャンケンさせる
		for (int a = 1; a <= 100; a++) {
			JankenResults A_jankenResult = player_A.janken();
			JankenResults B_jankenResult = player_B.janken();
			JankenResults C_jankenResult = player_C.janken();

			System.out.println("ジャン・ケン・・・");
			System.out.println("ポン！！");
			System.out.println(SHACHIKU + " : " + A_jankenResult.name());
			System.out.println("うんこ上司 : " + B_jankenResult.name());
			System.out.println("うんこ社長 : " + C_jankenResult.name());

			// TODO : 最後の１人が勝つまで、ジャンケンは続きます。
			// TODO : 勝者を表示してください。
			int haiten = tokuten(A_jankenResult, B_jankenResult, C_jankenResult);

			if (haiten * a == 0) {
				System.out.println("あいこです・・・。");
				System.out.println("もう一回！");

			}
			if (haiten * a != 0) {
				if (haiten >= 1 && haiten <= 3) {
					System.out.println("勝者: " + SHACHIKU + "･･･マジ横澤空気読めないわ･･･");
					break;
				}
				if (haiten >= 4 && haiten <= 6) {
					System.out.println("勝者： " + "うんこ上司！！");
					break;
				}
				if (haiten >= 7 && haiten <= 9) {
					System.out.println("勝者： " + "うんこ社長！！");
					break;
				}
				if (haiten >= 10 && haiten <= 18) {
					if (haiten >= 10 && haiten <= 12) {
						System.out
								.println("うんこ上司とうんこ社長の勝利です！" + SHACHIKU + "の横澤給料なし！！めしうまｗｗｗｗｗｗｗｗｗ");
					}
					if (haiten >= 13 && haiten <= 15) {
						System.out.println(SHACHIKU + "とうんこ社長の勝利です！うんこ上司残念！");
					}
					if (haiten >= 16 && haiten <= 18) {
						System.out.println(SHACHIKU + "とうんこ上司の勝利です！うんこ社長残念！");
					}

					for (int b = 1; b <= 100; b++) {

						System.out.println("もう一回");
						System.out.println("ジャン・ケン・・・");

						// sample : player を作る
						AikoPlayer Aikoplayer_A = new AikoPlayer();
						AikoPlayer Aikoplayer_B = new AikoPlayer();
						AikoPlayer Aikoplayer_C = new AikoPlayer();

						// sample : playerにジャンケンさせる
						JankenResults AAiko_jankenResult = Aikoplayer_A
								.janken();
						JankenResults BAiko_jankenResult = Aikoplayer_B
								.janken();
						JankenResults CAiko_jankenResult = Aikoplayer_C
								.janken();

						int aikohaiten = aiko(AAiko_jankenResult,
								BAiko_jankenResult, CAiko_jankenResult, haiten);
						{

							System.out.println("ポン！！");
							if (haiten >= 10 && haiten <= 12) {
								// System.out.println("社畜 : " +
								// AAiko_jankenResult.name());
								System.out.println("うんこ上司 : "
										+ BAiko_jankenResult.name());
								System.out.println("うんこ社長 : "
										+ CAiko_jankenResult.name());
							}
							if (haiten >= 13 && haiten <= 15) {
								System.out.println(SHACHIKU + " : "
										+ AAiko_jankenResult.name());
								// System.out.println("うんこ上司 : " +
								// BAiko_jankenResult.name());
								System.out.println("うんこ社長 : "
										+ CAiko_jankenResult.name());

							}
							if (haiten >= 16 && haiten <= 18) {
								System.out.println(SHACHIKU + " : "
										+ AAiko_jankenResult.name());
								System.out.println("うんこ上司 : "
										+ BAiko_jankenResult.name());
								// System.out.println("うんこ社長 : " +
								// CAiko_jankenResult.name());
							}

							if (aikohaiten * b != 0) {
								if (aikohaiten == 20) {
									System.out.println("うんこ上司の勝利です！うんこ社長残念！");
								}
								if (aikohaiten == 21) {
									System.out.println("うんこ社長の勝利です！うんこ上司残念！");
								}
								if (aikohaiten == 22) {
									System.out.println("社畜の勝利！土下座！うんこ社長残念！");
								}
								if (aikohaiten == 23) {
									System.out
											.println("うんこ社長の勝利です！社畜の横澤給料なし！めしうまｗｗｗｗｗｗｗｗｗｗ");
								}
								if (aikohaiten == 24) {
									System.out.println("社畜の勝利！土下座！`うんこ上司残念！");
								}
								if (aikohaiten == 25) {
									System.out
											.println("うんこ上司の勝利です！社畜の横澤給料なし！めしうまｗｗｗｗｗｗｗｗｗｗ");
								}
								break;
							}
							if (aikohaiten * b == 0) {
								System.out.println("あいこ！");
							}
						}
					}
					break;
				}
			}
		}
	}

	private static int tokuten(JankenResults A_jankenResult,
			JankenResults B_jankenResult, JankenResults C_jankenResult) {
		// 1 一人勝ち　2二人勝ち　3あいこ

		if (A_jankenResult == B_jankenResult
				&& B_jankenResult == C_jankenResult) {
			return 0;
		}
		// A1
		if ((A_jankenResult == JankenResults.Paa)
				&& ((B_jankenResult == JankenResults.Goo) && (C_jankenResult == JankenResults.Goo))) {
			return 1; // A勝利
		}
		if ((A_jankenResult == JankenResults.Paa)
				&& ((B_jankenResult == JankenResults.Goo) && (C_jankenResult == JankenResults.Paa))) {
			return 13; // AC勝利
		}
		if ((A_jankenResult == JankenResults.Paa)
				&& ((B_jankenResult == JankenResults.Paa) && (C_jankenResult == JankenResults.Goo))) {
			return 16; // AB勝利
		}
		if ((A_jankenResult == JankenResults.Choki)
				&& ((B_jankenResult == JankenResults.Paa) && (C_jankenResult == JankenResults.Paa))) {
			return 1; // A勝利
		}
		if ((A_jankenResult == JankenResults.Choki)
				&& ((B_jankenResult == JankenResults.Goo) && (C_jankenResult == JankenResults.Choki))) {
			return 4; // B勝利
		}
		if ((A_jankenResult == JankenResults.Choki)
				&& ((B_jankenResult == JankenResults.Choki) && (C_jankenResult == JankenResults.Goo))) {
			return 7; // C勝利
		}
		if ((A_jankenResult == JankenResults.Goo)
				&& ((B_jankenResult == JankenResults.Choki) && (C_jankenResult == JankenResults.Choki))) {
			return 1; // A一人勝ち
		}
		if ((A_jankenResult == JankenResults.Goo)
				&& ((B_jankenResult == JankenResults.Paa) && (C_jankenResult == JankenResults.Goo))) {
			return 4; // B一人勝ち
		}
		if ((A_jankenResult == JankenResults.Goo)
				&& ((B_jankenResult == JankenResults.Goo) && (C_jankenResult == JankenResults.Paa))) {
			return 7; // C一人勝ち
		}
		// B1
		if ((B_jankenResult == JankenResults.Paa)
				&& ((A_jankenResult == JankenResults.Goo) && (C_jankenResult == JankenResults.Goo))) {
			return 4; // B勝利
		}
		if ((B_jankenResult == JankenResults.Paa)
				&& ((A_jankenResult == JankenResults.Goo) && (C_jankenResult == JankenResults.Paa))) {
			return 10; // BC勝利
		}
		if ((B_jankenResult == JankenResults.Paa)
				&& ((A_jankenResult == JankenResults.Paa) && (C_jankenResult == JankenResults.Goo))) {
			return 16; // AB勝利
		}
		if ((B_jankenResult == JankenResults.Choki)
				&& ((A_jankenResult == JankenResults.Paa) && (C_jankenResult == JankenResults.Paa))) {
			return 4; // B一人勝ち
		}
		if ((B_jankenResult == JankenResults.Choki)
				&& ((A_jankenResult == JankenResults.Paa) && (C_jankenResult == JankenResults.Choki))) {
			return 10; // BC勝利
		}
		if ((B_jankenResult == JankenResults.Choki)
				&& ((A_jankenResult == JankenResults.Choki) && (C_jankenResult == JankenResults.Paa))) {
			return 16; // AB勝利
		}
		if ((B_jankenResult == JankenResults.Goo)
				&& ((A_jankenResult == JankenResults.Choki) && (C_jankenResult == JankenResults.Choki))) {
			return 4; // B一人勝ち
		}
		if ((B_jankenResult == JankenResults.Goo)
				&& ((A_jankenResult == JankenResults.Choki) && (C_jankenResult == JankenResults.Goo))) {
			return 10; // BC勝利
		}
		if ((B_jankenResult == JankenResults.Goo)
				&& ((A_jankenResult == JankenResults.Goo) && (C_jankenResult == JankenResults.Choki))) {
			return 16; // AB勝利
		}
		// C1
		if ((C_jankenResult == JankenResults.Paa)
				&& ((B_jankenResult == JankenResults.Goo) && (A_jankenResult == JankenResults.Goo))) {
			return 7; // C一人勝ち
		}
		if ((C_jankenResult == JankenResults.Paa)
				&& ((B_jankenResult == JankenResults.Goo) && (A_jankenResult == JankenResults.Paa))) {
			return 14; // AC勝利
		}
		if ((C_jankenResult == JankenResults.Paa)
				&& ((B_jankenResult == JankenResults.Paa) && (A_jankenResult == JankenResults.Goo))) {
			return 10; // BC勝利
		}
		if ((C_jankenResult == JankenResults.Choki)
				&& ((B_jankenResult == JankenResults.Paa) && (A_jankenResult == JankenResults.Paa))) {
			return 7; // C一人勝ち
		}
		if ((C_jankenResult == JankenResults.Choki)
				&& ((B_jankenResult == JankenResults.Paa) && (A_jankenResult == JankenResults.Choki))) {
			return 14; // AC勝利
		}
		if ((C_jankenResult == JankenResults.Choki)
				&& ((B_jankenResult == JankenResults.Choki) && (A_jankenResult == JankenResults.Paa))) {
			return 10; // BC勝利
		}
		if ((C_jankenResult == JankenResults.Goo)
				&& ((B_jankenResult == JankenResults.Choki) && (A_jankenResult == JankenResults.Choki))) {
			return 7; // C一人勝ち
		}
		if ((C_jankenResult == JankenResults.Goo)
				&& ((B_jankenResult == JankenResults.Choki) && (A_jankenResult == JankenResults.Goo))) {
			return 14; // AC勝利
		}
		if ((C_jankenResult == JankenResults.Goo)
				&& ((B_jankenResult == JankenResults.Goo) && (A_jankenResult == JankenResults.Choki))) {
			return 10; // BC勝利
		}
		// A2
		if ((A_jankenResult == JankenResults.Goo)
				&& ((B_jankenResult == JankenResults.Paa) && (C_jankenResult == JankenResults.Paa))) {
			return 10; // BC勝利
		}
		if ((A_jankenResult == JankenResults.Paa)
				&& ((B_jankenResult == JankenResults.Choki) && (C_jankenResult == JankenResults.Paa))) {
			return 11;
		}
		if ((A_jankenResult == JankenResults.Choki)
				&& ((B_jankenResult == JankenResults.Paa) && (C_jankenResult == JankenResults.Paa))) {
			return 12;
		}
		// B2
		if ((B_jankenResult == JankenResults.Goo)
				&& ((A_jankenResult == JankenResults.Paa) && (C_jankenResult == JankenResults.Paa))) {
			return 13;
		}
		if ((B_jankenResult == JankenResults.Paa)
				&& ((A_jankenResult == JankenResults.Choki) && (C_jankenResult == JankenResults.Choki))) {
			return 14;
		}
		if ((B_jankenResult == JankenResults.Choki)
				&& ((A_jankenResult == JankenResults.Paa) && (C_jankenResult == JankenResults.Paa))) {
			return 15;
		}
		// C2
		if ((C_jankenResult == JankenResults.Goo)
				&& ((B_jankenResult == JankenResults.Paa) && (A_jankenResult == JankenResults.Paa))) {
			return 16;
		}
		if ((C_jankenResult == JankenResults.Paa)
				&& ((B_jankenResult == JankenResults.Choki) && (A_jankenResult == JankenResults.Choki))) {
			return 17;
		}
		if ((C_jankenResult == JankenResults.Choki)
				&& ((B_jankenResult == JankenResults.Paa) && (A_jankenResult == JankenResults.Paa))) {
			return 18;
		} else {
			return 0;
		}
	}

	private static int aiko(JankenResults AAiko_jankenResult,
			JankenResults BAiko_jankenResult, JankenResults CAiko_jankenResult,
			int haiten) {
		
		if (haiten >= 10 && haiten <= 12) {
			if (BAiko_jankenResult == CAiko_jankenResult) {
				return 0;
			}
			if (((BAiko_jankenResult == JankenResults.Choki) && (CAiko_jankenResult == JankenResults.Paa))
					|| ((BAiko_jankenResult == JankenResults.Paa) && (CAiko_jankenResult == JankenResults.Goo))
					|| ((BAiko_jankenResult == JankenResults.Choki) && (CAiko_jankenResult == JankenResults.Paa))) {
				return 20;
			} else {
				// if(((BAiko_jankenResult == JankenResults.Paa) &&
				// (CAiko_jankenResult == JankenResults.Choki))
				// || ((BAiko_jankenResult == JankenResults.Goo) &&
				// (CAiko_jankenResult == JankenResults.Choki))
				// || ((BAiko_jankenResult == JankenResults.Paa) &&
				// (CAiko_jankenResult == JankenResults.Goo)) ){
				return 21;
			}
		}
		if (haiten >= 13 && haiten <= 15) {
			if (AAiko_jankenResult == CAiko_jankenResult) {
				return 0;
			}
			if (((AAiko_jankenResult == JankenResults.Choki) && (CAiko_jankenResult == JankenResults.Paa))
					|| ((AAiko_jankenResult == JankenResults.Paa) && (CAiko_jankenResult == JankenResults.Goo))
					|| ((AAiko_jankenResult == JankenResults.Goo) && (CAiko_jankenResult == JankenResults.Choki))) {
				return 22;
			} else {
				// if(((BAiko_jankenResult == JankenResults.Paa) &&
				// (CAiko_jankenResult == JankenResults.Choki))
				// || ((BAiko_jankenResult == JankenResults.Goo) &&
				// (CAiko_jankenResult == JankenResults.Choki))
				// || ((BAiko_jankenResult == JankenResults.Paa) &&
				// (CAiko_jankenResult == JankenResults.Goo)) ){
				return 23;
			}
		} else {
			if (AAiko_jankenResult == BAiko_jankenResult) {
				return 0;
			}
			if (((AAiko_jankenResult == JankenResults.Choki) && (BAiko_jankenResult == JankenResults.Paa))
					|| ((AAiko_jankenResult == JankenResults.Paa) && (BAiko_jankenResult == JankenResults.Goo))
					|| ((AAiko_jankenResult == JankenResults.Goo) && (BAiko_jankenResult == JankenResults.Choki))) {
				return 24;
			} else {
				return 25;
			}
		}
	}
}
