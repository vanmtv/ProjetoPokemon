package Rpg;

public class PokemonPlanta extends Pokemon{
	private String tipo = "planta";
	
	public PokemonPlanta(String nome, double vida, double ataque, double defesa, double velocidade, double peso, double altura, double xpMin, double xpMax) {
		super(nome, vida, ataque, defesa, velocidade, peso, altura, xpMin, xpMax,"planta");
	}
 
	public String getTipo(){
		return tipo;
	}

	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	public  double validarTipo(String tipo) {
		   if( (tipo=="gelo") || (tipo == "fogo") || ( tipo == "inseto") || (tipo=="venenoso") || (tipo == "ar")) 
			   return  0.5;
		   return 4;
	}
}
