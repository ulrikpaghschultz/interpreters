package ast;

import run.Env;

public class Assign extends Statement {
	private String lhs;
	private Exp rhs;
	
	public Assign(String _lhs, Exp _rhs) {
		this.lhs = _lhs; this.rhs = _rhs;
	}

	@Override
	public void eval(Program prog, Env env) {
		env.bind(lhs,rhs.eval(env));
	}

}
