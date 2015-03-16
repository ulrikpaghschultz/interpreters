package ast;

import run.Env;

public class Assign extends Statement {
	private String lhs;
	private Exp rhs;
	
	@Override
	public void eval(Program prog, Env env) {
		env.bind(lhs,rhs.eval(env));
	}

}
