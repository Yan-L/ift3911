package Voyages;

import java.sql.Time;
import java.util.ArrayList;

public class CompagnieCroisiere extends Compagnie {

    public CompagnieCroisiere(String id, String nom, String idVoyagePrefix) {
        super(id, nom, idVoyagePrefix);
    }

    @Override
    public ArrayList<Voyage> consulteVoyages() {
        return null;
    }

    @Override
    public void modifier(String nom, String idVoyage) {

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