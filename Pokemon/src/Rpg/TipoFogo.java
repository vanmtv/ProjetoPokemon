package Rpg;

public class TipoFogo extends  Pokemon{
	 private String tipo = "fogo";

	public TipoFogo(String nome, double vida, double ataque, double defesa, double velocidade, double peso, double altura, double xpMin, double xpMax) {
		super(nome, vida, ataque, defesa, velocidade, peso, altura, xpMin, xpMax);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public  double validarTipo(String tipo) {
	   if( (tipo=="agua") || (tipo == "terra") || ( tipo == "pedra") ) 
		   return  0.5;
	   return 4;
	}
}
