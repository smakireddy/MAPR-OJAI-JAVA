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
        "depricated_event_id",
        "ref_event_id",
        "root_event_id",
        "event_type_id",
        "event_datetime",
        "store_code",
        "employee_code",
        "customer_event_status",
        "text_document_id",
        "ext_transaction_id",
        "date_last_modified",
        "event_type",
        "event_group"
})
public class Event {

    @JsonProperty("depricated_event_id")
    private Integer depricatedEventId;
    @JsonProperty("ref_event_id")
    private Object refEventId;
    @JsonProperty("root_event_id")
    private Object rootEventId;
    @JsonProperty("event_type_id")
    private Integer eventTypeId;
    @JsonProperty("event_datetime")
    private String eventDatetime;
    @JsonProperty("store_code")
    private String storeCode;
    @JsonProperty("employee_code")
    private String employeeCode;
    @JsonProperty("customer_event_status")
    private String customerEventStatus;
    @JsonProperty("text_document_id")
    private Object textDocumentId;
    @JsonProperty("ext_transaction_id")
    private Object extTransactionId;
    @JsonProperty("date_last_modified")
    private String dateLastModified;
    @JsonProperty("event_type")
    private EventType eventType;
    @JsonProperty("event_group")
    private EventGroup eventGroup;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("depricated_event_id")
    public Integer getDepricatedEventId() {
        return depricatedEventId;
    }

    @JsonProperty("depricated_event_id")
    public void setDepricatedEventId(Integer depricatedEventId) {
        this.depricatedEventId = depricatedEventId;
    }

    @JsonProperty("ref_event_id")
    public Object getRefEventId() {
        return refEventId;
    }

    @JsonProperty("ref_event_id")
    public void setRefEventId(Object refEventId) {
        this.refEventId = refEventId;
    }

    @JsonProperty("root_event_id")
    public Object getRootEventId() {
        return rootEventId;
    }

    @JsonProperty("root_event_id")
    public void setRootEventId(Object rootEventId) {
        this.rootEventId = rootEventId;
    }

    @JsonProperty("event_type_id")
    public Integer getEventTypeId() {
        return eventTypeId;
    }

    @JsonProperty("event_type_id")
    public void setEventTypeId(Integer eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    @JsonProperty("event_datetime")
    public String getEventDatetime() {
        return eventDatetime;
    }

    @JsonProperty("event_datetime")
    public void setEventDatetime(String eventDatetime) {
        this.eventDatetime = eventDatetime;
    }

    @JsonProperty("store_code")
    public String getStoreCode() {
        return storeCode;
    }

    @JsonProperty("store_code")
    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    @JsonProperty("employee_code")
    public String getEmployeeCode() {
        return employeeCode;
    }

    @JsonProperty("employee_code")
    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    @JsonProperty("customer_event_status")
    public String getCustomerEventStatus() {
        return customerEventStatus;
    }

    @JsonProperty("customer_event_status")
    public void setCustomerEventStatus(String customerEventStatus) {
        this.customerEventStatus = customerEventStatus;
    }

    @JsonProperty("text_document_id")
    public Object getTextDocumentId() {
        return textDocumentId;
    }

    @JsonProperty("text_document_id")
    public void setTextDocumentId(Object textDocumentId) {
        this.textDocumentId = textDocumentId;
    }

    @JsonProperty("ext_transaction_id")
    public Object getExtTransactionId() {
        return extTransactionId;
    }

    @JsonProperty("ext_transaction_id")
    public void setExtTransactionId(Object extTransactionId) {
        this.extTransactionId = extTransactionId;
    }

    @JsonProperty("date_last_modified")
    public String getDateLastModified() {
        return dateLastModified;
    }

    @JsonProperty("date_last_modified")
    public void setDateLastModified(String dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    @JsonProperty("event_type")
    public EventType getEventType() {
        return eventType;
    }

    @JsonProperty("event_type")
    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    @JsonProperty("event_group")
    public EventGroup getEventGroup() {
        return eventGroup;
    }

    @JsonProperty("event_group")
    public void setEventGroup(EventGroup eventGroup) {
        this.eventGroup = eventGroup;
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