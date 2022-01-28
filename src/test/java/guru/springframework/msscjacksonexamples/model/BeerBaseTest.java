package guru.springframework.msscjacksonexamples.model;

import java.math.BigDecimal;
import java.util.UUID;

public class BeerBaseTest {

    public BeerDto getBeerDto() {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Red Stripe")
                .beerStyle("Larger")
                .upc(12987630L)
                .price(new BigDecimal(5.00))
                .build();
    }
}
