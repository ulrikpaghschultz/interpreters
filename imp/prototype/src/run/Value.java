package run;

public class Value {
	private int val;
	public Value(int value) {
		this.val = value;
	}
	public int val() {
		return val;
	}
	public String toString() {
		return Integer.toString(val);
	}
}
