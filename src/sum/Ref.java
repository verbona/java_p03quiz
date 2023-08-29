package sum;

public class Ref {

	int sum;
	String res;
	
	
	public Ref(int sum, String res) {
		this.sum = sum;
		this.res = res;
		
	}
	
	public void mtd() {
		System.out.println("----------------------");
		System.out.println("입력 값의 누적");
		System.out.println(res + " = " + sum);
		
	}
}
