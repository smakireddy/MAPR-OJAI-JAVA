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
        "customer_sk",
        "first_trans_dt",
        "last_trans_dt",
        "trans_cnt_lifetime",
        "total_sales_amt_lifetime",
        "coupon_trans_cnt_lifetime",
        "gross_margin_amt_lifetime",
        "total_unit_cnt_lifetime",
        "address_last_update_dttm",
        "email_last_update_dttm",
        "phone_last_update_dttm",
        "mobile_last_update_dttm"
})
public class WhouseCustomer {

    @JsonProperty("customer_sk")
    private Object customerSk;
    @JsonProperty("first_trans_dt")
    private Object firstTransDt;
    @JsonProperty("last_trans_dt")
    private Object lastTransDt;
    @JsonProperty("trans_cnt_lifetime")
    private Object transCntLifetime;
    @JsonProperty("total_sales_amt_lifetime")
    private Object totalSalesAmtLifetime;
    @JsonProperty("coupon_trans_cnt_lifetime")
    private Object couponTransCntLifetime;
    @JsonProperty("gross_margin_amt_lifetime")
    private Object grossMarginAmtLifetime;
    @JsonProperty("total_unit_cnt_lifetime")
    private Object totalUnitCntLifetime;
    @JsonProperty("address_last_update_dttm")
    private Object addressLastUpdateDttm;
    @JsonProperty("email_last_update_dttm")
    private Object emailLastUpdateDttm;
    @JsonProperty("phone_last_update_dttm")
    private Object phoneLastUpdateDttm;
    @JsonProperty("mobile_last_update_dttm")
    private Object mobileLastUpdateDttm;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("customer_sk")
    public Object getCustomerSk() {
        return customerSk;
    }

    @JsonProperty("customer_sk")
    public void setCustomerSk(Object customerSk) {
        this.customerSk = customerSk;
    }

    @JsonProperty("first_trans_dt")
    public Object getFirstTransDt() {
        return firstTransDt;
    }

    @JsonProperty("first_trans_dt")
    public void setFirstTransDt(Object firstTransDt) {
        this.firstTransDt = firstTransDt;
    }

    @JsonProperty("last_trans_dt")
    public Object getLastTransDt() {
        return lastTransDt;
    }

    @JsonProperty("last_trans_dt")
    public void setLastTransDt(Object lastTransDt) {
        this.lastTransDt = lastTransDt;
    }

    @JsonProperty("trans_cnt_lifetime")
    public Object getTransCntLifetime() {
        return transCntLifetime;
    }

    @JsonProperty("trans_cnt_lifetime")
    public void setTransCntLifetime(Object transCntLifetime) {
        this.transCntLifetime = transCntLifetime;
    }

    @JsonProperty("total_sales_amt_lifetime")
    public Object getTotalSalesAmtLifetime() {
        return totalSalesAmtLifetime;
    }

    @JsonProperty("total_sales_amt_lifetime")
    public void setTotalSalesAmtLifetime(Object totalSalesAmtLifetime) {
        this.totalSalesAmtLifetime = totalSalesAmtLifetime;
    }

    @JsonProperty("coupon_trans_cnt_lifetime")
    public Object getCouponTransCntLifetime() {
        return couponTransCntLifetime;
    }

    @JsonProperty("coupon_trans_cnt_lifetime")
    public void setCouponTransCntLifetime(Object couponTransCntLifetime) {
        this.couponTransCntLifetime = couponTransCntLifetime;
    }

    @JsonProperty("gross_margin_amt_lifetime")
    public Object getGrossMarginAmtLifetime() {
        return grossMarginAmtLifetime;
    }

    @JsonProperty("gross_margin_amt_lifetime")
    public void setGrossMarginAmtLifetime(Object grossMarginAmtLifetime) {
        this.grossMarginAmtLifetime = grossMarginAmtLifetime;
    }

    @JsonProperty("total_unit_cnt_lifetime")
    public Object getTotalUnitCntLifetime() {
        return totalUnitCntLifetime;
    }

    @JsonProperty("total_unit_cnt_lifetime")
    public void setTotalUnitCntLifetime(Object totalUnitCntLifetime) {
        this.totalUnitCntLifetime = totalUnitCntLifetime;
    }

    @JsonProperty("address_last_update_dttm")
    public Object getAddressLastUpdateDttm() {
        return addressLastUpdateDttm;
    }

    @JsonProperty("address_last_update_dttm")
    public void setAddressLastUpdateDttm(Object addressLastUpdateDttm) {
        this.addressLastUpdateDttm = addressLastUpdateDttm;
    }

    @JsonProperty("email_last_update_dttm")
    public Object getEmailLastUpdateDttm() {
        return emailLastUpdateDttm;
    }

    @JsonProperty("email_last_update_dttm")
    public void setEmailLastUpdateDttm(Object emailLastUpdateDttm) {
        this.emailLastUpdateDttm = emailLastUpdateDttm;
    }

    @JsonProperty("phone_last_update_dttm")
    public Object getPhoneLastUpdateDttm() {
        return phoneLastUpdateDttm;
    }

    @JsonProperty("phone_last_update_dttm")
    public void setPhoneLastUpdateDttm(Object phoneLastUpdateDttm) {
        this.phoneLastUpdateDttm = phoneLastUpdateDttm;
    }

    @JsonProperty("mobile_last_update_dttm")
    public Object getMobileLastUpdateDttm() {
        return mobileLastUpdateDttm;
    }

    @JsonProperty("mobile_last_update_dttm")
    public void setMobileLastUpdateDttm(Object mobileLastUpdateDttm) {
        this.mobileLastUpdateDttm = mobileLastUpdateDttm;
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