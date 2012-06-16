package every.kaieda.janken;

import java.util.Random;


public class AikoPlayer {
	
	AikoPlayer(){
		
	}
	
	JankenResults janken(){
		 // TODO : ランダムで、JankenTypeの、どれかを返すように修正してください。
		        
		Random rndjanken = new Random();
		
			int r = rndjanken.nextInt(3);
			

			if(r == 0){
				return JankenResults.Choki;
			}
			if(r == 1){
				return JankenResults.Goo;
		    }
			if(r == 2){
				return JankenResults.Paa;
			}
			else{
				return JankenResults.Choki;
			}
	
	}
}
