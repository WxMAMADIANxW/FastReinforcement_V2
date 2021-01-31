package projet;


import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class Employe extends User {
	private int idEmploye;
	private SortedSet<Diplomes> diplomes;
	private SortedSet<Technologies> technologies;
	private int experience;
	private int scoreDifficulté;
	private static GestionFastReinforcement gestionFastReinforcement;
	
	
	public Employe(GestionFastReinforcement gestionFastReinforcement,String name, String tel, String mail,int idEmploye ,int experience, int scoreDifficulté){
		super(name,tel,mail);
		this.idEmploye= idEmploye;
		diplomes = new TreeSet<>();
		this.technologies = new TreeSet<>();
		this.experience = experience;
		this.scoreDifficulté = scoreDifficulté;
		this.gestionFastReinforcement = gestionFastReinforcement;
	}


	public int getIdEmploye() {
		return idEmploye;
	}


	public void setIdEmploye(int idEmploye) {
		this.idEmploye = idEmploye;
	}


	
	public SortedSet<Diplomes> getDiplomes() {

		return Collections.unmodifiableSortedSet(diplomes);	}


	public Diplomes addDiplome(Diplomes diplome) {
		diplomes.add(diplome);
		return diplome;
	}



	public SortedSet<Technologies> getTechnologie() {
		return Collections.unmodifiableSortedSet(technologies);
	}


	public Technologies addTechnologie(Technologies technologie) {
		technologies.add(technologie);
		return technologie;
	}


	public int getExperience() {
		return experience;
	}


	public void setExperience(int experience) {
		this.experience = experience;
	}


	public int getScoreDifficulté() {
		return scoreDifficulté;
	}


	public void setScoreDifficulté(int scoreDifficulté) {
		this.scoreDifficulté = scoreDifficulté;
	}
	
	public String toString() {
		return " id|"+idEmploye+" | nom"+name;
	}
	

	
}
