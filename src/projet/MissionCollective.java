package projet;

public class MissionCollective extends Mission{
	 Employe[]�quipe;
	
	MissionCollective(GestionFastReinforcement gestionFastReinforcement,String title, String description, float prix, Entreprise entreprise, int difficult�){
	super(gestionFastReinforcement, title,description,prix,entreprise,difficult�);
	�quipe = null;
	}
}
