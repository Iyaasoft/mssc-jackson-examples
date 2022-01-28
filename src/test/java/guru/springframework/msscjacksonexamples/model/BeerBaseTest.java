package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.UUID;

public class BeerBaseTest {

    @Autowired
    protected ObjectMapper mapper;

    protected BeerDto getBeerDto() {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Red Stripe")
                .beerStyle("Larger")
                .upc(12987630L)
                .price(new BigDecimal(5.00))
                .build();
    }
}
