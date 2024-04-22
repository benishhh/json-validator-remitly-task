package com.remitly.application;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class PolicyDocument {
    @JsonProperty("Version")
    private String version;

    @JsonProperty("Statement")
    private List<Statement> statements;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }
}
