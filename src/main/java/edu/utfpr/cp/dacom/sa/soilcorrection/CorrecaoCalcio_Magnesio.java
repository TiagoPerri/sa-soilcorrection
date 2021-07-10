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

public class CorrecaoCalcio_Magnesio {
    
    public double somaPotassioCalcioMagnesio(double potassio, double calcio, double magnesio){
        return(potassio+calcio+magnesio);
    }
    
    public String PegarMagnesioIdeal(int txtSolo) {
        if ((txtSolo <=2)||(txtSolo >=1)){
            if(txtSolo == 1){
                return "10 a 15";
            }else if(txtSolo == 2){
                return "8 a 12";
            } else {
                return null;
            }
        }
        else{
        return null;
        }
    }
    
    public double CalcCorrecaoMagnesio(double MagnesioIdeal, double somaPotassioCalcioMagnesio, double Hal) {
       return (MagnesioIdeal/(somaPotassioCalcioMagnesio+Hal)*100);
    }    
     
    String PegarCalcioIdeal(int txtSolo){
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
      double CalcCorrecaoCalcio(double Calcio, double Hal,double somaPotassioCalcioMagnesio) {
        return (Calcio/(somaPotassioCalcioMagnesio*100));
    }
      
}
