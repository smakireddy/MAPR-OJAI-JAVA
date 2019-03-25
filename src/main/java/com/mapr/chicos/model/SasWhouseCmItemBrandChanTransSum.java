package com.mapr.chicos.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.ojai.types.OTimestamp;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "department_code",
        "total_unit_cnt_lifetime",
        "coupon_trans_cnt_37plus_m",
        "total_sales_amt_lifetime",
        "individual_sk",
        "channel_id",
        "processed_dttm",
        "last_trans_dt",
        "total_sales_amt_37plus_m",
        "first_trans_dt",
        "coupon_trans_cnt_lifetime",
        "item_brand_id",
        "trans_cnt_lifetime",
        "total_unit_cnt_37plus_m",
        "trans_cnt_37plus_m",
        "gross_margin_amt_37plus_m",
        "gross_margin_pct_37plus_m",
        "gross_margin_amt_lifetime",
        "gross_margin_pct_lifetime"
})
public class SasWhouseCmItemBrandChanTransSum {

    @JsonProperty("department_code")
    private Integer departmentCode;
    @JsonProperty("total_unit_cnt_lifetime")
    private Integer totalUnitCntLifetime;
    @JsonProperty("coupon_trans_cnt_37plus_m")
    private Integer couponTransCnt37plusM;
    @JsonProperty("total_sales_amt_lifetime")
    private Double totalSalesAmtLifetime;
    @JsonProperty("individual_sk")
    private Integer individualSk;
    @JsonProperty("channel_id")
    private Integer channelId;
    @JsonProperty("processed_dttm")
    private OTimestamp processedDttm;
    @JsonProperty("last_trans_dt")
    private OTimestamp lastTransDt;
    @JsonProperty("total_sales_amt_37plus_m")
    private Double totalSalesAmt37plusM;
    @JsonProperty("first_trans_dt")
    private String firstTransDt;
    @JsonProperty("coupon_trans_cnt_lifetime")
    private Integer couponTransCntLifetime;
    @JsonProperty("item_brand_id")
    private Integer itemBrandId;
    @JsonProperty("trans_cnt_lifetime")
    private Integer transCntLifetime;
    @JsonProperty("total_unit_cnt_37plus_m")
    private Integer totalUnitCnt37plusM;
    @JsonProperty("trans_cnt_37plus_m")
    private Integer transCnt37plusM;
    @JsonProperty("gross_margin_amt_37plus_m")
    private Double grossMarginAmt37plusM;
    @JsonProperty("gross_margin_pct_37plus_m")
    private Double grossMarginPct37plusM;
    @JsonProperty("gross_margin_amt_lifetime")
    private Double grossMarginAmtLifetime;
    @JsonProperty("gross_margin_pct_lifetime")
    private Double grossMarginPctLifetime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("department_code")
    public Integer getDepartmentCode() {
        return departmentCode;
    }

    @JsonProperty("department_code")
    public void setDepartmentCode(Integer departmentCode) {
        this.departmentCode = departmentCode;
    }

    @JsonProperty("total_unit_cnt_lifetime")
    public Integer getTotalUnitCntLifetime() {
        return totalUnitCntLifetime;
    }

    @JsonProperty("total_unit_cnt_lifetime")
    public void setTotalUnitCntLifetime(Integer totalUnitCntLifetime) {
        this.totalUnitCntLifetime = totalUnitCntLifetime;
    }

    @JsonProperty("coupon_trans_cnt_37plus_m")
    public Integer getCouponTransCnt37plusM() {
        return couponTransCnt37plusM;
    }

    @JsonProperty("coupon_trans_cnt_37plus_m")
    public void setCouponTransCnt37plusM(Integer couponTransCnt37plusM) {
        this.couponTransCnt37plusM = couponTransCnt37plusM;
    }

    @JsonProperty("total_sales_amt_lifetime")
    public Double getTotalSalesAmtLifetime() {
        return totalSalesAmtLifetime;
    }

    @JsonProperty("total_sales_amt_lifetime")
    public void setTotalSalesAmtLifetime(Double totalSalesAmtLifetime) {
        this.totalSalesAmtLifetime = totalSalesAmtLifetime;
    }

    @JsonProperty("individual_sk")
    public Integer getIndividualSk() {
        return individualSk;
    }

    @JsonProperty("individual_sk")
    public void setIndividualSk(Integer individualSk) {
        this.individualSk = individualSk;
    }

    @JsonProperty("channel_id")
    public Integer getChannelId() {
        return channelId;
    }

