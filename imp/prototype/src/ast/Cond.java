package ast;

import run.Env;

public class Cond extends Statement {
	private Exp condition;
	private Statement thenBranch, elseBranch;
	
	@Override
	public void eval(Program prog, Env env) {
		if(condition.eval(env).val()==0)
			elseBranch.eval(prog,env);
		else
			thenBranch.eval(prog,env);
	}

}
