  
package Rpg;

public class PokemonPsiquico extends Pokemon {
	private String tipo = "psiquico";

	public PokemonPsiquico(String nome, double vida, double ataque, double defesa, double velocidade, double peso,
			double altura, double xpMin, double xpMax) {
		super(nome, vida, ataque, defesa, velocidade, peso, altura, xpMin, xpMax, "psiquico");

	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public  double validarTipo(String tipo) {
		   if( (tipo=="inseto") || (tipo == "fantasama") || (tipo == "sombrio")) 
			   return  0.5;
		   return 4;
	}

}