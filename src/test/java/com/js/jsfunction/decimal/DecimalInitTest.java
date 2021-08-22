package com.js.jsfunction.decimal;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;
import java.math.BigDecimal;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class DecimalInitTest {


    @Test
    void subtractTwoBigDecimalNumber() {
        //given
        DecimalInit decimalInit = new DecimalInit();
        BigDecimal x = new BigDecimal("333333333333333454556.556777888655");
        BigDecimal y = new BigDecimal("4442123333333454556.77777654777888655");

        //when
        BigDecimal addTwoBigDecimalNumberXY = decimalInit.addTwoBigDecimalNumber(x, y);
        log.info("Sum big decimal X add Y = " + addTwoBigDecimalNumberXY.toEngineeringString());

        BigDecimal addTwoBigDecimalNumberYX = decimalInit.addTwoBigDecimalNumber(y, x);
        log.info("Sum big decimal Y add X = " + addTwoBigDecimalNumberYX.toEngineeringString());

        //then
        assertThat(addTwoBigDecimalNumberXY.intValue()).isEqualTo(addTwoBigDecimalNumberYX.intValue());
        assertEquals(addTwoBigDecimalNumberXY,addTwoBigDecimalNumberYX);

    }
}
