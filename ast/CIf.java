package ast;

import java.util.ArrayList;

public class CIf extends Comando{
	public int linha;
	public Exp exp;
	public ArrayList<Comando> bloco;
	
	public CIf(int linha,Exp exp, ArrayList<Comando> bloco)
	{
	  this.linha = linha;
	  this.exp = exp;
	  this.bloco = bloco;
	}

	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("if (" + exp.toString() + ") {\n");
		for(Comando c : bloco)
			sb.append(c.toString() + ";\n");
		sb.append("}");
		return sb.toString();
	}

}
