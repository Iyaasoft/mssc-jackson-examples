package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("kebab")
@JsonTest
class BeerDtoTest extends BeerBaseTest {

    @Autowired
    ObjectMapper mapper;

    @Test
    public void testBeerDtoMapping() throws Exception {

        String json = mapper.writeValueAsString(getBeerDto());

        System.out.println(json);
    }


}