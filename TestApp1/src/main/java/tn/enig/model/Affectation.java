package tn.enig.model;

public class Affectation {
	private int id;
	private Matiere matiere;
	private Enseignant enseignant;
	private int nbheure;
	public Affectation() {}
	public Affectation(int id, Matiere matiere, Enseignant enseignant, int nbheure) {
		super();
		this.id = id;
		this.matiere = matiere;
		this.enseignant =enseignant ;
		this.nbheure = nbheure;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Matiere getMatiere() {
		return matiere;
	}
	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}
	public Enseignant getEnseignant() {
		return enseignant;
	}
	public void setEnseignant(Enseignant ens) {
		this.enseignant = enseignant;
	}
	public int getNbheure() {
		return nbheure;
	}
	public void setNbheure(int nbheure) {
		this.nbheure = nbheure;
	}
	
	

}
