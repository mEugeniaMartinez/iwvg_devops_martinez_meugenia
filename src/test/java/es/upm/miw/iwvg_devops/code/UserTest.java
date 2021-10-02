package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {
    private User user;
    private List<Fraction> fractions;

    @BeforeEach
    void initializeUser() {
        fractions = new ArrayList<>();
        fractions.add(new Fraction(3, 6));
        fractions.add(new Fraction(10, 5));
        user = new User("id3", "Name3", "FamilyName3", fractions);
    }

    @Test
    void getId() {
        assertEquals("id3", user.getId());
    }

    @Test
    void getName() {
        assertEquals("Name3", user.getName());
    }

    @Test
    void setName() {
        user.setName("Name6");
        assertEquals("Name6", user.getName());
    }

    @Test
    void getFamilyName() {
        assertEquals("FamilyName3", user.getFamilyName());
    }

    @Test
    void setFamilyName() {
        user.setFamilyName("FamilyName6");
        assertEquals("FamilyName6", user.getFamilyName());
    }

    @Test
    void getFractions() {
        assertEquals(fractions, user.getFractions());
    }

    @Test
    void setFractions() {
        List<Fraction> newFractions = new ArrayList<>();
        newFractions.add(new Fraction(1, 4));
        newFractions.add(new Fraction(1, 5));
        user.setFractions(newFractions);
        assertEquals(newFractions, user.getFractions());
    }

    @Test
    void addFraction() {
        fractions.add(new Fraction(3, 3));
        user.addFraction(new Fraction(3, 3));
        assertEquals(fractions, user.getFractions());
    }

    @Test
    void fullName() {
        assertEquals("Name3 FamilyName3", user.fullName());
    }

    @Test
    void initials() {
        assertEquals("N.", user.initials());
    }

    @Test
    void toStringTest() {
        assertEquals("User{id='id3', name='Name3', familyName='FamilyName3'" +
                        ", fractions=[Fraction{numerator=3, denominator=6}, Fraction{numerator=10, denominator=5}]}",
                user.toString());
    }
}
