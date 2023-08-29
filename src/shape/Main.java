package shape;

import java.util.Scanner;

public class Main {
	
 

	public static void main(String[] args) {
		System.out.println("객체 사용");

		Scanner scanner = new Scanner(System.in);

		int num = 0;
		while(true) {

			System.out.print("숫자를 입력해 주새요 (1~10) : ");
			num = scanner.nextInt();
			if (num >= 1 && num <= 10) {
				break;
			} else {
				System.out.println("1이상 10이하 정수만 가능");
				System.out.print("\n재실행");

			}

		}
	

		scanner.close();
		
		Ref ref = new Ref(num);
		ref.starShape();
	
		
		

	}

}
