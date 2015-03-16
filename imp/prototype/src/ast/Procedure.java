package ast;

import java.util.List;

public class Procedure {
	private String name;
	private List<String> parameters;
	private Statement body;
	public String getName() { return name;	}
	public List<String> getParameters() { return parameters; }
	public Statement getBody() { return body; }
}
