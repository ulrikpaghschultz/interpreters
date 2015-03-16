package run;

public class Binding {
	private String name;
	private Value value;
	public Binding(String _name, Value _value) {
		this.name = _name; this.value = _value;
	}
	public Value getValue() {
		return value;
	}
	public String getName() {
		return name;
	}
	public void setValue(Value v) {
		this.value = v;
	}
}
