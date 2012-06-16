package every.kikuchi_kensuke.janken;
import java.util.Random;

public class player {
 int janken(){
		// TODO : ランダムで、JankenTypeの、どれかを返すように修正してください。
	
		//Randomクラスのインスタンス化
        Random dasite = new Random();
        int kekka = dasite.nextInt(3)+1;
        return kekka;
			    
	}
}

