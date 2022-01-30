package guru.springframework.msscjacksonexamples.model;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@JsonTest
class BeerDtoDefaultCaseTest extends BeerBaseTest {

    @Test
    public void testBeerDtoToJsonStringMapping() throws Exception {

        String json = mapper.writeValueAsString(getBeerDto());

        System.out.println(json);
    }

    @Test
    public void testJsonStringToBeerDtoMapping() throws Exception {

        BeerDto beerDto = mapper.readValue("{\"id\":\"afbe5855-5149-41ec-8f5b-39550558c77e\",\"beerName\":\"Red Stripe\",\"beerStyle\":\"Larger\",\"upc\":12987630,\"price\":\"5\","
                + "\"createdDate\":\"2022-01-26T16:08:37.733756Z\",\"lastUpdatedDate\":\"2022-01-28T16:08:37.733756Z\",\"date\":\"2022-01-28\"}\n",BeerDto.class);

        System.out.println(beerDto);
    }


}