
public class Second {
	public static void main(String[] args) {
		System.out.println("2nd version");
		Math cMath = new Math();
		System.out.println(cMath.add(1, 2));
	}
}

class Math {
	int add(int a, int b) {
		return a + b;
	}
}
