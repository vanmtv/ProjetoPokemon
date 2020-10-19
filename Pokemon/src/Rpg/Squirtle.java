package Rpg;

public class Squirtle extends PokemonAgua {
	private int nivel = 0;
	private double ataqueEspecial = 50;
	private String dono;
	private String[] nomes = {"Squirtle","Wartortle","Blastoise"};
	
	public Squirtle(String dono) 
	{
		super( 
				"Squirtle",
				112, // vida
				94, // ataque
				121,  // defesa
				0, // velocidade
				0.9, // peso
				0.5, // altura
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
			this.setVida(132);
			this.setAtaque(126);
			this.setDefesa(155);
			this.setAltura(1);
			this.setPeso(22.5);
		break;
		case 2:
			this.setVida(160);
			this.setAtaque(171);
			this.setDefesa(207);
			this.setAltura(1.6);
			this.setPeso(85.5);
		break;
		}
	}
	
	public double ataque(String tipo){
		return (((((20*(this.getNivel()+1) )/7)*this.getAtaque()*this.ataqueEspecial/this.getDefesa())/50)+2)*(1.5)*this.validarTipo(tipo)*(1*(this.rand(1, 0.15)));
	}
	
	
	public void recebeDano(double dano) {
		if( (this.getVida() - dano) > 0) {
			this.setVida( this.getVida()  - dano );
		}else { 
			this.setVida(0);
		}
	}
	
	public String ultimaForma() {
		return this.nomes[this.nomes.length - 1 ];
	}
	
	
	private double rand(double i, double j) {
		return  (i) - ( Math.random() * (j) );
	}

}
