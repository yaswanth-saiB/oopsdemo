package miscellaneous;

public class StringDemo {

	private String firstString = "This is a new String";
    private String secondString = "This is a new String";
    private String concatString;
    private String replacedString;
 
    private boolean equal;
    
    void test() {
        equal = firstString.equals(secondString);
        concatString = "The appendage will come behind me "
                      .concat(secondString);
        replacedString = firstString.replace('i', 'z');
    }
 

    void print() {
 
        System.out.println("The concatenated value: " + concatString);
        System.out.println("Replacing i's with z's: " + replacedString);
 
        if (equal) {
             System.out.println("The two strings are equal");
        } else {
             System.out.println("The strings are not equal");
        }
    }
	public static void main(String[] args) {
		StringDemo s=new StringDemo();
        s.test();
        s.print();
	}

}
