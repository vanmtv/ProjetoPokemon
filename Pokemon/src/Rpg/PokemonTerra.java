package Rpg;

public class PokemonTerra extends Pokemon {
	private String tipo;

	public PokemonTerra(String nome, double vida, double ataque, double defesa, double velocidade, double peso,
			double altura, double xpMin, double xpMax, String tipo) {
		super(nome, vida, ataque, defesa, velocidade, peso, altura, xpMin, xpMax);
		this.tipo = tipo;
	}

	public boolean ValidarTipo (String tipo)
	{
		if (tipo=="terra") 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

	public String getTipo() 
	{
		return tipo;
	}

	public void setTipo(String tipo) 
	{
		this.tipo = tipo;
	}
	

}
