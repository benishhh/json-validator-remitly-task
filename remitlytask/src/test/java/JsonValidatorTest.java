import com.remitly.validator.JsonValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;


public class JsonValidatorTest {
    private JsonValidator validator;
    private final String basePath = "src/test/resources/";

    @BeforeEach
    void setUp() {
        validator = new JsonValidator();
    }

    @Test
    void testResourceWithAsterisk() throws Exception {
        String filePath = basePath + "jsonWithAsterisk.json";
        assertFalse(validator.validateResource(filePath));
    }

    @Test
    void testResourceWithValidValue() throws Exception {
        String filePath = basePath + "jsonWithValidValue.json";
        assertTrue(validator.validateResource(filePath));
    }

    @Test
    void testMissingResourceField() {
        String filePath = basePath + "jsonMissingResource.json";
        assertThrows(IOException.class, () -> {
            validator.validateResource(filePath);
        });
    }

    @Test
    void testInvalidJsonFormat() {
        String filePath = basePath + "invalidJsonFormat.json";
        assertThrows(IOException.class, () -> {
            validator.validateResource(filePath);
        });
    }
}
