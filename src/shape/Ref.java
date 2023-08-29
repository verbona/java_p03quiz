package shape;

public class Ref {
	
	int num;
	
	public Ref(int num) {
		this.num = num;
	}
	
	public void starShape() {
		
		System.out.println();
		for (int i=1; i<=num; i++) {
		
		for (int j= 0; j<=num; j++) {
			System.out.print(" * ");
			
			
		}
		
		System.out.println();
		}

		System.out.println("\n\nEnd");
	}

}
