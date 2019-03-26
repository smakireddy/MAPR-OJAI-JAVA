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
        "_id",
        "depricated_customer_id",
        "brand_id",
        "customer_no",
        "alpha_key",
        "phonetic_key",
        "sas_sk",
        "first_name",
        "last_name",
        "gender",
        "birth_month",
        "membership_type_code",
        "date_last_modified",
        "create_source_event_id",
        "atg_email_address",
        "events",
        "preferences",
        "contact_phone_pii",
        "contact_mail_pii",
        "contact_email_pii",
        "customer_loyalty",
        "customer_coupon",
        "xref",
        "whouse_customer"
})
public class Customer {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("depricated_customer_id")
    private Integer depricatedCustomerId;
    @JsonProperty("brand_id")
    private Integer brandId;
    @JsonProperty("customer_no")
    private Integer customerNo;
    @JsonProperty("alpha_key")
    private String alphaKey;
    @JsonProperty("phonetic_key")
    private String phoneticKey;
    @JsonProperty("sas_sk")
    private Object sasSk;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("birth_month")
    private Integer birthMonth;
    @JsonProperty("membership_type_code")
    private String membershipTypeCode;
    @JsonProperty("date_last_modified")
    private String dateLastModified;
    @JsonProperty("create_source_event_id")
    private Integer createSourceEventId;
    @JsonProperty("atg_email_address")
    private String atgEmailAddress;
    @JsonProperty("events")
    private List<Event> events = null;
    @JsonProperty("preferences")
    private List<Preference> preferences = null;
    @JsonProperty("contact_phone_pii")
    private List<ContactPhonePius> contactPhonePii = null;
    @JsonProperty("contact_mail_pii")
    private List<ContactMailPius> contactMailPii = null;
    @JsonProperty("contact_email_pii")
    private List<ContactEmailPius> contactEmailPii = null;
    @JsonProperty("customer_loyalty")
    private List<CustomerLoyalty> customerLoyalty = null;
    @JsonProperty("customer_coupon")
    private List<CustomerCoupon> customerCoupon = null;
    @JsonProperty("xref")
    private List<Xref> xref = null;
    @JsonProperty("whouse_customer")
    private List<WhouseCustomer> whouseCustomer = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("depricated_customer_id")
    public Integer getDepricatedCustomerId() {
        return depricatedCustomerId;
    }

    @JsonProperty("depricated_customer_id")
    public void setDepricatedCustomerId(Integer depricatedCustomerId) {
        this.depricatedCustomerId = depricatedCustomerId;
    }

    @JsonProperty("brand_id")
    public Integer getBrandId() {
        return brandId;
    }

    @JsonProperty("brand_id")
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    @JsonProperty("customer_no")
    public Integer getCustomerNo() {
        return customerNo;
    }

    @JsonProperty("customer_no")
    public void setCustomerNo(Integer customerNo) {
        this.customerNo = customerNo;
    }

    @JsonProperty("alpha_key")
    public String getAlphaKey() {
        return alphaKey;
    }

    @JsonProperty("alpha_key")
    public void setAlphaKey(String alphaKey) {
        this.alphaKey = alphaKey;
    }

    @JsonProperty("phonetic_key")
    public String getPhoneticKey() {
        return phoneticKey;
    }

    @JsonProperty("phonetic_key")
    public void setPhoneticKey(String phoneticKey) {
        this.phoneticKey = phoneticKey;
    }

    @JsonProperty("sas_sk")
    public Object getSasSk() {
        return sasSk;
    }

    @JsonProperty("sas_sk")
    public void setSasSk(Object sasSk) {
        this.sasSk = sasSk;
    }

    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("birth_month")
    public Integer getBirthMonth() {
        return birthMonth;
    }

    @JsonProperty("birth_month")
    public void setBirthMonth(Integer birthMonth) {
        this.birthMonth = birthMonth;
    }

    @JsonProperty("membership_type_code")
    public String getMembershipTypeCode() {
        return membershipTypeCode;
    }

    @JsonProperty("membership_type_code")
    public void setMembershipTypeCode(String membershipTypeCode) {
        this.membershipTypeCode = membershipTypeCode;
    }

    @JsonProperty("date_last_modified")
    public String getDateLastModified() {
        return dateLastModified;
    }

    @JsonProperty("date_last_modified")
    public void setDateLastModified(String dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    @JsonProperty("create_source_event_id")
    public Integer getCreateSourceEventId() {
        return createSourceEventId;
    }

    @JsonProperty("create_source_event_id")
    public void setCreateSourceEventId(Integer createSourceEventId) {
        this.createSourceEventId = createSourceEventId;
    }

    @JsonProperty("atg_email_address")
    public String getAtgEmailAddress() {
        return atgEmailAddress;
    }

    @JsonProperty("atg_email_address")
    public void setAtgEmailAddress(String atgEmailAddress) {
        this.atgEmailAddress = atgEmailAddress;
    }

    @JsonProperty("events")
    public List<Event> getEvents() {
        return events;
    }

    @JsonProperty("events")
    public void setEvents(List<Event> events) {
        this.events = events;
    }

    @JsonProperty("preferences")
    public List<Preference> getPreferences() {
        return preferences;
    }

    @JsonProperty("preferences")
    public void setPreferences(List<Preference> preferences) {
        this.preferences = preferences;
    }

    @JsonProperty("contact_phone_pii")
    public List<ContactPhonePius> getContactPhonePii() {
        return contactPhonePii;
    }

    @JsonProperty("contact_phone_pii")
    public void setContactPhonePii(List<ContactPhonePius> contactPhonePii) {
        this.contactPhonePii = contactPhonePii;
    }

    @JsonProperty("contact_mail_pii")
    public List<ContactMailPius> getContactMailPii() {
        return contactMailPii;
    }

    @JsonProperty("contact_mail_pii")
    public void setContactMailPii(List<ContactMailPius> contactMailPii) {
        this.contactMailPii = contactMailPii;
    }

    @JsonProperty("contact_email_pii")
    public List<ContactEmailPius> getContactEmailPii() {
        return contactEmailPii;
    }

    @JsonProperty("contact_email_pii")
    public void setContactEmailPii(List<ContactEmailPius> contactEmailPii) {
        this.contactEmailPii = contactEmailPii;
    }

    @JsonProperty("customer_loyalty")
    public List<CustomerLoyalty> getCustomerLoyalty() {
        return customerLoyalty;
    }

    @JsonProperty("customer_loyalty")
    public void setCustomerLoyalty(List<CustomerLoyalty> customerLoyalty) {
        this.customerLoyalty = customerLoyalty;
    }

    @JsonProperty("customer_coupon")
    public List<CustomerCoupon> getCustomerCoupon() {
        return customerCoupon;
    }

    @JsonProperty("customer_coupon")
    public void setCustomerCoupon(List<CustomerCoupon> customerCoupon) {
        this.customerCoupon = customerCoupon;
    }

    @JsonProperty("xref")
    public List<Xref> getXref() {
        return xref;
    }

    @JsonProperty("xref")
    public void setXref(List<Xref> xref) {
        this.xref = xref;
    }

    @JsonProperty("whouse_customer")
    public List<WhouseCustomer> getWhouseCustomer() {
        return whouseCustomer;
    }

    @JsonProperty("whouse_customer")
    public void setWhouseCustomer(List<WhouseCustomer> whouseCustomer) {
        this.whouseCustomer = whouseCustomer;
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