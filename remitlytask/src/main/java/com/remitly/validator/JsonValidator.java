package com.remitly.validator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.remitly.application.Policy;
import com.remitly.application.Statement;

import java.io.File;
import java.io.IOException;

public class JsonValidator {
    public boolean validateResource(String jsonFilePath) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Policy policy;

        try {
            policy = mapper.readValue(new File(jsonFilePath), Policy.class);
        } catch (JsonParseException | JsonMappingException e) {
            throw new IOException("JSON parsing error: " + e.getMessage(), e);
        }

        if (policy.getPolicyDocument() == null || policy.getPolicyDocument().getStatements() == null) {
            throw new IOException("Missing 'PolicyDocument' or 'Statements' in the JSON file.");
        }

        for (Statement statement : policy.getPolicyDocument().getStatements()) {
            if (statement.getResource() == null) {
                throw new IOException("Missing 'Resource' field in a statement.");
            }
            if ("*".equals(statement.getResource())) {
                return false;
            }
        }
        return true;
    }
}
