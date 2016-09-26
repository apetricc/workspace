package inverseFactorial;

public class InverseFactorial {

	
	public static int doWork(int num) {
		int i = 2;
				int n = num;
				while (n != 1) {
				    n /= i;
				    i += 1;
				}
				return (i==1 ? i : null);
	}
	public static void main(String[] args) {
		System.out.println(doWork(120));
	}

}
