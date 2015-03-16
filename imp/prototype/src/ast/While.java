package ast;

import run.Env;

public class While extends Statement {
	private Exp condition;
	private Statement body;
	
	public While(Exp exp, Statement stmt) {
		condition = exp; body = stmt;
	}

	@Override
	public void eval(Program prog, Env env) {
		while(condition.eval(env).val()!=0) {
			body.eval(prog,env);
		}
	}

}
