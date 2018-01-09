/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.sonatel.formation.junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sn.sonatel.formation.junit.impl.PromoCalculatorServiceImpl;
import sn.sonatel.formation.junit.interfaces.PromoCalculatorService;

/**
 *
 * @author ndiaye028446
 */
public class PromoBusinessTest {

    static PromoCalculatorService promotionBusinessInterface;

    @Before
    public void instance() {
        promotionBusinessInterface = new PromoCalculatorServiceImpl();
    }

    @Test
    public void testPromoByCategorieEtProduitNull() {
        Assert.assertTrue("Le nom du produit est vide ou bien le prix est égal à zéro", promotionBusinessInterface.calculerRemisePromotionByCategory(null, 0) == 0);
    }

    @Test
    public void testPromoByCategorieVide() {
        Assert.assertTrue("Le nom du produit est vide ou bien le prix est égal à zéro", promotionBusinessInterface.calculerRemisePromotionByCategory("", 600) == 0);
    }

}
