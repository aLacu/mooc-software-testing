package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MirrorTest {

    @ParameterizedTest
    @CsvSource(
            {
                    "abXYZba,ab",
                    "abca,a",
                    "aba,aba",
                    "abba,ab",
                    "abc,",
                    "a,a",
                    "aa,a"
            }
    )
    void testMirror(String input, String expected){
        if(expected==null)
            expected="";
        final String s = new Mirror().mirrorEnds(input);
        Assertions.assertEquals(expected, s);
    }
}
