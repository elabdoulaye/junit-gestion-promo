/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.sonatel.formation.junit.service;

import java.util.Map;
import sn.sonatel.formation.junit.repository.Etat;
import sn.sonatel.formation.junit.repository.Lampe;

/**
 *
 * @author ndiaye028446
 */
public class LampeRepositoryImpl implements LampeRepository {

    Map<String, Lampe> lampe;
    String id;
    String emplacement;
    Etat etat;

    public LampeRepositoryImpl(Map<String, Lampe> lampe, String id, String emplacement, Etat etat) {
        this.lampe = lampe;
        this.id = id;
        this.emplacement = emplacement;
        this.etat = etat;
    }

    @Override
    public String ajouterLampe(Lampe lampe) {
        if (this.lampe == null || lampe == null) {
            throw new IllegalArgumentException("la propriété lampe ne peut pas être nulle");
        }
        lampe.setId(id);
        lampe.setEmplacement(emplacement);
        lampe.setEtat(etat);
        if (!this.lampe.containsKey(id)) {
            this.lampe.put(id, lampe);
            return "La lampe est ajoutée";
        }
        return "La lampe n'est pas ajoutée";
    }

    @Override
    public String modifierLampe(Lampe lampe) {
        if (lampe != null) {
            throw new IllegalArgumentException("la propriété lampe ne peut pas être nulle");
        }
        if (this.lampe != null && this.lampe.containsKey(lampe.getId())) {
            this.lampe.replace(lampe.getId(), lampe);
            return "La lampe est pas modifièe";
        }
        return "La lampe n'est pas modifièe";
    }

    @Override
    public void listerLampe(Map<String, Lampe> lampe) {
        if (lampe != null) {
            throw new IllegalArgumentException("la propriété lampe ne peut pas être nulle");
        }
        for (Map.Entry<String, Lampe> entry : lampe.entrySet()) {
            Lampe value = entry.getValue();
            System.out.println("====> Lampe => id : " + value.getId() + " , emplacement : " + value.getEmplacement() + " , Etat : " + value.getEtat().name());

        }
    }
}
