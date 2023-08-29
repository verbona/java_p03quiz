package unit;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.println("객체사용");

		Scanner scanner = new Scanner(System.in);
		System.out.print("입력선택(1. 킬로미터 2. 마일) : ");
		int code = scanner.nextInt();
		int kilo=0;
		int mile=0;
		
		if (code == 1) {
			System.out.print("킬로미터입력(Km) : ");
			kilo = scanner.nextInt();


		} else if (code == 2) {
			System.out.print("마일입력(mile) : ");
			  mile = scanner.nextInt();

		}
		

		Change change = new Change(code, kilo, mile);
		
		change.mtd();

		scanner.close();

	}

}
