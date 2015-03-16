package mains;

import ast.Assign;
import ast.Const;
import ast.Procedure;
import ast.Program;
import ast.Statement;
import run.Env;

public class Mini1 {

	public static void main(String[] args) {
		Env env = new Env(null);
		Statement what = new Assign("x",new Const(87));
		what.eval(null,env);
		System.out.println("Result: x="+env.lookup("x"));
	}

}