    @JsonProperty("channel_id")
    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    @JsonProperty("processed_dttm")
    public OTimestamp getProcessedDttm() {
        return processedDttm;
    }

    @JsonProperty("processed_dttm")
    public void setProcessedDttm(OTimestamp processedDttm) {
        this.processedDttm = processedDttm;
    }

    @JsonProperty("last_trans_dt")
    public OTimestamp getLastTransDt() {
        return lastTransDt;
    }

    @JsonProperty("last_trans_dt")
    public void setLastTransDt(OTimestamp lastTransDt) {
        this.lastTransDt = lastTransDt;
    }

    @JsonProperty("total_sales_amt_37plus_m")
    public Double getTotalSalesAmt37plusM() {
        return totalSalesAmt37plusM;
    }

    @JsonProperty("total_sales_amt_37plus_m")
    public void setTotalSalesAmt37plusM(Double totalSalesAmt37plusM) {
        this.totalSalesAmt37plusM = totalSalesAmt37plusM;
    }

    @JsonProperty("first_trans_dt")
    public String getFirstTransDt() {
        return firstTransDt;
    }

    @JsonProperty("first_trans_dt")
    public void setFirstTransDt(String firstTransDt) {
        this.firstTransDt = firstTransDt;
    }

    @JsonProperty("coupon_trans_cnt_lifetime")
    public Integer getCouponTransCntLifetime() {
        return couponTransCntLifetime;
    }

    @JsonProperty("coupon_trans_cnt_lifetime")
    public void setCouponTransCntLifetime(Integer couponTransCntLifetime) {
        this.couponTransCntLifetime = couponTransCntLifetime;
    }

    @JsonProperty("item_brand_id")
    public Integer getItemBrandId() {
        return itemBrandId;
    }

    @JsonProperty("item_brand_id")
    public void setItemBrandId(Integer itemBrandId) {
        this.itemBrandId = itemBrandId;
    }

    @JsonProperty("trans_cnt_lifetime")
    public Integer getTransCntLifetime() {
        return transCntLifetime;
    }

    @JsonProperty("trans_cnt_lifetime")
    public void setTransCntLifetime(Integer transCntLifetime) {
        this.transCntLifetime = transCntLifetime;
    }

    @JsonProperty("total_unit_cnt_37plus_m")
    public Integer getTotalUnitCnt37plusM() {
        return totalUnitCnt37plusM;
    }

    @JsonProperty("total_unit_cnt_37plus_m")
    public void setTotalUnitCnt37plusM(Integer totalUnitCnt37plusM) {
        this.totalUnitCnt37plusM = totalUnitCnt37plusM;
    }

    @JsonProperty("trans_cnt_37plus_m")
    public Integer getTransCnt37plusM() {
        return transCnt37plusM;
    }

    @JsonProperty("trans_cnt_37plus_m")
    public void setTransCnt37plusM(Integer transCnt37plusM) {
        this.transCnt37plusM = transCnt37plusM;
    }

    @JsonProperty("gross_margin_amt_37plus_m")
    public Double getGrossMarginAmt37plusM() {
        return grossMarginAmt37plusM;
    }

    @JsonProperty("gross_margin_amt_37plus_m")
    public void setGrossMarginAmt37plusM(Double grossMarginAmt37plusM) {
        this.grossMarginAmt37plusM = grossMarginAmt37plusM;
    }

    @JsonProperty("gross_margin_pct_37plus_m")
    public Double getGrossMarginPct37plusM() {
        return grossMarginPct37plusM;
    }

    @JsonProperty("gross_margin_pct_37plus_m")
    public void setGrossMarginPct37plusM(Double grossMarginPct37plusM) {
        this.grossMarginPct37plusM = grossMarginPct37plusM;
    }

    @JsonProperty("gross_margin_amt_lifetime")
    public Double getGrossMarginAmtLifetime() {
        return grossMarginAmtLifetime;
    }

    @JsonProperty("gross_margin_amt_lifetime")
    public void setGrossMarginAmtLifetime(Double grossMarginAmtLifetime) {
        this.grossMarginAmtLifetime = grossMarginAmtLifetime;
    }

    @JsonProperty("gross_margin_pct_lifetime")
    public Double getGrossMarginPctLifetime() {
        return grossMarginPctLifetime;
    }

    @JsonProperty("gross_margin_pct_lifetime")
    public void setGrossMarginPctLifetime(Double grossMarginPctLifetime) {
        this.grossMarginPctLifetime = grossMarginPctLifetime;
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