package ast;

import java.util.ArrayList;

public class Fun{
	public String nome;
	public ArrayList<ParamFormalFun> params;
	public String retorno;
	public ArrayList<VarDecl> vars;
	public ArrayList<Comando> body;
	
	public Fun(String nome,ArrayList<ParamFormalFun> params, String retorno,ArrayList<VarDecl> vars,ArrayList<Comando> body)
	{
		this.nome = nome;
		this.params = params;
		this.retorno = retorno;
		this.vars = vars;
		this.body = body;
	}

	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("public static ").append(retorno).append(" ").append(nome).append("(");
		for(int i = 0; i < params.size(); i++)
		{
			sb.append(params.get(i).toString());
			if(i < params.size() - 1)
				sb.append(", ");
		}
		sb.append(")" + " {\n");
		
		for(VarDecl v : vars)
			sb.append("  ").append(v.toString() + ";\n");
		
		for(Comando c : body)
			sb.append("  ").append(c.toString() + ";\n");
		
		sb.append("}");
		return sb.toString();
	}
}
