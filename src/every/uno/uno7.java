package every.uno;

public class uno7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 9; i++) {
			   for (int j = 1; j <= 9; j++) {
			    if (i*j < 10)
			     System.out.print("  ");
			    else
			     System.out.print(" ");
			    System.out.print(i*j);
			   }
			   System.out.println();
        }
	}
}
