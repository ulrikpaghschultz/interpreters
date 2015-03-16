package ast;

import java.util.ArrayList;
import java.util.List;

import run.Env;

public class Seq extends Statement {
	private List<Statement> body = new ArrayList<Statement>();
	@Override
	public void eval(Program prog, Env env) {
		int i = 0;
		while(i<body.size()) {
			body.get(i).eval(prog,env);
			i = i + 1;
		}
	}
	public void addStatement(Statement s) {
		body.add(s);
	}
	
}
