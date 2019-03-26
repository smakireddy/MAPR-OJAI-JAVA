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
        "depricated_mail_id",
        "mail_type",
        "main",
        "opt_out",
        "country_code",
        "address_match_key",
        "mail_indicator_id",
        "carrier_route",
        "ncoa_pin",
        "street1",
        "street2",
        "city",
        "state",
        "dpv_chkdigit",
        "dpv_lot_no_seq",
        "zip_code",
        "date_last_modified",
        "date_valid_from",
        "date_valid_to",
        "month_from",
        "month_to",
        "qas_match_code",
        "return_mail_indicator"
})
public class ContactMailPius {

    @JsonProperty("depricated_mail_id")
    private Integer depricatedMailId;
    @JsonProperty("mail_type")
    private String mailType;
    @JsonProperty("main")
    private Boolean main;
    @JsonProperty("opt_out")
    private Boolean optOut;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("address_match_key")
    private String addressMatchKey;
    @JsonProperty("mail_indicator_id")
    private Integer mailIndicatorId;
    @JsonProperty("carrier_route")
    private String carrierRoute;
    @JsonProperty("ncoa_pin")
    private String ncoaPin;
    @JsonProperty("street1")
    private String street1;
    @JsonProperty("street2")
    private String street2;
    @JsonProperty("city")
    private String city;
    @JsonProperty("state")
    private String state;
    @JsonProperty("dpv_chkdigit")
    private String dpvChkdigit;
    @JsonProperty("dpv_lot_no_seq")
    private String dpvLotNoSeq;
    @JsonProperty("zip_code")
    private String zipCode;
    @JsonProperty("date_last_modified")
    private String dateLastModified;
    @JsonProperty("date_valid_from")
    private String dateValidFrom;
    @JsonProperty("date_valid_to")
    private String dateValidTo;
    @JsonProperty("month_from")
    private Object monthFrom;
    @JsonProperty("month_to")
    private Object monthTo;
    @JsonProperty("qas_match_code")
    private String qasMatchCode;
    @JsonProperty("return_mail_indicator")
    private Boolean returnMailIndicator;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("depricated_mail_id")
    public Integer getDepricatedMailId() {
        return depricatedMailId;
    }

    @JsonProperty("depricated_mail_id")
    public void setDepricatedMailId(Integer depricatedMailId) {
        this.depricatedMailId = depricatedMailId;
    }

    @JsonProperty("mail_type")
    public String getMailType() {
        return mailType;
    }

    @JsonProperty("mail_type")
    public void setMailType(String mailType) {
        this.mailType = mailType;
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

    @JsonProperty("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("address_match_key")
    public String getAddressMatchKey() {
        return addressMatchKey;
    }

    @JsonProperty("address_match_key")
    public void setAddressMatchKey(String addressMatchKey) {
        this.addressMatchKey = addressMatchKey;
    }

    @JsonProperty("mail_indicator_id")
    public Integer getMailIndicatorId() {
        return mailIndicatorId;
    }

    @JsonProperty("mail_indicator_id")
    public void setMailIndicatorId(Integer mailIndicatorId) {
        this.mailIndicatorId = mailIndicatorId;
    }

    @JsonProperty("carrier_route")
    public String getCarrierRoute() {
        return carrierRoute;
    }

    @JsonProperty("carrier_route")
    public void setCarrierRoute(String carrierRoute) {
        this.carrierRoute = carrierRoute;
    }

    @JsonProperty("ncoa_pin")
    public String getNcoaPin() {
        return ncoaPin;
    }

    @JsonProperty("ncoa_pin")
    public void setNcoaPin(String ncoaPin) {
        this.ncoaPin = ncoaPin;
    }

    @JsonProperty("street1")
    public String getStreet1() {
        return street1;
    }

    @JsonProperty("street1")
    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    @JsonProperty("street2")
    public String getStreet2() {
        return street2;
    }

    @JsonProperty("street2")
    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("dpv_chkdigit")
    public String getDpvChkdigit() {
        return dpvChkdigit;
    }

    @JsonProperty("dpv_chkdigit")
    public void setDpvChkdigit(String dpvChkdigit) {
        this.dpvChkdigit = dpvChkdigit;
    }

    @JsonProperty("dpv_lot_no_seq")
    public String getDpvLotNoSeq() {
        return dpvLotNoSeq;
    }

    @JsonProperty("dpv_lot_no_seq")
    public void setDpvLotNoSeq(String dpvLotNoSeq) {
        this.dpvLotNoSeq = dpvLotNoSeq;
    }

    @JsonProperty("zip_code")
    public String getZipCode() {
        return zipCode;
    }

    @JsonProperty("zip_code")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @JsonProperty("date_last_modified")
    public String getDateLastModified() {
        return dateLastModified;
    }

    @JsonProperty("date_last_modified")
    public void setDateLastModified(String dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    @JsonProperty("date_valid_from")
    public String getDateValidFrom() {
        return dateValidFrom;
    }

    @JsonProperty("date_valid_from")
    public void setDateValidFrom(String dateValidFrom) {
        this.dateValidFrom = dateValidFrom;
    }

    @JsonProperty("date_valid_to")
    public String getDateValidTo() {
        return dateValidTo;
    }

    @JsonProperty("date_valid_to")
    public void setDateValidTo(String dateValidTo) {
        this.dateValidTo = dateValidTo;
    }

    @JsonProperty("month_from")
    public Object getMonthFrom() {
        return monthFrom;
    }

    @JsonProperty("month_from")
    public void setMonthFrom(Object monthFrom) {
        this.monthFrom = monthFrom;
    }

    @JsonProperty("month_to")
    public Object getMonthTo() {
        return monthTo;
    }

    @JsonProperty("month_to")
    public void setMonthTo(Object monthTo) {
        this.monthTo = monthTo;
    }

    @JsonProperty("qas_match_code")
    public String getQasMatchCode() {
        return qasMatchCode;
    }

    @JsonProperty("qas_match_code")
    public void setQasMatchCode(String qasMatchCode) {
        this.qasMatchCode = qasMatchCode;
    }

    @JsonProperty("return_mail_indicator")
    public Boolean getReturnMailIndicator() {
        return returnMailIndicator;
    }

    @JsonProperty("return_mail_indicator")
    public void setReturnMailIndicator(Boolean returnMailIndicator) {
        this.returnMailIndicator = returnMailIndicator;
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