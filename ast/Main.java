package ast;

import java.util.ArrayList;

public class Main{

	public ArrayList<VarDecl> vars;
	public ArrayList<Comando> coms;
	
	public Main(ArrayList<VarDecl> vars,ArrayList<Comando> coms)
	{
		this.vars = vars;
		this.coms = coms;
	}

	public String toString()
	{
		StringBuilder sb = new StringBuilder();

		for(VarDecl v : vars)
			sb.append(v.toString() + ";\n");
		for(Comando c : coms)
			sb.append(c.toString() + ";\n");
		return sb.toString();
	}
		

}
