package main.java.br.com.devnunes.classes;

import java.util.stream.LongStream;

public enum Operation {
    SOMA(lista -> LongStream.of(lista).reduce(Long::sum).orElse(0L),"+"),
    SUBTRACAO(lista -> LongStream.of(lista).reduce((long n1,long n2) -> n1 - n2 ).orElse(0L),"-"),
    MULTIPLICACAO(lista -> LongStream.of(lista).reduce((long n1,long n2) -> n1*n2).orElse(0L),"X"),
    DIVISAO(lista -> LongStream.of(lista).reduce((long n1,long n2)-> n1 / n2).orElse(0L),"/");

    private Calculate operation;
    private String simbolo;

    Operation(Calculate operation, String simbolo) {
        this.operation = operation;
        this.simbolo = simbolo;
    }

    public Calculate getOperation() {
        return operation;
    }

    public String getSimbolo() {
        return simbolo;
    }
}
