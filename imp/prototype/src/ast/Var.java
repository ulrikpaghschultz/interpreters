package ast;

import run.Env;
import run.Value;

public class Var extends Exp {
	private String name;
	public Var(String _name) { name = _name; }
	@Override
	public Value eval(Env env) {
		return env.lookup(name);
	}

}
