package Rpg;

public class PokemonAr extends Pokemon {
	private String tipo = "ar";

	public PokemonAr(String nome, double vida, double ataque, double defesa, double velocidade, double peso,
			double altura, double xpMin, double xpMax)
	{
		super(nome, vida, ataque, defesa, velocidade, peso, altura, xpMin, xpMax, "ar");
	}
	
	
	public String getTipo() 
	{
		return tipo;
	}

	public void setTipo(String tipo) 
	{
		this.tipo = tipo;
	}
	
	public  double validarTipo(String tipo) {
		   if( (tipo=="eletrico") || (tipo == "gelo") || ( tipo == "pedra") ) 
			   return  0.5;
		   return 4;
	}
	

}
