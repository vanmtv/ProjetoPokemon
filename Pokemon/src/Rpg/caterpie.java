package Rpg;

public class Caterpie extends PokemonAr {
		private int nivel;
		private String dono;
		
		public Caterpie(String nome, double vida, double ataque, double defesa, double velocidade, double peso,
				double altura, double xpMin, double xpMax, String tipo, int nivel, String dono) 
		{
			super(nome, vida, ataque, defesa, velocidade, peso, altura, xpMin, xpMax, tipo);
			this.nivel = nivel;
			this.dono = dono;
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
