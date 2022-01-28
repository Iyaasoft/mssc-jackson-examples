package guru.springframework.msscjacksonexamples.model;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@JsonTest
class BeerDtoDefaultCaseTest extends BeerBaseTest {

    @Test
    public void testBeerDtoMapping() throws Exception {

        String json = mapper.writeValueAsString(getBeerDto());

        System.out.println(json);
    }


}