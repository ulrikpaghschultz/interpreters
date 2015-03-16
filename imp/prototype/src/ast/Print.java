package ast;

import run.Env;
import run.Value;

public class Print extends Statement {
	private String string;
	private Exp exp;
	public Print(String _string, Exp _exp) {
		string = _string; exp = _exp;
	}
	@Override
	public void eval(Program prog, Env env) {
		Value v = exp.eval(env);
		System.out.println(string+v.val());
	}

}
