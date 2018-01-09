/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.sonatel.formation.junit.service;

import sn.sonatel.formation.junit.interfaces.PromoCalculatorService;

/**
 *
 * @author ndiaye028446
 */
public class PromotionBusiness {
PromoCalculatorService promoCalculatorService;
    public double calculateurPromo(String nomProduit, double prixProduit) {
        
        return promoCalculatorService.calculerRemisePromotionByCategory(nomProduit, prixProduit);
    }
}
