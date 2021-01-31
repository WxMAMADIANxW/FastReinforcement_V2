package serialization;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.SQLException;

import projet.Employe;
import projet.Entreprise;
import projet.GestionFastReinforcement;
import projet.Mission;
import projet.SauvegardeImpossible;

public class Serialization implements projet.Passerelle {
	
		private static final String FILE_NAME = "persistence.ser";
		GestionFastReinforcement gestionFastReinforcement;
		
		public GestionFastReinforcement getGestionFastReinforcement()
		{
			ObjectInputStream OIS = null;
			try {
				FileInputStream FIS = new FileInputStream(FILE_NAME);
				OIS = new ObjectInputStream(FIS);
				return(GestionFastReinforcement)(OIS.readObject());
			}
				catch (IOException | ClassNotFoundException e)
				{
					return null;
				}
				finally
				{
						try
						{
							if (OIS != null)
								OIS.close();
						} 
						catch (IOException e){}
				}
		}
		
		public void sauvegarderGestionFastReinforcement(GestionFastReinforcement gestionFastReinforcement) throws SauvegardeImpossible
		{
			ObjectOutputStream OOS = null;
			try
			{
				FileOutputStream FOS = new FileOutputStream(FILE_NAME);
				OOS = new ObjectOutputStream(FOS);
				OOS.writeObject(this);
			}
			catch (IOException e)
			{
				throw new SauvegardeImpossible(e);
			}
			finally
			{
				try
				{
					if (OOS != null)
						OOS.close();
				} 
				catch (IOException e){}
			}
			
		}
		
		@Override
		public int insertMission (Mission mission) throws SauvegardeImpossible {
			// TODO Auto-generated method stub
			return -1;
		}
		
		@Override
		public int insertEntreprise(Entreprise entreprise) throws SauvegardeImpossible {
			// TODO Auto-generated method stub
			return -1;
		}
		
		@Override
		public int insertEmploye(Employe employe) throws SauvegardeImpossible {
			// TODO Auto-generated method stub
			return -1;
		}
		
		@Override
		public void updateMission (Mission mission) throws SQLException {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void updateEntreprise(Entreprise entreprise) throws SQLException {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void updateEmploye(Employe employe) throws SQLException {
			// TODO Auto-generated method stub
			
		}
		
		
		@Override
		public void removeMission (Mission mission) throws SQLException {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void removeEntreprise(Entreprise entreprise) throws SQLException {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void removeEmploye(Employe employe) throws SQLException {
			// TODO Auto-generated method stub
			
		}

		
		
		
		
		
}
