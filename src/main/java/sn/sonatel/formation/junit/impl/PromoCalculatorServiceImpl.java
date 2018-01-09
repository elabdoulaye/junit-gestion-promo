/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.sonatel.formation.junit.impl;

import sn.sonatel.formation.junit.interfaces.PromoCalculatorService;

/**
 *
 * @author ndiaye028446
 */
public class PromoCalculatorServiceImpl implements PromoCalculatorService {

    String nomProduit;
    double prixProduit;

//    public PromoCalculatorServiceImpl(String nomProduit, double prixProduit) {
//        this.nomProduit = nomProduit;
//        this.prixProduit = prixProduit;
//    }

    private double calculerRemise(double prix, double remise) {
        return prix - ((prix * remise) / 100);
    }

    @Override
    public double caculerRemisePromotionnelByPrice(double prixProduit) {
        if (prixProduit > 500) {
            prixProduit = calculerRemise(prixProduit, 2);
        }
        return prixProduit;
    }

    @Override
    public double calculerRemisePromotionByCategory(String nomProduit, double prixProduit) {
        if (nomProduit == null || nomProduit.equals("")) {
            return 0;
        } else if (prixProduit == 0) {
            return 0;
        } else if (nomProduit.startsWith("A")) {
            return caculerRemisePromotionnelByPrice(calculerRemise(prixProduit, 15));
        } else if (nomProduit.startsWith("B")) {
            return caculerRemisePromotionnelByPrice(calculerRemise(prixProduit, 5));
        }
        return prixProduit;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public double getPrixProduit() {
        return prixProduit;
    }

    public void setPrixProduit(double prixProduit) {
        this.prixProduit = prixProduit;
    }

}
