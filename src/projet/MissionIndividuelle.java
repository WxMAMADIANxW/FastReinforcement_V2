package projet;

public class MissionIndividuelle extends Mission{
	public Employe emp;
	MissionIndividuelle(GestionFastReinforcement gestionFastReinforcement,String title, String description, float prix, Entreprise entreprise, int difficulté){
		super(gestionFastReinforcement, title,description,prix,entreprise,difficulté);
		this.emp = null;
	}
}
