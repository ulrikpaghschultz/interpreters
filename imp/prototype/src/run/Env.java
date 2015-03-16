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
		int i = 0;
		int found = 0;
		while(i<bindings.size()) {
			Binding b = bindings.get(i);
			if(name.equals(b.getName())) { b.setValue(v); found = 1; }
			i++;
		}
		if(found==0) bindings.add(new Binding(name,v));
	}

	public Value lookup(String name) {
		int i = 0;
		Value result = null;
		while(i<bindings.size()) {
			Binding b = bindings.get(i);
			if(result==null && b.getName().equals(name)) result = b.getValue();
			i++;
		}
		if(result!=null)
			return result;
		else if(result==null && enclosing!=null)
			return enclosing.lookup(name);
		else
			return null;
	}

}
