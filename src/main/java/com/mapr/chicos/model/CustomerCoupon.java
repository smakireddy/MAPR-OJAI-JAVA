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
        "depricated_coupon_id",
        "campaign_id",
        "coupon_id",
        "last_used_date",
        "used_count",
        "last_used_store",
        "date_last_modified",
        "coupon",
        "campaign"
})
public class CustomerCoupon {

    @JsonProperty("depricated_coupon_id")
    private Integer depricatedCouponId;
    @JsonProperty("campaign_id")
    private Object campaignId;
    @JsonProperty("coupon_id")
    private Object couponId;
    @JsonProperty("last_used_date")
    private String lastUsedDate;
    @JsonProperty("used_count")
    private Object usedCount;
    @JsonProperty("last_used_store")
    private String lastUsedStore;
    @JsonProperty("date_last_modified")
    private String dateLastModified;
    @JsonProperty("coupon")
    private Coupon coupon;
    @JsonProperty("campaign")
    private Campaign campaign;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("depricated_coupon_id")
    public Integer getDepricatedCouponId() {
        return depricatedCouponId;
    }

    @JsonProperty("depricated_coupon_id")
    public void setDepricatedCouponId(Integer depricatedCouponId) {
        this.depricatedCouponId = depricatedCouponId;
    }

    @JsonProperty("campaign_id")
    public Object getCampaignId() {
        return campaignId;
    }

    @JsonProperty("campaign_id")
    public void setCampaignId(Object campaignId) {
        this.campaignId = campaignId;
    }

    @JsonProperty("coupon_id")
    public Object getCouponId() {
        return couponId;
    }

    @JsonProperty("coupon_id")
    public void setCouponId(Object couponId) {
        this.couponId = couponId;
    }

    @JsonProperty("last_used_date")
    public String getLastUsedDate() {
        return lastUsedDate;
    }

    @JsonProperty("last_used_date")
    public void setLastUsedDate(String lastUsedDate) {
        this.lastUsedDate = lastUsedDate;
    }

    @JsonProperty("used_count")
    public Object getUsedCount() {
        return usedCount;
    }

    @JsonProperty("used_count")
    public void setUsedCount(Object usedCount) {
        this.usedCount = usedCount;
    }

    @JsonProperty("last_used_store")
    public String getLastUsedStore() {
        return lastUsedStore;
    }

    @JsonProperty("last_used_store")
    public void setLastUsedStore(String lastUsedStore) {
        this.lastUsedStore = lastUsedStore;
    }

    @JsonProperty("date_last_modified")
    public String getDateLastModified() {
        return dateLastModified;
    }

    @JsonProperty("date_last_modified")
    public void setDateLastModified(String dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    @JsonProperty("coupon")
    public Coupon getCoupon() {
        return coupon;
    }

    @JsonProperty("coupon")
    public void setCoupon(Coupon coupon) {
        this.coupon = coupon;
    }

    @JsonProperty("campaign")
    public Campaign getCampaign() {
        return campaign;
    }

    @JsonProperty("campaign")
    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
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