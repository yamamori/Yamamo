package every.anji;

public class sosu {

	public static void main(String args[]){
	   
		int n = 2;
	    int m = 2000;
	
	while(n <= m){                            //範囲指定（2～２０００まで）
	   boolean sosu = true;                   //trueにしておいて下の計算を行い、素数ではなかったらfalse
           for (int i = 1; i < n; i++){    //2,3,4...n-1まで割っていく。
        	   if (i <= 1){                   //iが1以下だとforに戻る。
        		   continue;
        	   }
        	   if (n % i == 0){                  //割り切れたら素数ではないから処理を中断。
		            sosu = false;
		            break;
	            }
	       }
        
        
       if (sosu){                             //素数だったら表示する。
    	   System.out.println(n);
       }
       else{                                  //素数ではなかったら表示しない。
    	   
       }
	n++;                                      //n+1を行い、２０００までwhile内をループ。
	}
	}       
}   
