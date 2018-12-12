/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin13;

/**
 *
 * @author oracle
 */
public class Boletin13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Xogador obxx = new Xogador();
        Adestrador obxa = new Adestrador();
        Masaxista obxm = new Masaxista();
        
        obxx.concentrarse();
        obxa.concentrarse();
        obxm.concentrarse();
        
        obxx.viajar();
        obxa.viajar();
        obxm.viajar();
        
        
    }
    
}
