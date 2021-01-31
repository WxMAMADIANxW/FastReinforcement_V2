package projet;

import java.sql.SQLException;

public interface Passerelle {
	public GestionFastReinforcement getGestionFastReinforcement();
	public void sauvegarderGestionPersonnel(GestionFastReinforcement gestionFastReinforcement) throws SauvegardeImpossible;
	public int insertMission (Mission mission) throws SauvegardeImpossible;
	public int insertEntreprise(Entreprise entreprise) throws SauvegardeImpossible;
	public int insertEmploye(Employe employe) throws SauvegardeImpossible;
	public void updateMission (Mission mission) throws SQLException;
	public void updateEntreprise(Entreprise entreprise) throws SQLException;
	public void updateEmploye(Employe employe) throws SQLException;
	public void removeMission (Mission mission) throws SQLException;
	public void removeEntreprise(Entreprise entreprise) throws SQLException;
	public void removeEmploye(Employe employe) throws SQLException;
}
