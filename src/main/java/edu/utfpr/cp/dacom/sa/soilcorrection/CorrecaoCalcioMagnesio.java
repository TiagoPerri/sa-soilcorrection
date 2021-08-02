package edu.utfpr.cp.dacom.sa.soilcorrection;

import lombok.NonNull;

public class CorrecaoCalcioMagnesio
        implements ICorrecaoNutriente<FonteCalcioMagnesio> {

    public double calculaQuantidadeAplicar(
        @NonNull double qtdeFonteAdicionar,
        @NonNull double prntPercent) {

        return qtdeFonteAdicionar / prntPercent;
    }
}
