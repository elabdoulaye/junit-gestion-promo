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
public class LampeServiceImpl implements LampeService {

    LampeRepository lampeRepository;
    Map<String, Lampe> lampe;
    String id;
    String emplacement;
    Etat etat;

    public LampeServiceImpl(Map<String, Lampe> lampe, String id, String emplacement, Etat etat) {
        this.lampe = lampe;
        this.id = id;
        this.emplacement = emplacement;
        this.etat = etat;
        lampeRepository = new LampeRepositoryImpl(lampe, id, emplacement, etat);
    }

    @Override
    public String ajouterServiceLampe(Lampe lampe) {
        return lampeRepository.ajouterLampe(lampe);
    }

    @Override
    public String modifierServiceLampe(Lampe lampe) {
        return lampeRepository.modifierLampe(lampe);
    }

    @Override
    public void listerServiceLampe(Map<String, Lampe> lampe) {
        lampeRepository.listerLampe(lampe);
    }

    public void allumerLampe(Lampe lampe) {
        if (lampe == null) {
            throw new IllegalArgumentException("la propriété lampe ne peut pas être nulle");
        }
        if (!lampe.getEtat().equals(Etat.ON)) {
            modifierServiceLampe(lampe);
        } else {
            ajouterServiceLampe(lampe);
        }
    }
}
