package Voyages;

import java.util.ArrayList;
import java.util.List;

import Modele.Vehicule;

public class VerificationVoyage implements Visiteur {


    public List<String> Visite(Voyage v) {
    	List<String> ListeInformation= new ArrayList<String>();
    	ListeInformation.add(v.getLieuDepart().getNom());
    	ListeInformation.add(v.getLieuDarrivee().getNom());
    	ListeInformation.add(v.getCie().getIdVoyagePrefix());
    	ListeInformation.add(v.getVehicule().getNomModel());
    	ListeInformation.add(v.getHeureDepart().toString());
    	ListeInformation.add(v.getHeureArrivee().toString());
    	
    	return ListeInformation;
    }
    
    
    public List<String> Visite(Voyage v, String section)
    {
    	List<String> ListeInformation= new ArrayList<String>();
    	int nbTotal=v.nbUniteesSection(section);
    	int nbOccupe=v.nbUniteesSection(section)-v.nbUniteesDispo(section);
    	double cout=v.uniteeDisponible(section).get(0).getPrix();
    	ListeInformation.add(Integer.toString(nbOccupe));
    	ListeInformation.add(Integer.toString(nbTotal));
    	ListeInformation.add(Double.toString(cout));
    	return ListeInformation;
    	
    }
    
    public List<String> Visite(Compagnie c) {
    	List<String> ListeInformation= new ArrayList<String>();
    	ListeInformation.add(c.getIdVoyagePrefix());
    	
    	return ListeInformation;
    }

    public List<String> Visite(DetailsVoyage d) {
    	List<String> ListeInformation= new ArrayList<String>();
    
    	return ListeInformation;
    }


    public List<String> Visite(UniteParVoyage u) {
    	List<String> ListeInformation= new ArrayList<String>();
    
    	
    	
    	
    	return ListeInformation; 
    }

	public List<String> Visite(Vehicule u) {
		List<String> ListeInformation= new ArrayList<String>();
		//ListeInformation.add(u.getNomModel());
		for (int i=0; i<u.getSections().size();i++)
		{
			ListeInformation.add(u.getSections().get(i).getType());
		}
		
		
		return ListeInformation ;
	}
}