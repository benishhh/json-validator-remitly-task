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
        boolean result = validator.validateResource(filePath);
        assertFalse(result, "The resource contains an asterisk, should return false.");
        System.out.println("testResourceWithAsterisk passed. Expected false, got " + result);
    }

    @Test
    void testResourceWithValidValue() throws Exception {
        String filePath = basePath + "jsonWithValidValue.json";
        boolean result = validator.validateResource(filePath);
        assertTrue(result, "The resource does not contain an asterisk, should return true.");
        System.out.println("testResourceWithValidValue passed. Expected true, got " + result);
    }

    @Test
    void testMissingResourceField() {
        String filePath = basePath + "jsonMissingResource.json";
        assertThrows(IOException.class, () -> {
            validator.validateResource(filePath);
        }, "Missing 'Resource' field should throw IOException.");
        System.out.println("testMissingResourceField passed. Expected IOException.");
    }

    @Test
    void testInvalidJsonFormat() {
        String filePath = basePath + "invalidJsonFormat.json";
        assertThrows(IOException.class, () -> {
            validator.validateResource(filePath);
        }, "Invalid JSON format should throw IOException.");
        System.out.println("testInvalidJsonFormat passed. Expected IOException.");
    }
}
