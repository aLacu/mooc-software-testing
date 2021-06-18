package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

import java.util.Collections;

public class DiscountApplierTest {

    @ParameterizedTest
    @CsvSource({
            "name,10,HOME,9",
            "name,10,BUSINESS,11"
    })
    void testDiscount(String name, double price, String type, double expectedPrice){
        final ProductDao mock = Mockito.mock(ProductDao.class);
        final Product product = new Product(name, price, type);
        Mockito.when(mock.all()).thenReturn(Collections.singletonList(product));
        final DiscountApplier discountApplier = new DiscountApplier(mock);
        discountApplier.setNewPrices();
        Assertions.assertEquals(expectedPrice, mock.all().get(0).getPrice());
    }

}
