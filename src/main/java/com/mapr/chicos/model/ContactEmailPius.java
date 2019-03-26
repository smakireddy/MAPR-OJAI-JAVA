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
        "depricated_email_id",
        "email_type",
        "mail_indicator_id",
        "main",
        "opt_out",
        "email_address",
        "date_last_modified",
        "influence_score",
        "no_of_followers",
        "no_of_posts"
})
public class ContactEmailPius {

    @JsonProperty("depricated_email_id")
    private Integer depricatedEmailId;
    @JsonProperty("email_type")
    private String emailType;
    @JsonProperty("mail_indicator_id")
    private Integer mailIndicatorId;
    @JsonProperty("main")
    private Boolean main;
    @JsonProperty("opt_out")
    private Boolean optOut;
    @JsonProperty("email_address")
    private String emailAddress;
    @JsonProperty("date_last_modified")
    private String dateLastModified;
    @JsonProperty("influence_score")
    private Object influenceScore;
    @JsonProperty("no_of_followers")
    private Object noOfFollowers;
    @JsonProperty("no_of_posts")
    private Object noOfPosts;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("depricated_email_id")
    public Integer getDepricatedEmailId() {
        return depricatedEmailId;
    }

    @JsonProperty("depricated_email_id")
    public void setDepricatedEmailId(Integer depricatedEmailId) {
        this.depricatedEmailId = depricatedEmailId;
    }

    @JsonProperty("email_type")
    public String getEmailType() {
        return emailType;
    }

    @JsonProperty("email_type")
    public void setEmailType(String emailType) {
        this.emailType = emailType;
    }

    @JsonProperty("mail_indicator_id")
    public Integer getMailIndicatorId() {
        return mailIndicatorId;
    }

    @JsonProperty("mail_indicator_id")
    public void setMailIndicatorId(Integer mailIndicatorId) {
        this.mailIndicatorId = mailIndicatorId;
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

    @JsonProperty("email_address")
    public String getEmailAddress() {
        return emailAddress;
    }

    @JsonProperty("email_address")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @JsonProperty("date_last_modified")
    public String getDateLastModified() {
        return dateLastModified;
    }

    @JsonProperty("date_last_modified")
    public void setDateLastModified(String dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    @JsonProperty("influence_score")
    public Object getInfluenceScore() {
        return influenceScore;
    }

    @JsonProperty("influence_score")
    public void setInfluenceScore(Object influenceScore) {
        this.influenceScore = influenceScore;
    }

    @JsonProperty("no_of_followers")
    public Object getNoOfFollowers() {
        return noOfFollowers;
    }

    @JsonProperty("no_of_followers")
    public void setNoOfFollowers(Object noOfFollowers) {
        this.noOfFollowers = noOfFollowers;
    }

    @JsonProperty("no_of_posts")
    public Object getNoOfPosts() {
        return noOfPosts;
    }

    @JsonProperty("no_of_posts")
    public void setNoOfPosts(Object noOfPosts) {
        this.noOfPosts = noOfPosts;
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