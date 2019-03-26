package com.mapr.chicos.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "loyalty_type_code",
        "loyalty_type_desc"
})
public class LoyaltyType {

    @JsonProperty("loyalty_type_code")
    private String loyaltyTypeCode;
    @JsonProperty("loyalty_type_desc")
    private String loyaltyTypeDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("loyalty_type_code")
    public String getLoyaltyTypeCode() {
        return loyaltyTypeCode;
    }

    @JsonProperty("loyalty_type_code")
    public void setLoyaltyTypeCode(String loyaltyTypeCode) {
        this.loyaltyTypeCode = loyaltyTypeCode;
    }

    @JsonProperty("loyalty_type_desc")
    public String getLoyaltyTypeDesc() {
        return loyaltyTypeDesc;
    }

    @JsonProperty("loyalty_type_desc")
    public void setLoyaltyTypeDesc(String loyaltyTypeDesc) {
        this.loyaltyTypeDesc = loyaltyTypeDesc;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}