package ast;

import run.Env;
import run.Value;

public abstract class Exp {
	public abstract Value eval(Env env);
}
