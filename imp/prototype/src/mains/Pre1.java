package mains;

import ast.Assign;
import ast.Const;
import ast.Procedure;
import ast.Program;
import ast.Statement;
import run.Env;

public class Pre1 {

	private static Statement what() {
		return new Assign("x",new Const(87));
	}
	
	public static void main(String[] args) {
		Env env = new Env(null);
		what().eval(null,env);
		System.out.println("Result: x="+env.lookup("x"));
	}

}
