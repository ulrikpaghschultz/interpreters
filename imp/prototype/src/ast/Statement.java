package ast;

import run.Env;

public abstract class Statement {
	public abstract void eval(Program prog, Env env);
}
