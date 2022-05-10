package basics;

public class OddEvenDisplay {
	public static void main(String[] args) {
		System.out.println("ODD\tEVEN");
		System.out.println("---\t-----");
		int i = 1;
		while(i <= 10) {
			if(i % 2 == 0) {
				System.out.print(" \t"+i);
				System.out.println();
				
			}else {
				System.out.print(" "+i);
			}i++;
		}
	}
}
