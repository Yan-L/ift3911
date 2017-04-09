package ModeleImplementation;

import Modele.*;

public class Paquebot extends Vehicule {

    public Paquebot(String id, String nomModel) {
        super(id, nomModel);
    }

    /**
     *
     * @param type I, O, S, F, D
     * @param typeDispo
     * @param nbRangees
     */
    @Override
    public void creerSection(String type, String typeDispo, int nbRangees) {
        Section section;
        if(type.equals("D")){
            section = new FamilleDeluxe();
        }else if(type.equals("F")){
            section= new Famille();
        }else if(type.equals("O")){
            section = new VueOcean();
        }else{
            section = new Interieur();
        }
        section.creerUnites();
        super.addSection(section);
    }
}