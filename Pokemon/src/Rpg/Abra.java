package Rpg;

public class Abra extends PokemonPsiquico {
	private int nivel = 0;
	private String dono;
	private String[] nomes = {"Abra","Kadabra","Alakazam"};
	
	public Abra(String dono) 
	{
		super( 
				"Abra",
				85, // vida
				195, // ataque
				82,  // defesa
				0, // velocidade
				19.5, // peso
				0.9, // altura
				0, // xpMIn - escluir
				100,
				"Abra"
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
			this.setVida(106);
			this.setAtaque(232);
			this.setDefesa(117);
			this.setAltura(1.3);
			this.setPeso(56.5);
		break;
		case 2:
			this.setVida(127);
			this.setAtaque(271);
			this.setDefesa(167);
			this.setAltura(1.5);
			this.setPeso(48);
		break;
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
