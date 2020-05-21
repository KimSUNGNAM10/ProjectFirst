package DDAO;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 20;
		if (v1 > 13) {
			int v2 = v1 - 10;
			int v3 = v1 + v2 + 5;
			System.out.println(v3);
		}
	}
}
