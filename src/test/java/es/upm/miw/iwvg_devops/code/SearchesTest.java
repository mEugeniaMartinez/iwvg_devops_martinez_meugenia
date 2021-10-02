package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchesTest {

    @Test
    void findUserFamilyNameInitialBySomeProperFraction() {
        assertEquals(List.of("F.", "B.", "L.", "B."), new Searches().
                findUserFamilyNameInitialBySomeProperFraction()
                .collect(Collectors.toList()));
    }

    @Test
    void findFractionSubtractionByUserName() {
        assertEquals(new Fraction(11, 30).getNumerator(),
                new Searches().findFractionSubtractionByUserName("Ana").getNumerator());
        assertEquals(new Fraction(11, 30).getDenominator(),
                new Searches().findFractionSubtractionByUserName("Ana").getDenominator());
    }

    @Test
    void findUserIdByAllProperFraction() {
        assertEquals(List.of(), new Searches().findUserIdByAllProperFraction()
                .collect(Collectors.toList()));
    }

    @Test
    void testFindDecimalFractionByNegativeSignFraction() {
        assertEquals(List.of(-0.2, -0.5, -0.0), new Searches()
                .findDecimalFractionByNegativeSignFraction()
                .collect(Collectors.toList()));
    }
}
