package metier;

public class Compteur {
	private int val;
	
	public Compteur () {
		this.val= 0;
	}
	public Compteur(int v) {
		this.val=v;
	}
	public void Incrementer(int p) {
		this.val +=p;
	}
	public void Decrementer (int p) {
		this.val -= p ;
	}
	public int getValeur() {
		return this.val ;
	}
	@Override
	public String toString() {
		return "Compteur de valeur"+ this.val;
	}

}
