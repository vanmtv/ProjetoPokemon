package Rpg;

public class Diglett extends PokemonTerra {
	private int nivel = 0;
	private String dono;
	private String[] nomes = {"Diglett","Dugtrio"};
	
	public Diglett(String dono) 
	{
		super( 
				"Diglett",
				64, // vida
				109, // ataque
				78,  // defesa
				0, // velocidade
				0.8, // peso
				0.2, // altura
				0, // xpMIn - escluir
				100
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
			this.setVida(99);
			this.setAtaque(167);
			this.setDefesa(136);
			this.setAltura(0.7);
			this.setPeso(33.3);
		break;
		}
	}

}
