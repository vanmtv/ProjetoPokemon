package Rpg;

public class PokemonAgua extends Pokemon {
	private String tipo ="agua";

	public PokemonAgua(String nome, double vida, double ataque, double defesa, double velocidade, double peso,
			double altura, double xpMin, double xpMax) {
		super(nome, vida, ataque, defesa, velocidade, peso, altura, xpMin, xpMax, "agua");
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public  double validarTipo(String tipo) {
		   if( (tipo=="eletrico") || (tipo == "planta")  ) 
			   return  0.5;
		   return 4;
	}

}