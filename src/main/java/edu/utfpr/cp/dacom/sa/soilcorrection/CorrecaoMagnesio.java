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
public class CorrecaoMagnesio {
    public double somaKCaMg(double potassio, double calcio, double magnesio){
        return(potassio+calcio+magnesio);
    }
    
    public String PegarMgIdeal(int txtSolo) {
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
    
    public double CalcCorrecao(double MgIdeal, double somaKCaMg, double Hal) {
       return (MgIdeal/(somaKCaMg+Hal)*100);
    }    
}
