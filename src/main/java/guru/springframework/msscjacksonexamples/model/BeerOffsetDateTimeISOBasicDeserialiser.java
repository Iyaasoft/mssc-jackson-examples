package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class BeerOffsetDateTimeISOBasicDeserialiser extends StdDeserializer<OffsetDateTime> {

    public BeerOffsetDateTimeISOBasicDeserialiser() {
        super(OffsetDateTime.class);
    }

    @Override
    public OffsetDateTime deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        return OffsetDateTime.parse(p.readValueAs(String.class), DateTimeFormatter.ISO_OFFSET_DATE);// DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
}
