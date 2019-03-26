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
        "depricated_loyalty_id",
        "loyalty_type_id",
        "is_active",
        "loyalty_date",
        "loyalty_flag",
        "lifetime_spend",
        "spend_date",
        "date_last_modified",
        "loyalty_tier",
        "loyalty_tier_date",
        "loyalty_spend",
        "loyalty_delta",
        "loyalty_optin_date",
        "loyalty_type"
})
public class CustomerLoyalty {

    @JsonProperty("depricated_loyalty_id")
    private Integer depricatedLoyaltyId;
    @JsonProperty("loyalty_type_id")
    private Integer loyaltyTypeId;
    @JsonProperty("is_active")
    private Boolean isActive;
    @JsonProperty("loyalty_date")
    private String loyaltyDate;
    @JsonProperty("loyalty_flag")
    private Boolean loyaltyFlag;
    @JsonProperty("lifetime_spend")
    private Double lifetimeSpend;
    @JsonProperty("spend_date")
    private String spendDate;
    @JsonProperty("date_last_modified")
    private String dateLastModified;
    @JsonProperty("loyalty_tier")
    private Object loyaltyTier;
    @JsonProperty("loyalty_tier_date")
    private String loyaltyTierDate;
    @JsonProperty("loyalty_spend")
    private Object loyaltySpend;
    @JsonProperty("loyalty_delta")
    private Object loyaltyDelta;
    @JsonProperty("loyalty_optin_date")
    private String loyaltyOptinDate;
    @JsonProperty("loyalty_type")
    private LoyaltyType loyaltyType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("depricated_loyalty_id")
    public Integer getDepricatedLoyaltyId() {
        return depricatedLoyaltyId;
    }

    @JsonProperty("depricated_loyalty_id")
    public void setDepricatedLoyaltyId(Integer depricatedLoyaltyId) {
        this.depricatedLoyaltyId = depricatedLoyaltyId;
    }

    @JsonProperty("loyalty_type_id")
    public Integer getLoyaltyTypeId() {
        return loyaltyTypeId;
    }

    @JsonProperty("loyalty_type_id")
    public void setLoyaltyTypeId(Integer loyaltyTypeId) {
        this.loyaltyTypeId = loyaltyTypeId;
    }

    @JsonProperty("is_active")
    public Boolean getIsActive() {
        return isActive;
    }

    @JsonProperty("is_active")
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    @JsonProperty("loyalty_date")
    public String getLoyaltyDate() {
        return loyaltyDate;
    }

    @JsonProperty("loyalty_date")
    public void setLoyaltyDate(String loyaltyDate) {
        this.loyaltyDate = loyaltyDate;
    }

    @JsonProperty("loyalty_flag")
    public Boolean getLoyaltyFlag() {
        return loyaltyFlag;
    }

    @JsonProperty("loyalty_flag")
    public void setLoyaltyFlag(Boolean loyaltyFlag) {
        this.loyaltyFlag = loyaltyFlag;
    }

    @JsonProperty("lifetime_spend")
    public Double getLifetimeSpend() {
        return lifetimeSpend;
    }

    @JsonProperty("lifetime_spend")
    public void setLifetimeSpend(Double lifetimeSpend) {
        this.lifetimeSpend = lifetimeSpend;
    }

    @JsonProperty("spend_date")
    public String getSpendDate() {
        return spendDate;
    }

    @JsonProperty("spend_date")
    public void setSpendDate(String spendDate) {
        this.spendDate = spendDate;
    }

    @JsonProperty("date_last_modified")
    public String getDateLastModified() {
        return dateLastModified;
    }

    @JsonProperty("date_last_modified")
    public void setDateLastModified(String dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    @JsonProperty("loyalty_tier")
    public Object getLoyaltyTier() {
        return loyaltyTier;
    }

    @JsonProperty("loyalty_tier")
    public void setLoyaltyTier(Object loyaltyTier) {
        this.loyaltyTier = loyaltyTier;
    }

    @JsonProperty("loyalty_tier_date")
    public String getLoyaltyTierDate() {
        return loyaltyTierDate;
    }

    @JsonProperty("loyalty_tier_date")
    public void setLoyaltyTierDate(String loyaltyTierDate) {
        this.loyaltyTierDate = loyaltyTierDate;
    }

    @JsonProperty("loyalty_spend")
    public Object getLoyaltySpend() {
        return loyaltySpend;
    }

    @JsonProperty("loyalty_spend")
    public void setLoyaltySpend(Object loyaltySpend) {
        this.loyaltySpend = loyaltySpend;
    }

    @JsonProperty("loyalty_delta")
    public Object getLoyaltyDelta() {
        return loyaltyDelta;
    }

    @JsonProperty("loyalty_delta")
    public void setLoyaltyDelta(Object loyaltyDelta) {
        this.loyaltyDelta = loyaltyDelta;
    }

    @JsonProperty("loyalty_optin_date")
    public String getLoyaltyOptinDate() {
        return loyaltyOptinDate;
    }

    @JsonProperty("loyalty_optin_date")
    public void setLoyaltyOptinDate(String loyaltyOptinDate) {
        this.loyaltyOptinDate = loyaltyOptinDate;
    }

    @JsonProperty("loyalty_type")
    public LoyaltyType getLoyaltyType() {
        return loyaltyType;
    }

    @JsonProperty("loyalty_type")
    public void setLoyaltyType(LoyaltyType loyaltyType) {
        this.loyaltyType = loyaltyType;
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