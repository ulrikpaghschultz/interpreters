package ast;

import java.util.List;

import run.Env;

public class Call extends Statement {
	private String name;
	private List<Exp> arguments;
	
	@Override
	public void eval(Program prog, Env env) {
		Procedure proc = prog.lookup(name);
		List<String> params = proc.getParameters();
		Env env2 = new Env(env);
		int index = 0;
		while(index<arguments.size())
			env2.bind(params.get(index), arguments.get(index).eval(env));
		proc.getBody().eval(prog,env2);
	}

}
