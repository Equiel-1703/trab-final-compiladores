package ast;


public class EFloat extends Exp{
	public float value;
	
	
	public EFloat(float value)
	{
	  this.value = value;
	} 

	public String toString()
	{
		return String.valueOf(value) + "f";
	}
}
