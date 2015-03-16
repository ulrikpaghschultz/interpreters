package ast;

import java.util.ArrayList;
import java.util.List;

import run.Env;

public class Program {
	private List<Procedure> procedures = new ArrayList<Procedure>();

	public Procedure lookup(String name) {
		int i = 0;
		Procedure result = null;
		while(i<procedures.size()) {
			Procedure p = procedures.get(i);
			if(name.equals(p.getName())) result = p;
			i++;
		}
		if(result==null) throw new Error("Unable to find method "+name);
		return result;
	}

	public void addProcedure(Procedure p) {
		procedures.add(p);
	}

	public void eval(Env env) {
		lookup("main").getBody().eval(this, env);
	}
}
