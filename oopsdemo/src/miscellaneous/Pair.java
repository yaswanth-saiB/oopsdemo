package miscellaneous;

//Generic class with 2 parameters
public class Pair<T,U> {

	private T first;
	private U second;
	
	public Pair() {
		this.first=null;
		this.second = null;
	}
	public Pair(T first, U second) {
		this.first = first;
		this.second = second;
	}

	
	public void setFirst(T first) {
		this.first = first;
	}
	public void setSecond(U second) {
		this.second = second;
	}
	public T getFirst() {
		return first;
	}


	public U getSecond() {
		return second;
	}

	
}
