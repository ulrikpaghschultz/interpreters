package run;

import java.util.ArrayList;
import java.util.List;

public class Env {
	private List<Binding> bindings = new ArrayList<Binding>();
	private Env enclosing;
	
	public Env(Env env) {
		this.enclosing = env;
	}

	public void bind(String name, Value v) {
		bindings.add(new Binding(name,v));
	}

}
