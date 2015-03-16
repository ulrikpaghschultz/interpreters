package mains;

import ast.Assign;
import ast.Const;
import ast.Procedure;
import ast.Program;
import run.Env;

public class Mini2 {

	private static Program program() {
		Program p = new Program();
		Procedure main = new Procedure("main");
		main.setBody(new Assign("x",new Const(87)));
		p.addProcedure(main);
		return p;
	}
	
	public static void main(String[] args) {
		Env env = new Env(null);
		program().eval(env);
		System.out.println("Result: x="+env.lookup("x"));
	}

}
