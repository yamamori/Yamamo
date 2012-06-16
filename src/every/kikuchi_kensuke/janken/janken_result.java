package every.kikuchi_kensuke.janken;

public class janken_result {
	static int janken_kekka(int a,int b,int c){
		int kekka_haisha1=0;
		if(c==b&&b-a==1||c==b&&a==3&&b==1){
			System.out.println("+-----------------------------------+");
			System.out.println("+　　　　　　　　　　　　　Aさんは負け　　　　　　　　　　 +");
			System.out.println("+-----------------------------------+");
			kekka_haisha1=1;
		}else if(a==c&&a-b==1||c==b&&a==3&&b==1){
			System.out.println("+-----------------------------------+");
			System.out.println("+　　　　　　　　　　　　　Bさんは負け　　　　　　　　　　 +");
			System.out.println("+-----------------------------------+");
			kekka_haisha1=2;
		}else if(a==b&&a-c==1||a==b&&a==3&&b==1) {
			System.out.println("+-----------------------------------+");
			System.out.println("+　　　　　　　　　　　　　Cさんは負け　　　　　　　　　　 +");
			System.out.println("+-----------------------------------+");
			kekka_haisha1=3;
		}
		return kekka_haisha1;
	}
	static int janken_haisha(int a,int b,int c){
		int kekka_haisha2=0;
		if(c==b&&b-a==1||c==b&&a==3&&b==1){
			kekka_haisha2=1;
		}else if(a==c&&a-b==1||c==b&&a==3&&b==1){
			kekka_haisha2=2;
		}else{
			kekka_haisha2=3;
		}
		return kekka_haisha2;
		
	}
}

