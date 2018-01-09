/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.sonatel.formation.junit;

import java.util.Map;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sn.sonatel.formation.junit.repository.Etat;
import sn.sonatel.formation.junit.repository.Lampe;
import sn.sonatel.formation.junit.service.LampeService;
import sn.sonatel.formation.junit.service.LampeServiceImpl;

/**
 *
 * @author ndiaye028446
 */
public class LampeTest {

    LampeService lampeService;
    Map<String, Lampe> lampe;
    String id;
    String emplacement;
    Etat etat;

    @Before
    public void beforeInstance() {
        id = "1";
        emplacement = "Chambre";
        etat = Etat.ON;
        lampeService = new LampeServiceImpl(lampe, id, emplacement, Etat.ON);
    }

    @Test(expected = NullPointerException.class)
    public void testIdLampeSiNull() {
        Lampe lampe = null;
        Assert.assertNull("L'id est pas nulle", lampe.getId() == null);
    }

    @Test
    public void testIdLampeNoNull() {
        Lampe lampe = new Lampe("2", "Salon", Etat.OFF);
        Assert.assertNotNull("L'id n'est pas nulle", lampe.getId() != null);
    }

    @Test(expected = NullPointerException.class)
    public void testEmplacementLampeSiNull() {
        Lampe lampe = null;
        Assert.assertNull("L'id est pas nulle", lampe.getEmplacement() == null);
    }

    @Test
    public void testEmplacementLampeNoNull() {
        Lampe lampe = new Lampe("2", "Salon", Etat.OFF);
        Assert.assertNotNull("L'id n'est pas nulle", lampe.getEmplacement() != null);
    }

    @Test(expected = NullPointerException.class)
    public void testEtatLampeSiNull() {
        Lampe lampe = null;
        Assert.assertNull("L'id est pas nulle", lampe.getEtat() == null);
    }

    @Test
    public void testEtatLampeNoNull() {
        Lampe lampe = new Lampe("2", "Salon", Etat.OFF);
        Assert.assertNotNull("L'id n'est pas nulle", lampe.getEtat() != null);
    }

    @After
    public void afterInstance() {
        lampeService = null;
    }
}
