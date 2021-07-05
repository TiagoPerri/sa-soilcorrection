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
    
    double PartAtualCa(double Ca, double Hal,double somaKCaMg) {
        return (Ca/(somaKCaMg*100));
    }
    
    String CaIdeal(int txtSolo){
       if ((txtSolo>=1)||(txtSolo<=2)){
           if(txtSolo==1){
            return "45 a 55";
           }else if(txtSolo==2){
            return "35 a 40";
           }
        }else{
            return null;
        }
        return null;
    }
    
}
