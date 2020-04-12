import java.util.Scanner;

public class RunClass {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// 초기정보.
//		Box box = new Box();				// 생성자 1.에 걸린다.
//		Box box = new Box(5000);			// 생성자 2.에 걸린다.
		Box box = new Box(5000,"보너스");		// 생성자 3.에 걸린다.
			
		for (int i = 0; i < 999999; i++) {
			System.out.println("원하는 기능을 입력하세요. 1) 저금할 액수 입력, 2) 메세지 + 저금액수, -1) 종료");
			int selectMenu = scanner.nextInt();
			scanner.nextLine();		// nextInt() return 소거용.
			
			// try catch는 전체를 묶기 보다는 오류 발생할만한 부분마다 넣어주면 각각의 오류를 잡을 수 있어서 더 좋다.
			try {
				// 실행 1.
				if (selectMenu == 1) {	// 조건 1.실행
					// 금액
					System.out.println("저금할 금액을 입력해주세요.");
					int amount = scanner.nextInt();
					scanner.nextLine(); // nextInt() return 소거용.
					
					box.deposit(amount);
					
					
				// 실행 2.	
				} else if (selectMenu == 2) {	// 조건 2.실행
					// 메세지 + 금액
					System.out.println("메세지를 입력해주세요.");
					String message = scanner.nextLine();
					
					System.out.println("저금할 금액을 입력해주세요.");
					int amount = scanner.nextInt();
					scanner.nextLine(); // nextInt() return 소거용.
					
					box.deposit(amount, message);
					
				} else if (selectMenu == -1) {	// 조건 -1.실행
					break;
				}
				
			} catch (Exception e) {
				System.out.println("1, 2, -1 값만 입력해주세요.");
				
			}

			
		}

		
	}

}
