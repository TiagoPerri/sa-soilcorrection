package edu.utfpr.cp.dacom.sa.soilcorrection.conversões;

import lombok.NonNull;

public class ConverteKgHaEmK2O
        implements Conversao<Double, Double> {

    @Override
    public Double converte(@NonNull Double valor) {

        return valor * 1.2;
    }
}
