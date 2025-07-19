package ast;

public class CPrint extends Comando{
	public int linha;
	public Exp exp;
	
	public CPrint(int linha,Exp exp)
	{
	  this.linha = linha;
	  this.exp = exp;
	}

	public String toString()
	{
		return "System.out.println(" + exp.toString() + ")";
	}
}
