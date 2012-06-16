package sample.car;

public class Car {

	private int windowCnt = 2;
	private int tireCnt = 4;
	private int num;
	private int gas;
	
	void enterGas(int value){
		this.gas = value;
	}
	
	void showStatus(){
		System.out.println("------------");
		System.out.println("この車の情報だよ");
		show();
	}
	private void show(){
		System.out.println("ナンバー：" + num);
		System.out.println("ガソリン：" + gas);
	}

	public void setNum(int num) {
		this.num = num;
	}
	public void setGas(int gas) {
		this.gas = gas;
	}

	public int getWindowCnt() {
		return windowCnt;
	}
	public int getTireCnt() {
		return tireCnt;
	}
}
