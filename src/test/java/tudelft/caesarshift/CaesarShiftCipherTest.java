package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {

    @ParameterizedTest
    @CsvSource({"a a,1,b b",
            "a,1,b",
            "a,2,c",
            "a,27,b",
            "a,0,a",
            "a a,0,a a",
            "a,-1,z"})
    void testCypher(String input, int shift, String expected){
        final String output = new CaesarShiftCipher().CaesarShiftCipher(input, shift);
        Assertions.assertEquals(expected, output);
    }
}
