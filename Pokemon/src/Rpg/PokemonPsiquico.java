package Rpg;

public class PokemonPsiquico extends Pokemon {
	private String tipo;

	public PokemonPsiquico(String nome, double vida, double ataque, double defesa, double velocidade, double peso,
			double altura, double xpMin, double xpMax, String tipo) {
		super(nome, vida, ataque, defesa, velocidade, peso, altura, xpMin, xpMax);
		this.tipo = tipo;
	}
	
	public boolean ValidarTipo (String tipo)
	{
		if (tipo=="psiquico") 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

}
