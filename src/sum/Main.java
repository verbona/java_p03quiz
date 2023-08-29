package sum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String num = null;
		int cnt = 1;
		int sum = 0; // 누적변수
		String res = "";

		// "2"+"3" 연결 23
		while (true) {
			System.out.print(cnt + ". 입력 : ");
			num = scanner.next();

			if (!(num.equals("x"))) {
				sum += Integer.parseInt(num);

				if (Integer.parseInt(num) < 0) {
					res += "(" + num + ")" + " + ";

				} else {
					res += num + " + ";

				}

			} else {
				String txt = res.substring(0, res.length() - 3);
				res = txt;
				break;
			}

			cnt++;
		}
		scanner.close();

		Ref ref = new Ref(sum, res);
		ref.mtd();
	}
}
