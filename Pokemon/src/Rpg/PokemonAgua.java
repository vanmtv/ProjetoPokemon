package Rpg;

public class PokemonAgua extends Pokemon {
	private String tipo;

	public PokemonAgua(String nome, double vida, double ataque, double defesa, double velocidade, double peso,
			double altura, double xpMin, double xpMax, String tipo) {
		super(nome, vida, ataque, defesa, velocidade, peso, altura, xpMin, xpMax);
		this.tipo = tipo;
	}
	
	public boolean ValidarTipo (String tipo)
	{
		if (tipo=="agua") 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
