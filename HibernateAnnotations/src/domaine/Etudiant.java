package domaine;

import javax.persistence.*;

@Entity
@Table(name="etudiants")
public class Etudiant {
	public Etudiant(){}
	@Id
	@Column(name="id")
	int id;
	public int getId(){return id;}
	public void setId(int id){this.id = id;}
	@Column(name="nom")
	String nom;
	public String getNom (){return nom;}
	public void setNom(String nom){this.nom = nom;}       
}
