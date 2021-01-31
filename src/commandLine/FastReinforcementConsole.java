package commandLine;

import commandLine.EmployeConsole;
import commandLineMenus.*;
import projet.GestionFastReinforcement;
import projet.SauvegardeImpossible;


public class FastReinforcementConsole {
	private static GestionFastReinforcement gestionFastReinforcement;
	static EmployeConsole employeConsole;
	static MissionConsole missionConsole;
	static EntrepriseConsole entrepriseConsole;
	
	
	public FastReinforcementConsole(GestionFastReinforcement gestionFastReinforcement)
	{
		this.gestionFastReinforcement = gestionFastReinforcement;
		this.employeConsole = new EmployeConsole();
		this.missionConsole = new MissionConsole();
		this.entrepriseConsole = new EntrepriseConsole();	 
	}
	
	private static  void start() {
		menuPrincipal().start();
		
	}

	
	private static  Menu menuPrincipal() {
		Menu menu = new Menu("Bienvenue sur FastReinforcement");
		menu.add(employeConsole.employeConsole());
		//menu.add(missionConsole.menuMission());
		//menu.add(entrepriseConsole.menuEntreprise());
		menu.add(quitterEtEnregistrer());
		menu.add(quitterSansEnregistrer());
		return menu;
	}
	
	private static Option quitterEtEnregistrer()
	{
		return new Option("Quitter et enregistrer", "q", 
				() -> 
				{
					try
					{
						gestionFastReinforcement.sauvegarder();
						Action.QUIT.optionSelected();
					} 
					catch (SauvegardeImpossible e)
					{
						System.out.println("Impossible d'effectuer la sauvegarde");
					}
				}
		);
	}
	
	private static Option quitterSansEnregistrer() {
		return new Option("Quitter sans enregistrer ", "a", Action.QUIT);
	}

	public static void main(String[] args) {
		//System.out.println("Coucou");
		FastReinforcementConsole fastReinforcementConsole = new FastReinforcementConsole(GestionFastReinforcement.getFastReinforcement());
		fastReinforcementConsole.start();
	}
}
