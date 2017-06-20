public class Prime {
	public static void primeGenerator(int n) {
		int c = 0;
	
		for (int i = 2; i <= n ; i++) {
			for (int j = 2; j <= i - 1; j++) {
				if (i % j == 0) {
					c = c + 1;
				}
			}
			if (c== 0) {
				System.out.print(" "+i);
				System.out.println("hi");
			} else {
				c = 0;
			}

		}
	}
	public static void main(String[] args) {
		
		primeGenerator(100);
	}
}
