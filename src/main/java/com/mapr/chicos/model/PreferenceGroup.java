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
        "preference_group_code",
        "preference_group_desc"
})
public class PreferenceGroup {

    @JsonProperty("preference_group_code")
    private String preferenceGroupCode;
    @JsonProperty("preference_group_desc")
    private String preferenceGroupDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("preference_group_code")
    public String getPreferenceGroupCode() {
        return preferenceGroupCode;
    }

    @JsonProperty("preference_group_code")
    public void setPreferenceGroupCode(String preferenceGroupCode) {
        this.preferenceGroupCode = preferenceGroupCode;
    }

    @JsonProperty("preference_group_desc")
    public String getPreferenceGroupDesc() {
        return preferenceGroupDesc;
    }

    @JsonProperty("preference_group_desc")
    public void setPreferenceGroupDesc(String preferenceGroupDesc) {
        this.preferenceGroupDesc = preferenceGroupDesc;
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