package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FractionTest {
    private Fraction fraction;

    @BeforeEach
    void initializeFraction() {
        fraction = new Fraction(2, 5);
    }

    @Test
    void getNumerator() {
        assertEquals(2, fraction.getNumerator());
    }

    @Test
    void setNumerator() {
        fraction.setNumerator(3);
        assertEquals(3, fraction.getNumerator());
    }

    @Test
    void getDenominator() {
        assertEquals(5, fraction.getDenominator());
    }

    @Test
    void setDenominator() {
        fraction.setDenominator(6);
        assertEquals(6, fraction.getDenominator());
    }

    @Test
    void decimal() {
        assertEquals(0.4, fraction.decimal());
    }

    @Test
    void toStringTest() {
        assertEquals("Fraction{numerator=2, denominator=5}", fraction.toString());
    }


    @Test
    void isProper() {
        assertTrue(fraction.isProper());
    }

    @Test
    void isImproper() {
        assertFalse(fraction.isImproper());
    }

    @Test
    void isEquivalent() {
        assertTrue(fraction.isEquivalent(new Fraction(4, 10)));
    }

    @Test
    void mcd() {
        assertEquals(10, fraction.mcd(20, 50));
    }

    @Test
    void simplify() {
        fraction.setNumerator(20);
        fraction.setDenominator(50);
        int simplifiedNumerator = fraction.simplify().getNumerator();
        int simplifiedDenominator = fraction.simplify().getDenominator();
        assertEquals(2, simplifiedNumerator);
        assertEquals(5, simplifiedDenominator);
    }

    @Test
    void add() {
        Fraction result = fraction.add(new Fraction(1, 3));
        assertEquals(11, result.getNumerator());
        assertEquals(15, result.getDenominator());
    }

    @Test
    void subtract() {
        Fraction result = fraction.subtract(new Fraction(1, 3));
        assertEquals(1, result.getNumerator());
        assertEquals(15, result.getDenominator());
    }

    @Test
    void multiply() {
        Fraction result = fraction.multiply(fraction);
        assertEquals(4, result.getNumerator());
        assertEquals(25, result.getDenominator());
    }

    @Test
    void divide() {
        Fraction result = fraction.divide(new Fraction(1, 3));
        assertEquals(6, result.getNumerator());
        assertEquals(5, result.getDenominator());
    }
}
