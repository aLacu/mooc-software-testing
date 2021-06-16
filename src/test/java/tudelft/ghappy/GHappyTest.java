package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {

    @ParameterizedTest
    @CsvSource({"\"\",true",
            "g,false",
            "gg,true",
            "gxg,false",
            "ggxg,false",
            "ggg,true",
            "x,true"})
    public void testGHappy(String line, boolean expected){
        final boolean b = new GHappy().gHappy(line);
        Assertions.assertEquals(expected, b);
    }
}
