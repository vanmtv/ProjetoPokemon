package Rpg;

public class TipoAr  extends Pokemon {
	private String tipo;
	
	public TipoAr(String nome, double vida, double ataque, double defesa, double velocidade, double peso, double altura, double xpMin, double xpMax, String tipo) {
		super(nome, vida, ataque, defesa, velocidade, peso, altura, xpMin, xpMax);
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Boolean validarTipo(String tipo){
		if(tipo=="ar"){
			return true;
		}
		else{
		   return false;
		}
	}
	
	

}
