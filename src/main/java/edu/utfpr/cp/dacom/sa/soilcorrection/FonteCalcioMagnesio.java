/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utfpr.cp.dacom.sa.soilcorrection;
import java.util.Set;

/**
 *
 * @author tiago
 */
public class FonteCalcioMagnesio implements IFonteNutriente{
    
    CALCARIO_DOLOMITICO(0.304, Set.of()),
    CALCARIO_CALCITICO(0.56, Set.of()),
    CALCARIO_DE_CONCHA(0.54, Set.of()),
    GESSO_AGRICOLA(0.29, Set.of()),
    HIDROXIDO_DE_CALCIO(0.757, Set.of()),
    CALCARIO_MAGNESIANO(0.35, Set.of());
    
    private final double teorFonte;
    private final Set<NutrienteAdicional> nutrientesAdicionais;

    FonteCalcioMagnesio(
            double teorFonte,
            
            final  Set<NutrienteAdicional> nutrientesAdicionais){
            this.teorFonte = teorFonte;
            this.nutrientesAdicionais = nutrientesAdicionais;
    }
    
    
    @Override
    public double getTeorFonte(){
        return this.teorFonte;
    }
    
    @Override
    public Set<NutrienteAdicional> getNutrientesAdicionais(){
        return this.nutrientesAdicionais;
    }
     
}
