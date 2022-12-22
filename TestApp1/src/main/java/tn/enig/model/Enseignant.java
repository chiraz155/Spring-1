package tn.enig.model;

public class Enseignant {
	private int id;
	 private String nom;
	 private String Prenom;
	 private int charge ;
	 public Enseignant() {}
	 public Enseignant(String Prenom) {
		 this.Prenom=Prenom;
	 }
	public Enseignant(int id, String nom, String prenom, int charge) {
		super();
		this.id = id;
		this.nom = nom;
		Prenom = prenom;
		this.charge = charge;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public int getCharge() {
		return charge;
	}
	public void setCharge(int charge) {
		this.charge = charge;
	}
	 
}
