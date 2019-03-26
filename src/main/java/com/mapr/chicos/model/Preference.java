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
        "depricated_preference_id",
        "preference_type_id",
        "text_data",
        "number_data",
        "date_data",
        "reference_type",
        "reference_id",
        "date_last_modified",
        "preference_type",
        "preference_group"
})
public class Preference {

    @JsonProperty("depricated_preference_id")
    private Integer depricatedPreferenceId;
    @JsonProperty("preference_type_id")
    private Integer preferenceTypeId;
    @JsonProperty("text_data")
    private String textData;
    @JsonProperty("number_data")
    private Integer numberData;
    @JsonProperty("date_data")
    private String dateData;
    @JsonProperty("reference_type")
    private String referenceType;
    @JsonProperty("reference_id")
    private Object referenceId;
    @JsonProperty("date_last_modified")
    private String dateLastModified;
    @JsonProperty("preference_type")
    private PreferenceType preferenceType;
    @JsonProperty("preference_group")
    private PreferenceGroup preferenceGroup;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("depricated_preference_id")
    public Integer getDepricatedPreferenceId() {
        return depricatedPreferenceId;
    }

    @JsonProperty("depricated_preference_id")
    public void setDepricatedPreferenceId(Integer depricatedPreferenceId) {
        this.depricatedPreferenceId = depricatedPreferenceId;
    }

    @JsonProperty("preference_type_id")
    public Integer getPreferenceTypeId() {
        return preferenceTypeId;
    }

    @JsonProperty("preference_type_id")
    public void setPreferenceTypeId(Integer preferenceTypeId) {
        this.preferenceTypeId = preferenceTypeId;
    }

    @JsonProperty("text_data")
    public String getTextData() {
        return textData;
    }

    @JsonProperty("text_data")
    public void setTextData(String textData) {
        this.textData = textData;
    }

    @JsonProperty("number_data")
    public Integer getNumberData() {
        return numberData;
    }

    @JsonProperty("number_data")
    public void setNumberData(Integer numberData) {
        this.numberData = numberData;
    }

    @JsonProperty("date_data")
    public String getDateData() {
        return dateData;
    }

    @JsonProperty("date_data")
    public void setDateData(String dateData) {
        this.dateData = dateData;
    }

    @JsonProperty("reference_type")
    public String getReferenceType() {
        return referenceType;
    }

    @JsonProperty("reference_type")
    public void setReferenceType(String referenceType) {
        this.referenceType = referenceType;
    }

    @JsonProperty("reference_id")
    public Object getReferenceId() {
        return referenceId;
    }

    @JsonProperty("reference_id")
    public void setReferenceId(Object referenceId) {
        this.referenceId = referenceId;
    }

    @JsonProperty("date_last_modified")
    public String getDateLastModified() {
        return dateLastModified;
    }

    @JsonProperty("date_last_modified")
    public void setDateLastModified(String dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    @JsonProperty("preference_type")
    public PreferenceType getPreferenceType() {
        return preferenceType;
    }

    @JsonProperty("preference_type")
    public void setPreferenceType(PreferenceType preferenceType) {
        this.preferenceType = preferenceType;
    }

    @JsonProperty("preference_group")
    public PreferenceGroup getPreferenceGroup() {
        return preferenceGroup;
    }

    @JsonProperty("preference_group")
    public void setPreferenceGroup(PreferenceGroup preferenceGroup) {
        this.preferenceGroup = preferenceGroup;
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