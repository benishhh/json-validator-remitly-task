package com.remitly.application;
import com.fasterxml.jackson.annotation.JsonProperty;
public class Policy {

        @JsonProperty("PolicyName")
        private String policyName;

        @JsonProperty("PolicyDocument")
        private PolicyDocument policyDocument;

        public String getPolicyName() {
                return policyName;
        }

        public void setPolicyName(String policyName) {
                this.policyName = policyName;
        }

        public PolicyDocument getPolicyDocument() {
                return policyDocument;
        }

        public void setPolicyDocument(PolicyDocument policyDocument) {
                this.policyDocument = policyDocument;
        }
}
