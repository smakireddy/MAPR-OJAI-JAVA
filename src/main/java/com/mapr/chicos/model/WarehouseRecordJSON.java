package com.mapr.chicos.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customer_no",
        "trans_cnt_lifetime",
        "phone_last_update_dttm",
        "last_trans_dt",
        "email_last_update_dttm",
        "address_last_update_dttm",
        "total_sales_amt_lifetime",
        "first_trans_dt",
        "total_unit_cnt_lifetime",
        "sas_whouse_cm_item_brand_chan_trans_sum",
        "_id",
        "customer_brand_id",
        "depricated_customer_sk",
        "coupon_trans_cnt_lifetime",
        "gross_margin_amt_lifetime"
})

public class WarehouseRecordJSON {

    @JsonProperty("customer_no")
    private Integer customerNo;
    @JsonProperty("trans_cnt_lifetime")
    private Integer transCntLifetime;
    @JsonProperty("phone_last_update_dttm")
    private String phoneLastUpdateDttm;
    @JsonProperty("last_trans_dt")
    private String lastTransDt;
    @JsonProperty("email_last_update_dttm")
    private String emailLastUpdateDttm;
    @JsonProperty("address_last_update_dttm")
    private String addressLastUpdateDttm;
    @JsonProperty("total_sales_amt_lifetime")
    private Double totalSalesAmtLifetime;
    @JsonProperty("first_trans_dt")
    private String firstTransDt;
    @JsonProperty("total_unit_cnt_lifetime")
    private Integer totalUnitCntLifetime;
    @JsonProperty("sas_whouse_cm_item_brand_chan_trans_sum")
    private List<SasWhouseCmItemBrandChanTransSum> sasWhouseCmItemBrandChanTransSum = null;
    @JsonProperty("_id")
    private String id;
    @JsonProperty("customer_brand_id")
    private Integer customerBrandId;
    @JsonProperty("depricated_customer_sk")
    private Integer depricatedCustomerSk;
    @JsonProperty("coupon_trans_cnt_lifetime")
    private Integer couponTransCntLifetime;
    @JsonProperty("gross_margin_amt_lifetime")
    private Double grossMarginAmtLifetime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("customer_no")
    public Integer getCustomerNo() {
        return customerNo;
    }

    @JsonProperty("customer_no")
    public void setCustomerNo(Integer customerNo) {
        this.customerNo = customerNo;
    }

    @JsonProperty("trans_cnt_lifetime")
    public Integer getTransCntLifetime() {
        return transCntLifetime;
    }

    @JsonProperty("trans_cnt_lifetime")
    public void setTransCntLifetime(Integer transCntLifetime) {
        this.transCntLifetime = transCntLifetime;
    }

    @JsonProperty("phone_last_update_dttm")
    public String getPhoneLastUpdateDttm() {
        return phoneLastUpdateDttm;
    }

    @JsonProperty("phone_last_update_dttm")
    public void setPhoneLastUpdateDttm(String phoneLastUpdateDttm) {
        this.phoneLastUpdateDttm = phoneLastUpdateDttm;
    }

    @JsonProperty("last_trans_dt")
    public String getLastTransDt() {
        return lastTransDt;
    }

    @JsonProperty("last_trans_dt")
    public void setLastTransDt(String lastTransDt) {
        this.lastTransDt = lastTransDt;
    }

    @JsonProperty("email_last_update_dttm")
    public String getEmailLastUpdateDttm() {
        return emailLastUpdateDttm;
    }

    @JsonProperty("email_last_update_dttm")
    public void setEmailLastUpdateDttm(String emailLastUpdateDttm) {
        this.emailLastUpdateDttm = emailLastUpdateDttm;
    }

    @JsonProperty("address_last_update_dttm")
    public String getAddressLastUpdateDttm() {
        return addressLastUpdateDttm;
    }

    @JsonProperty("address_last_update_dttm")
    public void setAddressLastUpdateDttm(String addressLastUpdateDttm) {
        this.addressLastUpdateDttm = addressLastUpdateDttm;
    }

    @JsonProperty("total_sales_amt_lifetime")
    public Double getTotalSalesAmtLifetime() {
        return totalSalesAmtLifetime;
    }

    @JsonProperty("total_sales_amt_lifetime")
    public void setTotalSalesAmtLifetime(Double totalSalesAmtLifetime) {
        this.totalSalesAmtLifetime = totalSalesAmtLifetime;
    }

    @JsonProperty("first_trans_dt")
    public String getFirstTransDt() {
        return firstTransDt;
    }

    @JsonProperty("first_trans_dt")
    public void setFirstTransDt(String firstTransDt) {
        this.firstTransDt = firstTransDt;
    }

    @JsonProperty("total_unit_cnt_lifetime")
    public Integer getTotalUnitCntLifetime() {
        return totalUnitCntLifetime;
    }

    @JsonProperty("total_unit_cnt_lifetime")
    public void setTotalUnitCntLifetime(Integer totalUnitCntLifetime) {
        this.totalUnitCntLifetime = totalUnitCntLifetime;
    }

    @JsonProperty("sas_whouse_cm_item_brand_chan_trans_sum")
    public List<SasWhouseCmItemBrandChanTransSum> getSasWhouseCmItemBrandChanTransSum() {
        return sasWhouseCmItemBrandChanTransSum;
    }

    @JsonProperty("sas_whouse_cm_item_brand_chan_trans_sum")
    public void setSasWhouseCmItemBrandChanTransSum(List<SasWhouseCmItemBrandChanTransSum> sasWhouseCmItemBrandChanTransSum) {
        this.sasWhouseCmItemBrandChanTransSum = sasWhouseCmItemBrandChanTransSum;
    }

    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("customer_brand_id")
    public Integer getCustomerBrandId() {
        return customerBrandId;
    }

    @JsonProperty("customer_brand_id")
    public void setCustomerBrandId(Integer customerBrandId) {
        this.customerBrandId = customerBrandId;
    }

    @JsonProperty("depricated_customer_sk")
    public Integer getDepricatedCustomerSk() {
        return depricatedCustomerSk;
    }

    @JsonProperty("depricated_customer_sk")
    public void setDepricatedCustomerSk(Integer depricatedCustomerSk) {
        this.depricatedCustomerSk = depricatedCustomerSk;
    }

    @JsonProperty("coupon_trans_cnt_lifetime")
    public Integer getCouponTransCntLifetime() {
        return couponTransCntLifetime;
    }

    @JsonProperty("coupon_trans_cnt_lifetime")
    public void setCouponTransCntLifetime(Integer couponTransCntLifetime) {
        this.couponTransCntLifetime = couponTransCntLifetime;
    }

    @JsonProperty("gross_margin_amt_lifetime")
    public Double getGrossMarginAmtLifetime() {
        return grossMarginAmtLifetime;
    }

    @JsonProperty("gross_margin_amt_lifetime")
    public void setGrossMarginAmtLifetime(Double grossMarginAmtLifetime) {
        this.grossMarginAmtLifetime = grossMarginAmtLifetime;
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