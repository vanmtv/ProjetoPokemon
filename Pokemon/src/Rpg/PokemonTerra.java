package Rpg;

public class PokemonTerra extends Pokemon {
	private String tipo = "terra";

	public PokemonTerra(String nome, double vida, double ataque, double defesa, double velocidade, double peso,
			double altura, double xpMin, double xpMax) {
		
		super(nome, vida, ataque, defesa, velocidade, peso, altura, xpMin, xpMax, "terra");
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
		   if( (tipo=="agua") || (tipo == "gelo") || ( tipo == "planta")  ) 
			   return  0.5;
		   return 4;
	}
	

}