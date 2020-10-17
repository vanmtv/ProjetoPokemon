package Rpg;

public class TipoPlanta extends Pokemon{
	private String tipo;
	
	public TipoPlanta(String nome, double vida, double ataque, double defesa, double velocidade, double peso, double altura, double xpMin, double xpMax, String tipo) {
		super(nome, vida, ataque, defesa, velocidade, peso, altura, xpMin, xpMax);
		this.tipo = tipo;
	}
 
	public String getTipo(){
		return tipo;
	}

	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	
	public int validarTipo(String tipo){
		if (tipo=="fogo") {
			return 1;
		}else {
			return 0;
		}
	}
}
