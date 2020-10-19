package Rpg;

public class Eternatus extends PokemonVenenoso{ // pokémon lendario
	private int nivel1;
	private double  ataqueEspecial = 145;
	private String dono;
	private String [] nomes = {"Eternatus", "Eternamax Eternatus"};
	
	public Eternatus(String dono) 
	{
		super("Eternatus",
				140, // vida
				85, // ataque
				95,  // defesa
				130, // velocidade
				950, // peso
				20, // altura
				0, // xpMIn - escluir
				100
			);
		this.dono=dono;
		
	}
	public int getNivel1() {
		return nivel1;
	}
	public void setNivel1(int nivel) {
		this.nivel1 = nivel;
	}
	public String getTipo1() {
		return dono;
	}
	public void setTipo1(String dono) {
		this.dono = dono;
	}

	
	public void recebeXp(int xp){ //atualizar nivel
		this.setXpMin( this.getXpMin() + xp );
		
		if( this.getXpMin() >= this.getXpMax() && (this.nomes.length-1)>this.nivel1) {
			this.setXpMin(0);
			this.nivel1++;
			involuir(nivel1);
		}
	}
	
	public void involuir(int nivel) {
		this.setNome(nomes[nivel]);
		switch(nivel) {
		case 1:
			this.setVida(300);
			this.setAtaque(250);
			this.setDefesa(200);
			this.setAltura(100);
			this.setPeso(1000);
		break;
		}
	}
	
	public double ataque(String tipo){
		return (((((20*(this.getNivel1()+1) )/7)*this.getAtaque()*this.ataqueEspecial/this.getDefesa())/50)+2)*(1.5)*this.validarTipo(tipo)*(1*(this.rand(1, 0.15)));
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
	public String ultimaForma() {
		return this.nomes[this.nomes.length - 1 ];
	}
	
	
	public int getNivel() {
		return nivel1;
	}
	public void setNivel(int nivel) {
		this.nivel1 = nivel;
	}

}
