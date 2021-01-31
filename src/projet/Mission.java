package projet;

public class Mission {
	private String titre;
	private String description;
	private float prix;
	public Entreprise entreprise;
	private int scoreDifficulté;
	private static GestionFastReinforcement gestionFastReinforcement;
	
	Mission(GestionFastReinforcement gestionFastReinforcement,String title, String description, float prix, Entreprise entreprise, int difficulté) {
		this.titre = title;
		this.description = description;
		this.prix = prix;
		this.entreprise = entreprise;
		this.scoreDifficulté = difficulté;
		this.gestionFastReinforcement = gestionFastReinforcement;
		
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public int getScoreDifficulté() {
		return scoreDifficulté;
	}

	public void setScoreDifficulté(int scoreDifficulté) {
		this.scoreDifficulté = scoreDifficulté;
	}
	
}
