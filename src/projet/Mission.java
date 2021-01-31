package projet;

public class Mission {
	private String titre;
	private String description;
	private float prix;
	public Entreprise entreprise;
	private int scoreDifficult�;
	private static GestionFastReinforcement gestionFastReinforcement;
	
	Mission(GestionFastReinforcement gestionFastReinforcement,String title, String description, float prix, Entreprise entreprise, int difficult�) {
		this.titre = title;
		this.description = description;
		this.prix = prix;
		this.entreprise = entreprise;
		this.scoreDifficult� = difficult�;
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

	public int getScoreDifficult�() {
		return scoreDifficult�;
	}

	public void setScoreDifficult�(int scoreDifficult�) {
		this.scoreDifficult� = scoreDifficult�;
	}
	
}
