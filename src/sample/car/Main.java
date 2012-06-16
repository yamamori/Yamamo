package sample.car;

public class Main {

	public static void main(String[] args) {
		
		Car car_A = new Car();
		car_A.setNum(1234);
		car_A.setGas(0);
		
		car_A.showStatus();
		
		car_A.enterGas(100);
		car_A.showStatus();
	}
}
