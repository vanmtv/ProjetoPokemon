package Rpg;

public class Eternatus extends PokemonVenenoso{
	private int nivel;
	private String tipo;
	public Eternatus(String nome, double vida, double ataque, double defesa, double velocidade, double peso,
			double altura, double xpMin, double xpMax, String tipo, int nivel, String tipo2) {
		super(nome, vida, ataque, defesa, velocidade, peso, altura, xpMin, xpMax, tipo);
		this.nivel = nivel;
		tipo = tipo2;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
