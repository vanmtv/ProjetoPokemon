package Rpg;

public class Sandshrew extends PokemonTerra {
	private int nivel = 0;
	private String dono;
	private String[] nomes = {"Sandshrew","Sandslash"};
	
	public Sandshrew(String dono) 
	{
		super( 
				"Sandshrew",
				120, // vida
				126, // ataque
				120,  // defesa
				0, // velocidade
				12, // peso
				0.6, // altura
				0, // xpMIn - escluir
				100,
				"Sandshrew"
		);
		this.dono=dono;
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
	
	public void recebeXp(int xp){ //atualizar nivel
		this.setXpMin( this.getXpMin() + xp );
		
		if( this.getXpMin() >= this.getXpMax() && (this.nomes.length-1)>this.nivel) {
			this.setXpMin(0);
			this.nivel++;
			involuir(nivel);
		}
	}
	
	public void involuir(int nivel) 
	{
		this.setNome(nomes[nivel]);
		switch(nivel) {
		case 1:
			this.setVida(154);
			this.setAtaque(182);
			this.setDefesa(175);
			this.setAltura(1);
			this.setPeso(29.5);
		break;
		}
	}
}
