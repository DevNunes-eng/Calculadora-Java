package Enumeration;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.BiFunction;

public enum OperationEnumBigDecimal {
    SOMA((BigDecimal v1,BigDecimal v2) -> v1.add(v2),"+"),
    SUBTRACAO((BigDecimal v1,BigDecimal v2) -> v1.subtract(v2),"-"),
    MULTIPLICACAO((BigDecimal v1,BigDecimal v2) -> v1.multiply(v2),"X"),
    DIVISAO((BigDecimal v1,BigDecimal v2) -> v1.divide(v2,2, RoundingMode.HALF_UP),"/");

    private final BiFunction<BigDecimal,BigDecimal,BigDecimal> calculate;
    private final String simbolo;

    OperationEnumBigDecimal(BiFunction<BigDecimal, BigDecimal, BigDecimal> calculate, String simbolo) {
        this.calculate = calculate;
        this.simbolo = simbolo;
    }

    public BiFunction<BigDecimal, BigDecimal, BigDecimal> getCalculate() {return calculate;}

    public String getSimbolo() {return simbolo;}
}

