package by.gsu.pms.practice1;

import java.math.BigDecimal;

import static java.math.BigDecimal.ROUND_FLOOR;

public class Converter {

    public BigDecimal convert(double value, double divider, int accuracy) {
        return new BigDecimal(value/divider).setScale(accuracy, ROUND_FLOOR);
    }
}
