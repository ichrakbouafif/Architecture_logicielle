package metier;

public class CompteBancaire {
	private double solde;
	private int code;
	
	public CompteBancaire(int code) {
		this.solde = 0.0;
		this.code = code;
	}
	public CompteBancaire(int code, double solde) {
		this.solde = solde;
		this.code = code;
	}
	public void retirer(double montant) {
		this.solde-=montant;
	}
	public void deposer(double montant) {
		this.solde+=montant;
	}
	public double getSolde() {
		return this.solde ;
	}
	@Override
	public String toString() {
		return "CompteBancaire [solde = " + solde + ",code ="+ code +"]";
	}

}
