package edu.utfpr.cp.dacom.sa.soilcorrection.conversões.conversõesKgHa;

import edu.utfpr.cp.dacom.sa.soilcorrection.conversões.Conversao;
import lombok.NonNull;

public class ConverteKgHaEmP2O5 implements Conversao<Double, Double> {

    @Override
    public Double converte(@NonNull Double valor) {

        return valor * 2.29;
    }
}
