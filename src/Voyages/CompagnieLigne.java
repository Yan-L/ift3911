package Voyages;

import java.sql.Time;
import java.util.ArrayList;

public class CompagnieLigne extends Compagnie {


    public CompagnieLigne(String id, String nom, String idVoyagePrefix) {
        super(id, nom, idVoyagePrefix);
    }

    @Override
    public ArrayList<Voyage> consulteVoyages() {
        return super.getVoyages();
    }

    @Override
    public void modifier(String nom, String idVoyage) {
        super.setNom(nom);
        super.setIdVoyagePrefix(idVoyage);
    }

    @Override
    public void addVoyage(Voyage voyage, String idVoyage) {

    }

    @Override
    public void addPrice(String voyageId, double prix) {

    }

    @Override
    public void creerDetailVoyage(Time hDep, Time hArr) {

    }

    @Override
    public void addDetail(String idDetail, Voyage voyage) {

    }
}