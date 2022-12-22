package tn.enig.Dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tn.enig.model.Affectation;
import tn.enig.model.Enseignant;
import tn.enig.model.Matiere;

@org.springframework.stereotype.Controller
public class Controller {
	@Autowired
	IGestion Dao;
	@GetMapping(value="/Enseignants")
	public String f1(Model m) {
		List<Enseignant>l=Dao.getAllEnseignant();
		m.addAttribute("Enseignants",l);
		return "ListEnseignants";
	}
	@GetMapping(value="/Ajouter")
	public String f2(Model m) {
		Enseignant ens=new Enseignant();
		m.addAttribute("ens",ens);
		List<Enseignant>Enseignants=Dao.getAllEnseignant();
		m.addAttribute("Enseignants",Enseignants);
		return "ajoutEnseignant";
        		
		
	}
	
	
	
	@PostMapping(value="/addEns")
	public String f3(Model m,@ModelAttribute("ens") Enseignant ens) {
		Dao.addEns(ens);
		
		return "redirect:/Enseignants";
	}
	@GetMapping(value="/Matieres")
	public String f4(Model m) {
		List<Matiere>l=Dao.getAllMatieres();
		m.addAttribute("Matieres",l);
		return "ListMatiers";
	}
	
	@GetMapping(value="/Ajoutermatiere")
	public String f5(Model m) {
		Matiere mat=new Matiere();
		m.addAttribute("mat",mat);
		List<Matiere>Matieres=Dao.getAllMatieres();
		m.addAttribute("Matieres",Matieres);
		return "ajoutMatiere";
        		

		
}
	
	@PostMapping(value="/addMat")
	public String f6(Model m,@ModelAttribute("mat") Matiere mat) {
		Dao.addMatiere(mat);
		
		return "redirect:/Matieres";



}
	
	@GetMapping(value="/Affectations")
	public String f7(Model m) {
		List<Affectation>l=Dao.getAllAffectation ();
		m.addAttribute("Affectations",l);
		return "ListAffectations";

}
	@GetMapping(value="/Ajouteraffect")
	public String f8(Model m) {
		Affectation affect=new Affectation();
		m.addAttribute("affect",affect);
		List<Affectation>Affectations=Dao.getAllAffectation();
		m.addAttribute("Affectations",Affectations);
		return "ajoutAffect";
        		
		
//	}
	
	///@PostMapping(value="/addAffect")
	//public String f9(Model m,@ModelAttribute("affect") Affectation affect) {
		//Dao.addAffect (affect);
		
		//return "redirect:/Affectations";



}
}
