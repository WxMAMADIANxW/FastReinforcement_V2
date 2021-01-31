package projet;

public class MissionCollective extends Mission{
	 Employe[]équipe;
	
	MissionCollective(GestionFastReinforcement gestionFastReinforcement,String title, String description, float prix, Entreprise entreprise, int difficulté){
	super(gestionFastReinforcement, title,description,prix,entreprise,difficulté);
	équipe = null;
	}
}
