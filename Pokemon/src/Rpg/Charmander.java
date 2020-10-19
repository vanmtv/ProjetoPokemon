package Rpg;

public class Charmander extends PokemonFogo {
	private int nivel = 0;
	private String dono;
	private double ataqueEspecial = 60;
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
				0, // xpMin - escluir.
				100 //xpMax
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
	    break;
		}
	}
	
	public void recebeDano(double dano) {
		if( (this.getVida() - dano) > 0) {
			this.setVida( this.getVida()  - dano );
		}else { 
			this.setVida(0);
		}
	}

	public double ataque(String tipo){
		return (((((20*(this.getNivel()+1) )/7)*this.getAtaque()*this.ataqueEspecial/this.getDefesa())/50)+2)*(1.5)*this.validarTipo(tipo)*(1*(this.rand(1, 0.15)));
	}
	
	public String ultimaForma() {
		return this.nomes[this.nomes.length - 1 ];
	}
	
	private double rand(double i, double j) {
		return  (i) - ( Math.random() * (j) );
	}
	
}

