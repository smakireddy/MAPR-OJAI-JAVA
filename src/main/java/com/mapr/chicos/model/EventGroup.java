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
        "event_group_code",
        "event_group_desc"
})
public class EventGroup {

    @JsonProperty("event_group_code")
    private String eventGroupCode;
    @JsonProperty("event_group_desc")
    private String eventGroupDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("event_group_code")
    public String getEventGroupCode() {
        return eventGroupCode;
    }

    @JsonProperty("event_group_code")
    public void setEventGroupCode(String eventGroupCode) {
        this.eventGroupCode = eventGroupCode;
    }

    @JsonProperty("event_group_desc")
    public String getEventGroupDesc() {
        return eventGroupDesc;
    }

    @JsonProperty("event_group_desc")
    public void setEventGroupDesc(String eventGroupDesc) {
        this.eventGroupDesc = eventGroupDesc;
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