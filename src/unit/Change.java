package unit;


public class Change {

	// 필드 - 클래스변수 = 멤버변수
	// 메서드에서 사용할 데이터를 변수로 만들어 둔다.
	int code;
	int kilo;
	int mile;

	// 디폴트 생성자 = 매개변수가 없는 생성자, 자동생성

	public Change(int code, int kilo, int mile) {
		this.code = code;
		this.kilo = kilo;
		this.mile = mile;

	}

	// 메서드
	public void mtd() {

		System.out.println("------------------------");
		if (code == 1) {

			double mile = kilo * 0.621371;

			System.out.printf("%d Km = %.2f mile", kilo, mile);

		} else if (code == 2) {

			System.out.println("---------------------------");

			double kilo = mile * 1.609344;

			System.out.printf("%d mile = %.2f Km", mile, kilo);
		}

	}

}
