
public class SaveBox {
	int coinAmount = 0;
//	private int coinAmount = 0;
	
	public void deposit(int inputCoins) {
		coinAmount = coinAmount + inputCoins;
		// coinAmount -> SaveBox 내의 변수
		// inputCoins -> 인풋 파라미터
	}
	
	public void deposit(int coinAmount) {	// 클래스의 전역 변수명과 같은 지역 변수명을 인풋 파라미터로 사용하면 경우 문제가 된다. 데이터 변수를 본리해서 사용하는 방법.
		this.coinAmount = this.coinAmount + coinAmount;	// this.를 붙이면 괄호 밖으로 접근한다.
		// this.coinAmount 와 메소드 바깥의 coinAmount -> SaveBox 내의 변수
		// 메소드 내의 coinAmount -> 인풋 파라미터
	}
	
	
	
	
	
	public void withdraw() {
		System.out.println("모든 금액의 합계는 " + coinAmount + "입니다.");
		
	}
	
	//setter라 부름.
	public void setCoingAmount(int newAmount) {
		coinAmount = newAmount;
	}
	
	//getter라 부름.
	public int getCoinAmount() {
		return coinAmount;
	}
	
	// 왜 사용할까? setter getter라는 개념은 객체 내부의 데이터를 외부에서 접근 못하게 한다는 개념으로 인해 생겨났다.
	// 데이터에 직접 접근하지 말고 메소드를 통해 접근하라는 뜻.
	// 데이터가 2개면 setter getter도 2개씩(총 4개), 데이터가 3개면 setter getter도 3개씩(총 6개)
	// 근데 자바에서는 
	
	

}
