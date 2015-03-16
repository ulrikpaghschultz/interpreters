package ast;

import java.util.List;

public class Program {
	private List<Procedure> procedures;

	public Procedure lookup(String name) {
		int index = 0;
		Procedure result = null;
		while(index<procedures.size()) {
			Procedure p = procedures.get(index);
			if(name.equals(p.getName())) result = p;
		}
		return result;
	}
}
