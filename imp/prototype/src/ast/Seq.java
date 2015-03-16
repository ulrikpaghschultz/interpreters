package ast;

import java.util.List;

import run.Env;

public class Seq extends Statement {
	private List<Statement> body;
	@Override
	public void eval(Program prog, Env env) {
		int index = 0;
		while(index<body.size()) {
			body.get(index).eval(prog,env);
			index = index + 1;
		}
	}
	
}
