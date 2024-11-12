
package ca.cranelks.stocks;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "quoteSummary"
})
@Generated("jsonschema2pojo")
public class Price {

    @JsonProperty("quoteSummary")
    private QuoteSummary quoteSummary;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("quoteSummary")
    public QuoteSummary getQuoteSummary() {
        return quoteSummary;
    }

    @JsonProperty("quoteSummary")
    public void setQuoteSummary(QuoteSummary quoteSummary) {
        this.quoteSummary = quoteSummary;
    }

    public Price withQuoteSummary(QuoteSummary quoteSummary) {
        this.quoteSummary = quoteSummary;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Price withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Price.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("quoteSummary");
        sb.append('=');
        sb.append(((this.quoteSummary == null)?"<null>":this.quoteSummary));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.quoteSummary == null)? 0 :this.quoteSummary.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Price) == false) {
            return false;
        }
        Price rhs = ((Price) other);
        return (((this.quoteSummary == rhs.quoteSummary)||((this.quoteSummary!= null)&&this.quoteSummary.equals(rhs.quoteSummary)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
