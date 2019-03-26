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
        "brand_id",
        "treatment_code",
        "campaign_description",
        "treatment_offer",
        "valid_from",
        "valid_to",
        "date_last_modified",
        "singleuseflag",
        "cpnreviewflg",
        "lookupstrtdt"
})
public class Coupon {

    @JsonProperty("brand_id")
    private Object brandId;
    @JsonProperty("treatment_code")
    private Object treatmentCode;
    @JsonProperty("campaign_description")
    private Object campaignDescription;
    @JsonProperty("treatment_offer")
    private Object treatmentOffer;
    @JsonProperty("valid_from")
    private Object validFrom;
    @JsonProperty("valid_to")
    private Object validTo;
    @JsonProperty("date_last_modified")
    private Object dateLastModified;
    @JsonProperty("singleuseflag")
    private Object singleuseflag;
    @JsonProperty("cpnreviewflg")
    private Object cpnreviewflg;
    @JsonProperty("lookupstrtdt")
    private Object lookupstrtdt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("brand_id")
    public Object getBrandId() {
        return brandId;
    }

    @JsonProperty("brand_id")
    public void setBrandId(Object brandId) {
        this.brandId = brandId;
    }

    @JsonProperty("treatment_code")
    public Object getTreatmentCode() {
        return treatmentCode;
    }

    @JsonProperty("treatment_code")
    public void setTreatmentCode(Object treatmentCode) {
        this.treatmentCode = treatmentCode;
    }

    @JsonProperty("campaign_description")
    public Object getCampaignDescription() {
        return campaignDescription;
    }

    @JsonProperty("campaign_description")
    public void setCampaignDescription(Object campaignDescription) {
        this.campaignDescription = campaignDescription;
    }

    @JsonProperty("treatment_offer")
    public Object getTreatmentOffer() {
        return treatmentOffer;
    }

    @JsonProperty("treatment_offer")
    public void setTreatmentOffer(Object treatmentOffer) {
        this.treatmentOffer = treatmentOffer;
    }

    @JsonProperty("valid_from")
    public Object getValidFrom() {
        return validFrom;
    }

    @JsonProperty("valid_from")
    public void setValidFrom(Object validFrom) {
        this.validFrom = validFrom;
    }

    @JsonProperty("valid_to")
    public Object getValidTo() {
        return validTo;
    }

    @JsonProperty("valid_to")
    public void setValidTo(Object validTo) {
        this.validTo = validTo;
    }

    @JsonProperty("date_last_modified")
    public Object getDateLastModified() {
        return dateLastModified;
    }

    @JsonProperty("date_last_modified")
    public void setDateLastModified(Object dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    @JsonProperty("singleuseflag")
    public Object getSingleuseflag() {
        return singleuseflag;
    }

    @JsonProperty("singleuseflag")
    public void setSingleuseflag(Object singleuseflag) {
        this.singleuseflag = singleuseflag;
    }

    @JsonProperty("cpnreviewflg")
    public Object getCpnreviewflg() {
        return cpnreviewflg;
    }

    @JsonProperty("cpnreviewflg")
    public void setCpnreviewflg(Object cpnreviewflg) {
        this.cpnreviewflg = cpnreviewflg;
    }

    @JsonProperty("lookupstrtdt")
    public Object getLookupstrtdt() {
        return lookupstrtdt;
    }

    @JsonProperty("lookupstrtdt")
    public void setLookupstrtdt(Object lookupstrtdt) {
        this.lookupstrtdt = lookupstrtdt;
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