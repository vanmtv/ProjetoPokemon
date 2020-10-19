package Rpg;

public class Sandshrew extends PokemonTerra {
	private int nivel = 0;
	private double ataqueEspecial = 20;
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
			this.setVida(154);
			this.setAtaque(182);
			this.setDefesa(175);
			this.setAltura(1);
			this.setPeso(29.5);
		break;
		}
	}
	
	public double ataque(String tipo){
		return (((((20*(this.getNivel()+1) )/7)*this.getAtaque()*this.ataqueEspecial/this.getDefesa())/50)+2)*(1.5)*this.validarTipo(tipo)*(1*(this.rand(1, 0.15)));
	}
	
	public String ultimaForma() {
		return this.nomes[this.nomes.length - 1 ];
	}
	
	public void recebeDano(double dano) {
		if( (this.getVida() - dano) > 0) {
			this.setVida( this.getVida()  - dano );
		}else { 
			this.setVida(0);
		}
	}
	
	private double rand(double i, double j) {
		return  (i) - ( Math.random() * (j) );
	}
}
