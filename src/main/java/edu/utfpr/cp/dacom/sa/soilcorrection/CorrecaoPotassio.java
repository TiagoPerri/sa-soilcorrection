package edu.utfpr.cp.dacom.sa.soilcorrection;

import lombok.NonNull;

public class CorrecaoPotassio
        implements 
            ICorrecaoNutriente<FontePotassio>,
            ICorrecaoNutrienteQuantidadeAplicar<FontePotassio> {

    public double calculaNecessidadeAdicionarCMolcDm3 (
        @NonNull double teorSolo,
        @NonNull double participacaoCTCExistente,
        @NonNull double participacaoCTCDesejada) {

            return (teorSolo 
                    * participacaoCTCDesejada 
                    / participacaoCTCExistente) 
                    - teorSolo;
    }
}
