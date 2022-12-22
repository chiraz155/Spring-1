package tn.enig.model;

public class Matiere {

  private int id;
  private String titre;
  private int niveau;
  private int nbheure;
  public Matiere(){}
  public Matiere( String titre) {
	  this.titre=titre;
  }
  
  public Matiere(int id, String titre,int niveau, int nbheure) {
		super();
		this.id = id;
		this.titre = titre;
		this.niveau = niveau;
		this.nbheure = nbheure;
	}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getTitre() {
	return titre;
}

public void setTitre(String titre) {
	this.titre = titre;
}

public int getNiveau() {
	return niveau;
}

public void setNiveau(int niveau) {
	this.niveau = niveau;
}

public int getNbheure() {
	return nbheure;
}

public void setNbheure(int nbheure) {
	this.nbheure = nbheure;
}
  
 
 
 
 
}
