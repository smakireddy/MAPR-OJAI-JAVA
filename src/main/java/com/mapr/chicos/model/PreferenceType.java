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
        "preference_type_code",
        "preference_type_desc"
})
public class PreferenceType {

    @JsonProperty("preference_type_code")
    private String preferenceTypeCode;
    @JsonProperty("preference_type_desc")
    private String preferenceTypeDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("preference_type_code")
    public String getPreferenceTypeCode() {
        return preferenceTypeCode;
    }

    @JsonProperty("preference_type_code")
    public void setPreferenceTypeCode(String preferenceTypeCode) {
        this.preferenceTypeCode = preferenceTypeCode;
    }

    @JsonProperty("preference_type_desc")
    public String getPreferenceTypeDesc() {
        return preferenceTypeDesc;
    }

    @JsonProperty("preference_type_desc")
    public void setPreferenceTypeDesc(String preferenceTypeDesc) {
        this.preferenceTypeDesc = preferenceTypeDesc;
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