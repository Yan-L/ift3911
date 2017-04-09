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
    public Section creerSection(String type) {
        Section section;
        if(type.equals("F")){
            section = new Premiere();
        }else{
            section = new Economique();
        }
        return section;
    }

    @Override
    public void creerDisposition(String type, int nbRangees) {

    }
}