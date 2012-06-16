package every.kikuchi_kensuke.janken;

public class dasite{
	static String dasite_hantei(int te){
		// メソッド化可能
		String te_kekka;
		if (te == 3) {
			te_kekka="Goo";
		} else if (te == 2) {
			te_kekka="Choki";
		} else if(te==1){
			te_kekka="Paa";
		}else{
			te_kekka="";
		}
		return te_kekka; 
	}
}
