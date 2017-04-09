package ModeleImplementation;

import Modele.*;

public class Train extends Vehicule {
    public Train(String id, String nomModel) {
        super(id, nomModel);
    }

    /**
     *
     * @param type F, E
     * @return
     */
    @Override
    public void creerSection(String type, String typeDispo, int nbRangees) {
        Section section;
        if(type.equals("F")){
            section = new Premiere();
        }else{
            section = new Economique();
        }
        Disposition dispo = new Etroit(nbRangees);
        section.setDisposition(dispo);
        section.creerUnites();
        super.addSection(section);
    }

}