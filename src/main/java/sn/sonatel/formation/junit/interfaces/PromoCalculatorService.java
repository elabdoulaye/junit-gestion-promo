/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.sonatel.formation.junit.interfaces;

/**
 *
 * @author ndiaye028446
 */
public interface PromoCalculatorService {

    public double caculerRemisePromotionnelByPrice(double prixProduit);

    public double calculerRemisePromotionByCategory(String nomProduit,double prixProduit);

}
