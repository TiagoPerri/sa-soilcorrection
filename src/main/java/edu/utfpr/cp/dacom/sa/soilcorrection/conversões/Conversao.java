package edu.utfpr.cp.dacom.sa.soilcorrection.conversões;

public interface Conversao<T, R> {

    public R converte(T valor);
}
