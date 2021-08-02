package edu.utfpr.cp.dacom.sa.soilcorrection;

import lombok.NonNull;

public interface ICorrecaoNutrienteQuantidadeAplicar<T extends IFonteNutriente> {
    
    public default double calculaQuantidadeAplicar(
        @NonNull double necessidade,
        T fonteNutriente) {

        return necessidade / fonteNutriente.getTeorFonte();
    }
}
