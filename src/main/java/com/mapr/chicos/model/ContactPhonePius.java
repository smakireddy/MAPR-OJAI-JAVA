
package com.mapr.chicos.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "depricated_phone_id",
        "phone_type",
        "main",
        "opt_out",
        "phone_number",
        "date_last_modified"
})
public class ContactPhonePius {

    @JsonProperty("depricated_phone_id")
    private Integer depricatedPhoneId;
    @JsonProperty("phone_type")
    private String phoneType;
    @JsonProperty("main")
    private Boolean main;
    @JsonProperty("opt_out")
    private Boolean optOut;
    @JsonProperty("phone_number")
    private String phoneNumber;
    @JsonProperty("date_last_modified")
    private String dateLastModified;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("depricated_phone_id")
    public Integer getDepricatedPhoneId() {
        return depricatedPhoneId;
    }

    @JsonProperty("depricated_phone_id")
    public void setDepricatedPhoneId(Integer depricatedPhoneId) {
        this.depricatedPhoneId = depricatedPhoneId;
    }

    @JsonProperty("phone_type")
    public String getPhoneType() {
        return phoneType;
    }

    @JsonProperty("phone_type")
    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    @JsonProperty("main")
    public Boolean getMain() {
        return main;
    }

    @JsonProperty("main")
    public void setMain(Boolean main) {
        this.main = main;
    }

    @JsonProperty("opt_out")
    public Boolean getOptOut() {
        return optOut;
    }

    @JsonProperty("opt_out")
    public void setOptOut(Boolean optOut) {
        this.optOut = optOut;
    }

    @JsonProperty("phone_number")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("phone_number")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @JsonProperty("date_last_modified")
    public String getDateLastModified() {
        return dateLastModified;
    }

    @JsonProperty("date_last_modified")
    public void setDateLastModified(String dateLastModified) {
        this.dateLastModified = dateLastModified;
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