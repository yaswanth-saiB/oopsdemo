package oopsdemo2;

public class OverloadDemo {

	public static void main(String[] args) {
		Addition a1 = new Addition();
		
		a1.add();
		a1.add(20, 300);
		a1.add("hii", "yash");
		a1.add(37.3f, 43.1f);

	}

}
