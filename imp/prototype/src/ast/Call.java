package ast;

import java.util.ArrayList;
import java.util.List;

import run.Env;
import run.Value;

public class Call extends Statement {
	private String name;
	private List<Exp> arguments = new ArrayList<Exp>();
	private String lhs;
	
	public Call(String _lhs, String _name) {
		lhs = _lhs; name = _name;
	}

	@Override
	public void eval(Program prog, Env env) {
		Procedure proc = prog.lookup(name);
		List<String> params = proc.getParameters();
		Env env2 = new Env(env);
		int i = 0;
		while(i<arguments.size()) {
			env2.bind(params.get(i), arguments.get(i).eval(env));
			i++;
		}
		proc.getBody().eval(prog,env2);
		Value maybe = env2.lookup(name);
		if(maybe==null) maybe = new Value(0);
		env.bind(lhs, maybe);
	}

	public void addArgument(Exp exp) {
		arguments.add(exp);
	}

}
