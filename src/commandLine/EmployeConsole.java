package commandLine;

import commandLineMenus.*;
import static commandLineMenus.rendering.examples.util.InOut.*;


import commandLineMenus.List;
import commandLineMenus.Menu;
import commandLineMenus.Option;

import projet.Employe;
import projet.GestionFastReinforcement;
import projet.SauvegardeImpossible;

public class EmployeConsole {
	private GestionFastReinforcement gestionFastReinforcement;
	
	
	Menu employeConsole()  {
		Menu menu = new Menu("Gérer les employés", "e");
		menu.add(afficherEmployes());
		menu.add(ajouterEmploye());
		//menu.add(selectionnerEmploye());
		menu.addBack("q");		
		return menu;
		
	}
	
	private Option afficherEmployes() {
		return new Option("Afficher les employés","e",()->{System.out.println(gestionFastReinforcement.getEmployes());});
	}
	
	private Option ajouterEmploye()   {
		return new Option("Ajouter un employé","a",()->
		{
			gestionFastReinforcement.addEmploye(getString("renseignez votre nom: "), getString("renseignez votre telephone: "), getString("renseignez votre mail: "), 0, 0, 0);
		});
	}
	
	/*private List<Employe> selectionnerEmploye(){
		return new List<Employe>( "Sélectionner un employé","s",
				() -> new ArrayList<>(gestionFastReinforcement.getEmployes()),
				(ele)-> editerEmploye(element_value));
				 
	}
	
	private Menu editerEmploye(Employe employe) {
		Menu menu = new Menu("Editer "+ employe.getName());
		menu.add(modifierExperience(employe));
		menu.add(modifierScoreDifficulte(employe));
		menu.add(modifierTechnologie(employe));
		menu.addBack("q");
		return menu;
	}*/
	
	
}
