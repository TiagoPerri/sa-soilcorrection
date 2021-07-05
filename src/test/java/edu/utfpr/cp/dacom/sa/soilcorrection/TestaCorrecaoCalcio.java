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
public class TestaCorrecaoCalcio {
    
      @Test
    public void testaCorrecaoCalcio() {
        double somaKCaMg = new CorrecaoCalcio().somaKCaMg(0.11, 5.72, 1.59);
        assertEquals(13.84, new CorrecaoCalcio().PartAtualCa(1.75,somaKCaMg,5.31));
    }
    
    @Test
    public void testaCorrecaoCalcio() {
        double somaKCaMg = new CorrecaoCalcio().somaKCaMg(0.11, 5.60, 1.47);
        assertEquals(13.72, new CorrecaoCalcio().PartAtualCa(1.63,somaKCaMg,5.19));
    }
    
    @Test
    public void testaCorrecaoCalcio() {
        double somaKCaMg = new CorrecaoCalcio().somaKCaMg(0.01, 5.62, 1.49);
        assertEquals(13.74, new CorrecaoCalcio().PartAtualCa(1.65,somaKCaMg,5.21));
    }
    
}
