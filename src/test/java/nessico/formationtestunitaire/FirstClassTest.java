/*
 * To change this license header, choose License Headers in Project Properties. 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nessico.formationtestunitaire;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author ndiaye028446
 */
public class FirstClassTest {
    
    @Test
    public void shoudReturn20(){
        int valeurDeRetour=40/5;
        assertEquals(8,valeurDeRetour);
    }
}
