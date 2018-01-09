/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.sonatel.formation.junit.service;

import java.util.Map;
import sn.sonatel.formation.junit.repository.Lampe;

/**
 *
 * @author ndiaye028446
 */
public interface LampeService {

     public String ajouterServiceLampe(Lampe lampe);

    public String modifierServiceLampe(Lampe lampe);

    public void listerServiceLampe(Map<String, Lampe> lampe);

}
