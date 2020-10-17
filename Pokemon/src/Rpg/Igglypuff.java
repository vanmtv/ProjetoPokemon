package Rpg;

public class Igglypuff extends PokemonFada{
	private int nivel;
	private String dono;
	
	public Igglypuff(String nome, double vida, double ataque, double defesa, double velocidade, double peso, double altura, double xpMin, double xpMax) {
		super(nome, vida, ataque, defesa, velocidade, peso, altura, xpMin, xpMax);
		this.nivel = nivel;
		this.dono = dono;
	}
	
	public void Evoluir() 
	{
		//recebe XP
		//modifica String nome;
	}

	public int getNivel() {
		return nivel;
	}


	public void setNivel(int nivel) {
		this.nivel = nivel;
	}


	public String getDono() {
		return dono;
	}


	public void setDono(String dono) {
		this.dono = dono;
	}
}
