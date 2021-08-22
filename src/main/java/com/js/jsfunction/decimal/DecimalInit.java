package com.js.jsfunction.decimal;

import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * @author kamillodzinski
 */
@NoArgsConstructor
public class DecimalInit {
    private BigDecimal x;
    private BigDecimal y;

    public DecimalInit(BigDecimal x, BigDecimal y) {
        this.x = x;
        this.y = y;
    }

    /**
     * BigDecimal number entry ("33344556.88887766")
     * @param x value first Big number.
     * @param y value two Big number.
     * @return subtract BigDecimal method use x.subtract(y)
     */
    public BigDecimal subtractTwoBigDecimalNumber(BigDecimal x, BigDecimal y){
            return x.subtract(y);
    }
    /**
     * BigDecimal number entry ("33344556.88887766")
     * @param x value first Big number.
     * @param y value two Big number.
     * @return add BigDecimal method use x.add(y)
     */
    public BigDecimal addTwoBigDecimalNumber(BigDecimal x, BigDecimal y){
        return x.add(y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DecimalInit)) return false;
        DecimalInit that = (DecimalInit) o;
        return Objects.equals(x, that.x) && Objects.equals(y, that.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
