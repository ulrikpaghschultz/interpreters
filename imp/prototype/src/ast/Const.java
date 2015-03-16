package ast;

import run.Env;
import run.Value;

public class Const extends Exp {
	private int value;
	public Const(int _value) { this.value = _value; }
	@Override
	public Value eval(Env env) {
		return new Value(value);
	}

}
