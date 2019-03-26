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
        "campaign_sk",
        "campaign_nm",
        "campaign_type",
        "campaign_start_date",
        "campaign_end_date",
        "date_last_modified"
})
public class Campaign {

    @JsonProperty("campaign_sk")
    private Object campaignSk;
    @JsonProperty("campaign_nm")
    private Object campaignNm;
    @JsonProperty("campaign_type")
    private Object campaignType;
    @JsonProperty("campaign_start_date")
    private Object campaignStartDate;
    @JsonProperty("campaign_end_date")
    private Object campaignEndDate;
    @JsonProperty("date_last_modified")
    private Object dateLastModified;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("campaign_sk")
    public Object getCampaignSk() {
        return campaignSk;
    }

    @JsonProperty("campaign_sk")
    public void setCampaignSk(Object campaignSk) {
        this.campaignSk = campaignSk;
    }

    @JsonProperty("campaign_nm")
    public Object getCampaignNm() {
        return campaignNm;
    }

    @JsonProperty("campaign_nm")
    public void setCampaignNm(Object campaignNm) {
        this.campaignNm = campaignNm;
    }

    @JsonProperty("campaign_type")
    public Object getCampaignType() {
        return campaignType;
    }

    @JsonProperty("campaign_type")
    public void setCampaignType(Object campaignType) {
        this.campaignType = campaignType;
    }

    @JsonProperty("campaign_start_date")
    public Object getCampaignStartDate() {
        return campaignStartDate;
    }

    @JsonProperty("campaign_start_date")
    public void setCampaignStartDate(Object campaignStartDate) {
        this.campaignStartDate = campaignStartDate;
    }

    @JsonProperty("campaign_end_date")
    public Object getCampaignEndDate() {
        return campaignEndDate;
    }

    @JsonProperty("campaign_end_date")
    public void setCampaignEndDate(Object campaignEndDate) {
        this.campaignEndDate = campaignEndDate;
    }

    @JsonProperty("date_last_modified")
    public Object getDateLastModified() {
        return dateLastModified;
    }

    @JsonProperty("date_last_modified")
    public void setDateLastModified(Object dateLastModified) {
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