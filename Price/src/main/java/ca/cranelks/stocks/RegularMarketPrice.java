
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
    "raw",
    "fmt"
})
@Generated("jsonschema2pojo")
public class RegularMarketPrice {

    @JsonProperty("raw")
    private Double raw;
    @JsonProperty("fmt")
    private String fmt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("raw")
    public Double getRaw() {
        return raw;
    }

    @JsonProperty("raw")
    public void setRaw(Double raw) {
        this.raw = raw;
    }

    public RegularMarketPrice withRaw(Double raw) {
        this.raw = raw;
        return this;
    }

    @JsonProperty("fmt")
    public String getFmt() {
        return fmt;
    }

    @JsonProperty("fmt")
    public void setFmt(String fmt) {
        this.fmt = fmt;
    }

    public RegularMarketPrice withFmt(String fmt) {
        this.fmt = fmt;
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

    public RegularMarketPrice withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RegularMarketPrice.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("raw");
        sb.append('=');
        sb.append(((this.raw == null)?"<null>":this.raw));
        sb.append(',');
        sb.append("fmt");
        sb.append('=');
        sb.append(((this.fmt == null)?"<null>":this.fmt));
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
        result = ((result* 31)+((this.fmt == null)? 0 :this.fmt.hashCode()));
        result = ((result* 31)+((this.raw == null)? 0 :this.raw.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RegularMarketPrice) == false) {
            return false;
        }
        RegularMarketPrice rhs = ((RegularMarketPrice) other);
        return ((((this.fmt == rhs.fmt)||((this.fmt!= null)&&this.fmt.equals(rhs.fmt)))&&((this.raw == rhs.raw)||((this.raw!= null)&&this.raw.equals(rhs.raw))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
