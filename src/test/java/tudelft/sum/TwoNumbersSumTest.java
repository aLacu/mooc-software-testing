package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;

public class TwoNumbersSumTest {

    @ParameterizedTest
    @CsvSource({
            "1,1,2",
            "0,1,1",
            "10,1,11",
            "1,10,11",
            "10,10,20",
            "9,1,10"
            }
    )
    void testSum(int first, int second, int expected){

        final ArrayList<Integer> integers = new TwoNumbersSum().addTwoNumbers(toArrayList(first), toArrayList(second));
        final ArrayList<Integer> expeke = toArrayList(expected);
        expeke.forEach(System.out::print);
        Assertions.assertEquals(expeke.size(),integers.size());
        for(int i=0; i<expeke.size(); i++){
            Assertions.assertEquals(expeke.get(i), integers.get(i));
        }
    }

    private ArrayList<Integer> toArrayList(int number) {
        final String s = String.valueOf(number);
        final ArrayList<Integer> integers = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            char character=s.charAt(i);
            integers.add(Integer.parseInt(""+character));
        }
        return integers;
    }
}
