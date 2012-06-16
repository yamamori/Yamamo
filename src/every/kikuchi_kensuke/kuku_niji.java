package every.kikuchi_kensuke;
public class kuku_niji {
	
	/**
	 * インデントが間違ってますが、２次元配列はマスターしたみたいですね。すごいです。
	 * また、String.formatを使ったりしていて、調査力も高いですね。
	 * */
	public static void main(String[] args) {
		int kuku[][] = new int[9][9];
		int i, j;
		for (i = 0; i <= 8; i++) {
			for (j = 0; j <= 8; j++) {
				kuku[i][j] = (i + 1) * (j + 1);
					/** 
					 * ここは、"\n"の違いしかないですので、
					 * if内は、「"\n"」だけでしたら、２００点でしたね。
					 * */
					if(j==8){
					System.out.print(String.format("|%3d", kuku[i][j])+"\n");
					}else{

						System.out.print(String.format("|%3d", kuku[i][j]));

					}
				
			}
		}
	}
}
