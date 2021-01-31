package projet;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;


public class GestionFastReinforcement implements  Serializable{
	private static final long serialVersionUID = 123456789L;
	private static GestionFastReinforcement gestionFastReinforcement = null;
	private SortedSet<Employe> employes;
	private SortedSet<Mission> missions;
	private SortedSet<Entreprise> entreprises;
	/*voir si on ajoute un identifiant et MDP*/
	private static Passerelle passerelle = new serialization.Serialization();
	
	
	
	
	public static GestionFastReinforcement getFastReinforcement()
	{
		if(gestionFastReinforcement == null)
		{
			gestionFastReinforcement = passerelle.getGestionFastReinforcement();
			if(gestionFastReinforcement == null)
				gestionFastReinforcement = new GestionFastReinforcement();
		}
		
		return gestionFastReinforcement;
	}
	public GestionFastReinforcement()
	{
		if (gestionFastReinforcement != null)
			throw new RuntimeException("Vous ne pouvez créer qu'une seuls instance de cet objet.");
		employes = new TreeSet<>();
		missions = new TreeSet<>();
		entreprises = new TreeSet<>();
	}
	
	public void sauvegarder() throws SauvegardeImpossible
	{
		passerelle.sauvegarderGestionPersonnel(this);
	}
	
	/*fonction d'ajout à une liste, suppression d'une liste , getter des listes  */
	
	
	public SortedSet<Employe> getEmployes(){
		return Collections.unmodifiableSortedSet(employes);
	}
	
	public Employe addEmploye(String name, String tel, String mail,int idEmploye ,int experience, int scoreDifficulté) {
		Employe employe = new Employe(this,name,tel,mail,idEmploye,experience,scoreDifficulté);
		employes.add(employe);		
		return employe;
	}
	
	public void remove(Employe employe) {
		employes.remove(employe);
	}
	
	
	public SortedSet<Mission> getMission(){
		return Collections.unmodifiableSortedSet(missions);
	}
	
	public Mission addMission(String title, String description, float prix, Entreprise entreprise, int difficulté) {
		Mission mission = new Mission(this,title,description,prix,entreprise,difficulté);
		missions.add(mission);
		return mission;
	}
	
	public void remove(Mission mission) {
		missions.remove(mission);
	}
	
	public SortedSet<Entreprise> getEntreprise(){
		return Collections.unmodifiableSortedSet(entreprises);
	}
	
	public Entreprise addEntreprise(String name, String tel, String mail, int idEntreprise, String localisation,Categories categorie) {
		Entreprise entreprise = new Entreprise(this,name,tel,mail,idEntreprise,localisation,categorie);
		entreprises.add(entreprise);
		return entreprise;
	}
	
	public void remove(Entreprise entreprise) {
		entreprises.remove(entreprise);
	}
	
	/*Suppression de la persistance*/
	
	public void removeEmploye(Employe employe) {
		try {
			passerelle.removeEmploye(employe);
			remove(employe);
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void removeMission(Mission mission) {
		try {
			passerelle.removeMission(mission);
			remove(mission);
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void removeEntreprise(Entreprise entreprise) {
		try {
			passerelle.removeEntreprise(entreprise);
			remove(entreprise);
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/*update des listes en persistance*/
	public void updateEmploye(Employe employe) {
		try {
			passerelle.updateEmploye(employe);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateMission(Mission mission) {
		try {
			passerelle.updateMission(mission);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateEntreprise(Entreprise entreprise) {
		try {
			passerelle.updateEntreprise(entreprise);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}
