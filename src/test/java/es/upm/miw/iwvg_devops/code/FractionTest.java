package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {
    private Fraction fraction;

    @BeforeEach
    void initializeFraction(){
        fraction = new Fraction(2, 5);
    }

    @Test
    void getNumerator(){
        assertEquals(2, fraction.getNumerator());
    }

    @Test
    void setNumerator(){
        fraction.setNumerator(3);
        assertEquals(3, fraction.getNumerator());
    }

    @Test
    void getDenominator(){
        assertEquals(5, fraction.getDenominator());
    }

    @Test
    void setDenominator(){
        fraction.setDenominator(6);
        assertEquals(6, fraction.getDenominator());
    }

    @Test
    void decimal(){
        assertEquals(0.4, fraction.decimal());
    }

    @Test
    void toStringTest(){
        assertEquals("Fraction{numerator=2, denominator=5}", fraction.toString());
    }


    @Test
    void isProper(){

    }

}
