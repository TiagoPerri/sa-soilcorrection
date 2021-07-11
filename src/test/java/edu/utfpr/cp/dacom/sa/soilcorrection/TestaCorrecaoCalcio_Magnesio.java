/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utfpr.cp.dacom.sa.soilcorrection;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author tiago
 */
public class TestaCorrecaoCalcio_Magnesio {
    
    /**
     *
     */
    @Test
    public void TestaCorrecaoCalcio() {
        double somaPotassioCalcioMagnesio = new CorrecaoCalcio_Magnesio().somaPotassioCalcioMagnesio(0.11, 5.72, 1.59);
        assertEquals(13.84, new CorrecaoCalcio_Magnesio().CalcCorrecaoCalcio(1.75,somaPotassioCalcioMagnesio,5.31));
    }
    
    @Test
    public void testaCorrecaoMagnesio() {
        double somaPotassioCalcioMagnesio = new CorrecaoCalcio_Magnesio().somaPotassioCalcioMagnesio(0.11, 5.72, 1.59);
        assertEquals(13.84, new CorrecaoCalcio_Magnesio().CalcCorrecaoMagnesio(1.75,somaPotassioCalcioMagnesio,5.31));
    }
    
    @Test
    public void testaQtdAplicarTonHectare() { 
        assertEquals(1.8428571428571427, new CorrecaoCalcio_Magnesio().QtdAplicarTonHectare(1.29, 70.00));
    }
   
}
