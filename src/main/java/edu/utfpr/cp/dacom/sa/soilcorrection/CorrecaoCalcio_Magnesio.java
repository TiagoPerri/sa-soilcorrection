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

public class CorrecaoCalcio_Magnesio implements ICorrecaoNutriente<FonteCalcioMagnesio>{
    
    public double somaPotassioCalcioMagnesio(double potassio, double calcio, double magnesio){
        return(potassio+calcio+magnesio);
    }
    
    public String PegarMagnesioIdeal(int txtSolo) {
        if ((txtSolo <=2)||(txtSolo >=1)){
            if(txtSolo == 1){
                return "10 a 15";
            }else if(txtSolo == 2){
                return "8 a 12";
            }
        }
        return null;
    }
    
    public double CalcCorrecaoMagnesio(double MagnesioIdeal, double somaPotassioCalcioMagnesio, double Hal) {
       return (MagnesioIdeal/(somaPotassioCalcioMagnesio+Hal)*100);
    }    
     
    public String PegarCalcioIdeal(int txtSolo){
       if ((txtSolo>=1)||(txtSolo<=2)){
           if(txtSolo==1){
            return "45 a 55";
           }else if(txtSolo==2){
            return "35 a 40";
           }
        }
        return null;
    }
    
    public double CalcCorrecaoCalcio(double Calcio, double Hal,double somaPotassioCalcioMagnesio) {
        return (Calcio/(somaPotassioCalcioMagnesio*100));
    }
      
    public double QtdAplicarTonHectare(double qtdCorretivo, double prneutralizantetotal){
        if(prneutralizantetotal<=0){
            return 0;
        }
        
        if(qtdCorretivo<=0){
            return 0;
        }
        
        return(qtdCorretivo*100/prneutralizantetotal);
    }
       
    public double CustoR$PorHectare(double custo, double qtdAplicar){
        if(custo<=0){
            return 0;
        }
      
        if(qtdAplicar<=0){
            return 0;
        }
        
        return(custo*qtdAplicar/1000);
    }
}
