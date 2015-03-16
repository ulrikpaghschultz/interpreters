package mains;

import ast.Add;
import ast.Assign;
import ast.Const;
import ast.Procedure;
import ast.Program;
import ast.Seq;
import ast.Var;
import run.Env;

public class Mini3 {

	private static Program program() {
		Program p = new Program();
		Procedure main = new Procedure("main");
		Seq s = new Seq();
		main.setBody(s);
		s.addStatement(new Assign("x",new Const(87)));
		s.addStatement(new Assign("x",new Add(new Var("x"),new Const(-1))));
		p.addProcedure(main);
		return p;
	}
	
	public static void main(String[] args) {
		Env env = new Env(null);
		program().eval(env);
		System.out.println("Result: x="+env.lookup("x"));
	}

}
