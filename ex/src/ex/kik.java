package ex;

public class kik {
	public static void main(String[] args) {
		int s = 0;
		for (int i = 1; i <= 25; i++) {
			System.out.print(i + " ");
			s++;
			if(s% 5==0) {
				System.out.println();
			}
		}
	}
}
