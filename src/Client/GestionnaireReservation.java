package Client;
import Administration.GestionnaireAdministration;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Voyages.Installation;
import Voyages.UniteParVoyage;
import Voyages.VerificationVoyage;
import Voyages.Visiteur;
import Voyages.Voyage;

public class GestionnaireReservation implements ServiceReservation {

	private GestionnaireAdministration BaseDonne;
	private Visiteur visiteurObjet = new VerificationVoyage();
	public List<Voyage> verificationDisponibilite(Installation ori, Installation dest, Date date,
			String section) {
		
		List<String> ListeTexte= new ArrayList <String>();
		List<Voyage> listVoyage=BaseDonne.getVoyagesLst();
		String Affichage="";
		for(int i=0; i<listVoyage.size();i++)
		{
			if(ori==listVoyage.get(i).getLieuDarrivee() || dest==listVoyage.get(i).getLieuDarrivee())
			{
				//ici on va chercher les information au sujet du voyage soit l'installation de départ-d'arriver   
				//, la compagnie, le numéro du vol, la date de départ et d'arrivé.
				ListeTexte.addAll(listVoyage.get(i).accept(visiteurObjet));
				Affichage=ListeTexte.get(0)+"-"+ListeTexte.get(1)+":["+ListeTexte.get(2)+"]"+ListeTexte.get(3)
						+"("+ListeTexte.get(4)+"-"+ListeTexte.get(5)+")";
				ListeTexte=(listVoyage.get(i).getVehicule().accept(visiteurObjet));
				for (int j=0 ; j< ListeTexte.size();j++)
				{
					if(section==ListeTexte.get(i))
					{
						List<String> temporaire = new ArrayList<String>();
						temporaire= visiteurObjet.Visite(listVoyage.get(i),ListeTexte.get(j).toString());
						//Ici on ajoute le texte contenant le cout, la section et le nombre de place disponible
						int NbPLace = Integer.parseInt(temporaire.get(1))-Integer.parseInt(temporaire.get(0));
						Affichage+= "|"+temporaire.get(2)+"|"+ListeTexte.get(j).toString()+Integer.toString(NbPLace);
					}
				}
				
			}
			System.out.println(Affichage+"\n");
		}
		
		return null;
	}

	public void annulerReservation(String noReservation) {
		// TODO Auto-generated method stub
		
	}

	public String reserverUnitee(UniteParVoyage unitee) {
		// TODO Auto-generated method stub
		return "";
	}

	public void infoPersonnel(String noReservation, String nom, String prenom, String adresse, String courriel,
			String telephone, Date naissance, String passeport, Date exp) {
		// TODO Auto-generated method stub
		
	}

	public String paiementReservation(String noReservation, String noCarte, Date exp) {
		// TODO Auto-generated method stub
		return null;
	}

	public double modifierReservation(String noReservation, UniteParVoyage unitee) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double etatReservation(String noReservation) {
		// TODO Auto-generated method stub
		return 0;
	}
}