package edu.utfpr.cp.dacom.sa.soilcorrection.conversões.outrasConversões;

import edu.utfpr.cp.dacom.sa.soilcorrection.conversões.Conversao;
import lombok.NonNull;

public class ConverteCMolcDm3EmMgDm3
        implements Conversao<Double, Double> {

    @Override
    public Double converte(@NonNull Double valor) {

        return valor * 391;
    }
}
