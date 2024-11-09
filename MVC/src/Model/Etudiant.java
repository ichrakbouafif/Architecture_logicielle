package Model;

public class Etudiant {
	private int id;
	private String nom;
	
	public Etudiant() {
		this.id= 0;
		this.nom = "Unknown";
		
	}
	
	public Etudiant(int id, String nom) {
		this.id= id;
		this.nom = nom;
		
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return this.id;
	}
	public void setNom(String nom) {
		this.nom=nom;
	}
	public String getNom() {
		return this.nom;
	}
}

