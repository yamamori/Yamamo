package every.kaieda;
public class ichikarahyaku {

	/**
	 * 完璧ですね。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		for(int i = 1;i <= 100;i++){
			/**
			 * 余談ですが・・・
			 * sum += i
			 * という書き方もできます。
			 * */
			sum = sum + i;
			System.out.println(sum);
		}
	}

}
