package com.js.jsfunction.decimal;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
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
    @DisplayName("should add two big decimal number")
    void shouldAddTwoBigDecimalNumber() {
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
    @Test
    @DisplayName("should subtract two big decimal number")
    void shouldSubtractTwoBigDecimalNumber() {
        //given
        DecimalInit decimalInit = new DecimalInit();
        BigDecimal x = new BigDecimal("5554355633333454556.556777888655");
        BigDecimal y = new BigDecimal("4442732535333454556.77777654777888655");

        //when
        BigDecimal subtractTwoBigDecimalNumber = decimalInit.subtractTwoBigDecimalNumber(x, y);
        String engineeringString = subtractTwoBigDecimalNumber.toEngineeringString();
        log.warn("Number to substract X: " + x);
        log.warn("Number to substract Y: " + y);

        log.info("Subtract = " + engineeringString);

        BigDecimal subtractTwoBigDecimalNumber2 = decimalInit.subtractTwoBigDecimalNumber(x, y);
        String engineeringString2 = subtractTwoBigDecimalNumber2.toEngineeringString();

        //then
        assertEquals("1111623097999999999.77900134087611345",engineeringString);
        assertThat(engineeringString.endsWith("1345")).as("Ends with number on result subtract").isEqualTo(engineeringString2.endsWith("1345"));
    }
}
