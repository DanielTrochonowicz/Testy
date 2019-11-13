package testy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;

public class TestowanieTest {

    Testowanie testowanie = new Testowanie();

    @Test
    void testDodawanie(){
        int x = 2;
        int y = 2;
        assertEquals(4, testowanie.dodawanie(x, y));
    }

    @Test
    void sprawdzZakresTrue() {
        int min = 3;
        int max = 7;
        int liczba = 4;
        assertTrue(testowanie.sprawdzZakres(min, max, liczba));
    }

    
    @Test
    void sprawdzZakresFalse() {
        int min = 3;
        int max = 7;
        int liczba = 2;
        
        assertFalse(testowanie.sprawdzZakres(min, max, liczba));
    }
    
    @Test
    @Disabled
    void sprawdzZakresFalse2() {
        int min = 3;
        int max = 7;
        int liczba = 9;
        assertFalse(testowanie.sprawdzZakres(min, max, liczba));
    }
}
