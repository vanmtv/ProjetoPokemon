package Rpg;

public class Charmander extends TipoFogo {
	private int nivel = 0;
	private String dono;
	private String[] nomes = {"Charmander", "Charmeleon", "Charizard"};
	
	public Charmander(String dono) {
		super( 
				"Charmander",
				105, // vida
				116, // ataque
				93,  // defesa
				0, // velocidade
				8.5, // peso
				0.6, // altura
				0, // xpMIn - escluir
				100,
				"Charmander"
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
	
	public void involuir(int nivel) {
		this.setNome(nomes[nivel]);
		switch(nivel) {
		case 1:
			this.setVida(131);
			this.setAtaque(158);
			this.setDefesa(126);
			this.setAltura(1.1);
			this.setPeso(19);
		break;
		case 2:
			this.setVida(158);
			this.setAtaque(223);
			this.setDefesa(173);
			this.setAltura(1.7);
			this.setPeso(90.5);
		}
	}
	
	public double ataque(){
		return this.rand(this.getAtaque(), this.getAtaque() );
	}
	
	public double defesa(){
		return this.rand(this.getDefesa(), this.getDefesa() );
	}
	
	public void recebeDano(double dano) {
		double newDano = this.defesa() - dano; 
		if( newDano>0 ) {
			this.setVida( this.getVida()  - ( newDano ) );
		}
		else {
			System.out.println("O pokémon "+this.getNome()+" não recebeu nenhum dano!");
		}
	}
	
	
	private double rand(double i, double j) {
		return  (i) - ( Math.random() * (j) );
	}
	
}

