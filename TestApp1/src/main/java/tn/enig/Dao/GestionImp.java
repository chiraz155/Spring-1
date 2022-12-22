package tn.enig.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;



import tn.enig.model.Affectation;
import tn.enig.model.Enseignant;
import tn.enig.model.Matiere;
@Repository
public class GestionImp  implements IGestion{
	@Autowired @Qualifier("dataSource")
     DataSource base;

	
	
	public List<Enseignant> getAllEnseignant(){

		 List<Enseignant> l = new ArrayList<Enseignant>();

     try {
			 
	 

     Connection cnx=base.getConnection();
     
     PreparedStatement ps =cnx.prepareStatement("select * from enseignant");
	ResultSet rs=ps.executeQuery();
	while (rs.next()) {
		Enseignant ens=new Enseignant(rs.getInt("id"),rs.getString("nom"),rs.getString("prenom"),rs.getInt("charge"));
		l.add(ens);}
	     
     }catch (Exception e) {
		e.printStackTrace();}
     
     
     return l;   
   
	
	}
	
	

	public void addEns(Enseignant ens) {
		try {
			Connection cnx=base.getConnection();
			PreparedStatement ps=cnx.prepareStatement("insert into enseignant values(null,?,?,?) ");
			ps.setString(1, ens.getNom());
			ps.setString(2, ens.getPrenom());
			ps.setInt(3, ens.getCharge());
			
			ps.executeUpdate();
			
			
			
		}catch (Exception e) {
			e.printStackTrace();} 
		
		
	}

	@Override
	public List<Matiere>  getAllMatieres() {
		 List<Matiere> l1 = new ArrayList<Matiere>();
		  try {
				 
				 

			     Connection cnx=base.getConnection();
			     PreparedStatement ps =cnx.prepareStatement("select * from matiere");
			 	ResultSet rs=ps.executeQuery();
			 	while (rs.next()) {
			 		Matiere mat=new Matiere (rs.getInt("id"),rs.getString("titre"),rs.getInt("niveau"), rs.getInt("nbheure"));
			 		l1.add(mat);}
			 	     
			      }catch (Exception e) {
			 		e.printStackTrace();}
			      
			      
			      return l1;   
	}
			 	
			 	
			   
			
			
	


	//public List<Affectation>getAllAffectation (){
		
		// List<Affectation> l1 = new ArrayList<Affectation>();
		//  try {
				 
				 

			   //  Connection cnx=base.getConnection();
			    // PreparedStatement ps =cnx.prepareStatement("select * from affectation");
			 	///ResultSet rs=ps.executeQuery();
			 ///	while (rs.next()) {
			 		//Affectation aff=new Affectation ();
			 				//int id=rs.getInt("id");
			 				// String nomMat=rs.getString("matiere");
			 				// Matiere mat=new Matiere(nomMat);
			 				// String prenomenseignant=rs.getString("enseignant");
			 			
			 				// Enseignant ens=new Enseignant(prenomenseignant);
			 				// int nbheure = rs.getInt("nbheure");
			 				///aff.setEnseignant(ens);		 
					 		//aff.setMatiere(mat);
					 		//aff.setNbheure(nbheure);
					 		//l1.add(aff);}
					 	     
			    //  }catch (Exception e) {
			 		//e.printStackTrace();}
			      
			      
			     // return l1;   
	//}
			
	

	@Override
	//public void Matiere2Ens(Matiere m) {
		
		
//	}

	 public void addMatiere(Matiere mat) {
			try {
				Connection cnx=base.getConnection();
				PreparedStatement ps=cnx.prepareStatement("insert into matiere values(null,?,?,?) ");
				ps.setString(1, mat.getTitre());
				ps.setInt(2, mat.getNiveau());
				ps.setInt(3, mat.getNbheure());
				
				ps.executeUpdate();
				
				
				
			}catch (Exception e) {
				e.printStackTrace();} 
	 }
				
    public void addAffect(Affectation affect ) {
    	
    	
    	
    	try {
			Connection cnx=base.getConnection();
			PreparedStatement ps=cnx.prepareStatement("insert into affectation values(null,?,?,?) ");
			ps.setString(2, affect.getEnseignant().getPrenom());
			ps.setString(1, affect.getMatiere().getTitre());
			ps.setInt(3, affect.getNbheure());
			
			ps.executeUpdate();
			
			
			
		}catch (Exception e) {
			e.printStackTrace();} 
 }


    public List<Affectation> getAllAffectation() {
		List<Affectation> affect=new ArrayList<Affectation>();
		try {
		     
			Connection cnx=base.getConnection();
			PreparedStatement ps=cnx.prepareStatement("select* from affectation");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				
				 Affectation a=new Affectation (rs.getInt(1),this.getMatiereById(rs.getInt(2)),this.getEnseignantById(rs.getInt(3)),rs.getInt(4));
				
			
			     affect.add(a);
			}
			
		}catch(Exception e) {
			
		}
		
		return affect ;
	}
    public Matiere getMatiereById(int id) {
		Matiere m=new Matiere();
		try {
			Connection cnx=base.getConnection();
			PreparedStatement ps=cnx.prepareStatement("select * from matiere where id=?");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				m.setId(rs.getInt(1));
				m.setTitre(rs.getString(2));
				m.setNiveau(rs.getInt(3));
				m.setNbheure(rs.getInt(4));}
				
			
		}catch(Exception e) {
			
		}
		return m;
	}

	public Enseignant getEnseignantById(int id) {
		Enseignant enseignant=null;
		try {
			Connection cnx=base.getConnection();
			PreparedStatement ps=cnx.prepareStatement("select * from enseignant where id= ?");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				enseignant=new Enseignant (rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
			}
			
		}catch(Exception e) {
			
		}
		return enseignant;
	}



}
