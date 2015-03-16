package mains;

import ast.Add;
import ast.Assign;
import ast.Call;
import ast.Const;
import ast.Greater;
import ast.Mul;
import ast.Print;
import ast.Procedure;
import ast.Program;
import ast.Seq;
import ast.Statement;
import ast.Var;
import ast.While;
import run.Env;

public class Pow1 {

	private static Program program() {
		Program p = new Program();
		Procedure main = new Procedure("main");
		Call powCall = new Call("x","pow");
		powCall.addArgument(new Const(5));
		powCall.addArgument(new Const(3));
		main.setBody(powCall);
		p.addProcedure(main);
		Procedure pow = new Procedure("pow");
		p.addProcedure(pow);
		pow.addParameter("base");
		pow.addParameter("exp");
		Seq powBody = new Seq();
		pow.setBody(powBody);
		powBody.addStatement(new Assign("result",new Const(1)));
		Seq powLoopBody = new Seq();
		powBody.addStatement(new While(new Greater(new Var("exp"),new Const(0)),powLoopBody));
		powLoopBody.addStatement(new Assign("result",new Mul(new Var("result"),new Var("base"))));
		powLoopBody.addStatement(new Assign("exp",new Add(new Var("exp"),new Const(-1))));
		powBody.addStatement(new Assign("pow",new Var("result")));
		return p;
	}
	
	public static void main(String[] args) {
		Env env = new Env(null);
		program().eval(env);
		System.out.println("Result: x="+env.lookup("x"));
	}

}
