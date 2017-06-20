public class Prime {
	public static void primeGenerator(int n) {
		int count = 0;
	
		for (int i = 2; i <= n ; i++) {
			for (int j = 2; j <= i - 1; j++) {
				if (i % j == 0) {
					count = count + 1;
				}
			}
			if (count== 0) {
				System.out.print(" "+i);
				System.out.println("hi");
			} else {
				count = 0;
			}

		}
	}
	public static void main(String[] args) {
		
		primeGenerator(100);
	}
}
