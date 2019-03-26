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
        "old_brand_id",
        "old_customer_no",
        "date_of_obsolescence"
})
public class Xref {

    @JsonProperty("old_brand_id")
    private Integer oldBrandId;
    @JsonProperty("old_customer_no")
    private Integer oldCustomerNo;
    @JsonProperty("date_of_obsolescence")
    private String dateOfObsolescence;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("old_brand_id")
    public Integer getOldBrandId() {
        return oldBrandId;
    }

    @JsonProperty("old_brand_id")
    public void setOldBrandId(Integer oldBrandId) {
        this.oldBrandId = oldBrandId;
    }

    @JsonProperty("old_customer_no")
    public Integer getOldCustomerNo() {
        return oldCustomerNo;
    }

    @JsonProperty("old_customer_no")
    public void setOldCustomerNo(Integer oldCustomerNo) {
        this.oldCustomerNo = oldCustomerNo;
    }

    @JsonProperty("date_of_obsolescence")
    public String getDateOfObsolescence() {
        return dateOfObsolescence;
    }

    @JsonProperty("date_of_obsolescence")
    public void setDateOfObsolescence(String dateOfObsolescence) {
        this.dateOfObsolescence = dateOfObsolescence;
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