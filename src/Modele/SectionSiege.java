package Modele;

import ModeleImplementation.Siege;

/**
 * Created by Azadeh on 09/04/2017.
 */
public class SectionSiege extends Section {

    String[] lettre = {"A", "B", "C", "D", "E", "F", "G", "H","I","J"};

    public SectionSiege(double ratio, String description, String type) {
        super(ratio, description, type);
    }

    @Override
    public void creerUnites() {
        int nbR = getDisposition().getNbRangees();
        int nbC = getDisposition().getNbColonnes();
        String type = getType();
        for (int i =0 ; i<nbR; i++){
            for (int j = 0; j<nbC; j++){
                Unite unite = new Siege(type,i+1,lettre[j]);
                super.addUnites(unite);
            }
        }

    }
}
