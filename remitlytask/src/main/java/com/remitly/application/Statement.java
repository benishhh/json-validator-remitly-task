package com.remitly.application;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Statement {
    @JsonProperty("Sid")
    private String sid;

    @JsonProperty("Effect")
    private String effect;

    @JsonProperty("Action")
    private List<String> actions;

    @JsonProperty("Resource")
    private String resource;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }
}
