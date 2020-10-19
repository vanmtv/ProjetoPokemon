package Rpg;

public class PokemonVenenoso extends Pokemon{
	private String tipo = "veneno";

	public PokemonVenenoso(String nome, double vida, double ataque, double defesa, double velocidade, double peso,
			double altura, double xpMin, double xpMax) 
	{
		super(nome, vida, ataque, defesa, velocidade, peso, altura, xpMin, xpMax, "veneno");
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
		   if( (tipo=="psiquico") || (tipo == "terra") ) 
			   return  0.5;
		   return 4;
	}
	
}