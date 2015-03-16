package ast;

import run.Env;
import run.Value;

public class Greater extends Exp {
	private Exp lhs, rhs;
	public Greater(Exp _lhs, Exp _rhs) {
		this.lhs = _lhs; this.rhs = _rhs;
	}
	@Override
	public Value eval(Env env) {
		Value l = lhs.eval(env);
		Value r = rhs.eval(env);
		return new Value((l.val()>r.val()) ? 1 : 0);
	}

}
