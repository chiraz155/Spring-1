package tn.enig.Dao;



import java.util.List;

import tn.enig.model.Affectation;
import tn.enig.model.Enseignant;
import tn.enig.model.Matiere;

public interface IGestion {
	public List<Enseignant> getAllEnseignant() ;
    public void addEns(Enseignant s);
    public List<Matiere> getAllMatieres();
    public void addMatiere(Matiere mat);
    public List<Affectation> getAllAffectation() ;
    public void addAffect(Affectation affect );
  //  public void Matiere2Ens(Matiere m);

}
