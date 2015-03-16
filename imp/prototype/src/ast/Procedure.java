package ast;

import java.util.ArrayList;
import java.util.List;

public class Procedure {
	private String name;
	private List<String> parameters = new ArrayList<String>();
	private Statement body;
	public Procedure(String _name) { this.name = _name; }
	public String getName() { return name;	}
	public List<String> getParameters() { return parameters; }
	public Statement getBody() { return body; }
	public void addParameter(String p) { parameters.add(p); }
	public void setBody(Statement _body) { this.body = _body; }
}
