/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utfpr.cp.dacom.sa.soilcorrection;

/**
 *
 * @author tiago
 */

//Ca = Cálcio
//K = Potássio
//Mg = Magnésio
public class CorrecaoCalcio {
     
    public double somaKCaMg(double potassio, double calcio, double magnesio){
        return(potassio+calcio+magnesio);
    }
    
}
