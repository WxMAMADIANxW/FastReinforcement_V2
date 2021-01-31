package projet;

public class Entreprise extends User {
	private int idEntreprise;
	private String localisation;
	private Categories categories;
	private static GestionFastReinforcement gestionFastReinforcement;
	
	
	public Entreprise(GestionFastReinforcement gestionFastReinforcement,String name, String tel, String mail, int idEntreprise, String localisation,Categories categorie) {
		super(name,tel,mail);
		this.idEntreprise = idEntreprise;
		this.localisation = localisation;
		this.categories = categorie;
		this.gestionFastReinforcement = gestionFastReinforcement;
	}

	public int getIdEntreprise() {
		return idEntreprise;
	}

	public void setIdEntreprise(int idEntreprise) {
		this.idEntreprise = idEntreprise;
	}

	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public Categories getCategories() {
		return categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}
	
}
