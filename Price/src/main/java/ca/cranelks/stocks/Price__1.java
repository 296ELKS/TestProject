
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
    "maxAge",
    "preMarketChangePercent",
    "preMarketChange",
    "preMarketTime",
    "preMarketPrice",
    "preMarketSource",
    "postMarketChange",
    "postMarketPrice",
    "regularMarketChangePercent",
    "regularMarketChange",
    "regularMarketTime",
    "priceHint",
    "regularMarketPrice",
    "regularMarketDayHigh",
    "regularMarketDayLow",
    "regularMarketVolume",
    "averageDailyVolume10Day",
    "averageDailyVolume3Month",
    "regularMarketPreviousClose",
    "regularMarketSource",
    "regularMarketOpen",
    "strikePrice",
    "openInterest",
    "exchange",
    "exchangeName",
    "exchangeDataDelayedBy",
    "marketState",
    "quoteType",
    "symbol",
    "underlyingSymbol",
    "shortName",
    "longName",
    "currency",
    "quoteSourceName",
    "currencySymbol",
    "fromCurrency",
    "toCurrency",
    "lastMarket",
    "volume24Hr",
    "volumeAllCurrencies",
    "circulatingSupply",
    "marketCap"
})
@Generated("jsonschema2pojo")
public class Price__1 {

    @JsonProperty("maxAge")
    private Integer maxAge;
    @JsonProperty("preMarketChangePercent")
    private PreMarketChangePercent preMarketChangePercent;
    @JsonProperty("preMarketChange")
    private PreMarketChange preMarketChange;
    @JsonProperty("preMarketTime")
    private Integer preMarketTime;
    @JsonProperty("preMarketPrice")
    private PreMarketPrice preMarketPrice;
    @JsonProperty("preMarketSource")
    private String preMarketSource;
    @JsonProperty("postMarketChange")
    private PostMarketChange postMarketChange;
    @JsonProperty("postMarketPrice")
    private PostMarketPrice postMarketPrice;
    @JsonProperty("regularMarketChangePercent")
    private RegularMarketChangePercent regularMarketChangePercent;
    @JsonProperty("regularMarketChange")
    private RegularMarketChange regularMarketChange;
    @JsonProperty("regularMarketTime")
    private Integer regularMarketTime;
    @JsonProperty("priceHint")
    private PriceHint priceHint;
    @JsonProperty("regularMarketPrice")
    private RegularMarketPrice regularMarketPrice;
    @JsonProperty("regularMarketDayHigh")
    private RegularMarketDayHigh regularMarketDayHigh;
    @JsonProperty("regularMarketDayLow")
    private RegularMarketDayLow regularMarketDayLow;
    @JsonProperty("regularMarketVolume")
    private RegularMarketVolume regularMarketVolume;
    @JsonProperty("averageDailyVolume10Day")
    private AverageDailyVolume10Day averageDailyVolume10Day;
    @JsonProperty("averageDailyVolume3Month")
    private AverageDailyVolume3Month averageDailyVolume3Month;
    @JsonProperty("regularMarketPreviousClose")
    private RegularMarketPreviousClose regularMarketPreviousClose;
    @JsonProperty("regularMarketSource")
    private String regularMarketSource;
    @JsonProperty("regularMarketOpen")
    private RegularMarketOpen regularMarketOpen;
    @JsonProperty("strikePrice")
    private StrikePrice strikePrice;
    @JsonProperty("openInterest")
    private OpenInterest openInterest;
    @JsonProperty("exchange")
    private String exchange;
    @JsonProperty("exchangeName")
    private String exchangeName;
    @JsonProperty("exchangeDataDelayedBy")
    private Integer exchangeDataDelayedBy;
    @JsonProperty("marketState")
    private String marketState;
    @JsonProperty("quoteType")
    private String quoteType;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("underlyingSymbol")
    private Object underlyingSymbol;
    @JsonProperty("shortName")
    private String shortName;
    @JsonProperty("longName")
    private String longName;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("quoteSourceName")
    private String quoteSourceName;
    @JsonProperty("currencySymbol")
    private String currencySymbol;
    @JsonProperty("fromCurrency")
    private Object fromCurrency;
    @JsonProperty("toCurrency")
    private Object toCurrency;
    @JsonProperty("lastMarket")
    private Object lastMarket;
    @JsonProperty("volume24Hr")
    private Volume24Hr volume24Hr;
    @JsonProperty("volumeAllCurrencies")
    private VolumeAllCurrencies volumeAllCurrencies;
    @JsonProperty("circulatingSupply")
    private CirculatingSupply circulatingSupply;
    @JsonProperty("marketCap")
    private MarketCap marketCap;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("maxAge")
    public Integer getMaxAge() {
        return maxAge;
    }

    @JsonProperty("maxAge")
    public void setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
    }

    public Price__1 withMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
        return this;
    }

    @JsonProperty("preMarketChangePercent")
    public PreMarketChangePercent getPreMarketChangePercent() {
        return preMarketChangePercent;
    }

    @JsonProperty("preMarketChangePercent")
    public void setPreMarketChangePercent(PreMarketChangePercent preMarketChangePercent) {
        this.preMarketChangePercent = preMarketChangePercent;
    }

    public Price__1 withPreMarketChangePercent(PreMarketChangePercent preMarketChangePercent) {
        this.preMarketChangePercent = preMarketChangePercent;
        return this;
    }

    @JsonProperty("preMarketChange")
    public PreMarketChange getPreMarketChange() {
        return preMarketChange;
    }

    @JsonProperty("preMarketChange")
    public void setPreMarketChange(PreMarketChange preMarketChange) {
        this.preMarketChange = preMarketChange;
    }

    public Price__1 withPreMarketChange(PreMarketChange preMarketChange) {
        this.preMarketChange = preMarketChange;
        return this;
    }

    @JsonProperty("preMarketTime")
    public Integer getPreMarketTime() {
        return preMarketTime;
    }

    @JsonProperty("preMarketTime")
    public void setPreMarketTime(Integer preMarketTime) {
        this.preMarketTime = preMarketTime;
    }

    public Price__1 withPreMarketTime(Integer preMarketTime) {
        this.preMarketTime = preMarketTime;
        return this;
    }

    @JsonProperty("preMarketPrice")
    public PreMarketPrice getPreMarketPrice() {
        return preMarketPrice;
    }

    @JsonProperty("preMarketPrice")
    public void setPreMarketPrice(PreMarketPrice preMarketPrice) {
        this.preMarketPrice = preMarketPrice;
    }

    public Price__1 withPreMarketPrice(PreMarketPrice preMarketPrice) {
        this.preMarketPrice = preMarketPrice;
        return this;
    }

    @JsonProperty("preMarketSource")
    public String getPreMarketSource() {
        return preMarketSource;
    }

    @JsonProperty("preMarketSource")
    public void setPreMarketSource(String preMarketSource) {
        this.preMarketSource = preMarketSource;
    }

    public Price__1 withPreMarketSource(String preMarketSource) {
        this.preMarketSource = preMarketSource;
        return this;
    }

    @JsonProperty("postMarketChange")
    public PostMarketChange getPostMarketChange() {
        return postMarketChange;
    }

    @JsonProperty("postMarketChange")
    public void setPostMarketChange(PostMarketChange postMarketChange) {
        this.postMarketChange = postMarketChange;
    }

    public Price__1 withPostMarketChange(PostMarketChange postMarketChange) {
        this.postMarketChange = postMarketChange;
        return this;
    }

    @JsonProperty("postMarketPrice")
    public PostMarketPrice getPostMarketPrice() {
        return postMarketPrice;
    }

    @JsonProperty("postMarketPrice")
    public void setPostMarketPrice(PostMarketPrice postMarketPrice) {
        this.postMarketPrice = postMarketPrice;
    }

    public Price__1 withPostMarketPrice(PostMarketPrice postMarketPrice) {
        this.postMarketPrice = postMarketPrice;
        return this;
    }

    @JsonProperty("regularMarketChangePercent")
    public RegularMarketChangePercent getRegularMarketChangePercent() {
        return regularMarketChangePercent;
    }

    @JsonProperty("regularMarketChangePercent")
    public void setRegularMarketChangePercent(RegularMarketChangePercent regularMarketChangePercent) {
        this.regularMarketChangePercent = regularMarketChangePercent;
    }

    public Price__1 withRegularMarketChangePercent(RegularMarketChangePercent regularMarketChangePercent) {
        this.regularMarketChangePercent = regularMarketChangePercent;
        return this;
    }

    @JsonProperty("regularMarketChange")
    public RegularMarketChange getRegularMarketChange() {
        return regularMarketChange;
    }

    @JsonProperty("regularMarketChange")
    public void setRegularMarketChange(RegularMarketChange regularMarketChange) {
        this.regularMarketChange = regularMarketChange;
    }

    public Price__1 withRegularMarketChange(RegularMarketChange regularMarketChange) {
        this.regularMarketChange = regularMarketChange;
        return this;
    }

    @JsonProperty("regularMarketTime")
    public Integer getRegularMarketTime() {
        return regularMarketTime;
    }

    @JsonProperty("regularMarketTime")
    public void setRegularMarketTime(Integer regularMarketTime) {
        this.regularMarketTime = regularMarketTime;
    }

    public Price__1 withRegularMarketTime(Integer regularMarketTime) {
        this.regularMarketTime = regularMarketTime;
        return this;
    }

    @JsonProperty("priceHint")
    public PriceHint getPriceHint() {
        return priceHint;
    }

    @JsonProperty("priceHint")
    public void setPriceHint(PriceHint priceHint) {
        this.priceHint = priceHint;
    }

    public Price__1 withPriceHint(PriceHint priceHint) {
        this.priceHint = priceHint;
        return this;
    }

    @JsonProperty("regularMarketPrice")
    public RegularMarketPrice getRegularMarketPrice() {
        return regularMarketPrice;
    }

    @JsonProperty("regularMarketPrice")
    public void setRegularMarketPrice(RegularMarketPrice regularMarketPrice) {
        this.regularMarketPrice = regularMarketPrice;
    }

    public Price__1 withRegularMarketPrice(RegularMarketPrice regularMarketPrice) {
        this.regularMarketPrice = regularMarketPrice;
        return this;
    }

    @JsonProperty("regularMarketDayHigh")
    public RegularMarketDayHigh getRegularMarketDayHigh() {
        return regularMarketDayHigh;
    }

    @JsonProperty("regularMarketDayHigh")
    public void setRegularMarketDayHigh(RegularMarketDayHigh regularMarketDayHigh) {
        this.regularMarketDayHigh = regularMarketDayHigh;
    }

    public Price__1 withRegularMarketDayHigh(RegularMarketDayHigh regularMarketDayHigh) {
        this.regularMarketDayHigh = regularMarketDayHigh;
        return this;
    }

    @JsonProperty("regularMarketDayLow")
    public RegularMarketDayLow getRegularMarketDayLow() {
        return regularMarketDayLow;
    }

    @JsonProperty("regularMarketDayLow")
    public void setRegularMarketDayLow(RegularMarketDayLow regularMarketDayLow) {
        this.regularMarketDayLow = regularMarketDayLow;
    }

    public Price__1 withRegularMarketDayLow(RegularMarketDayLow regularMarketDayLow) {
        this.regularMarketDayLow = regularMarketDayLow;
        return this;
    }

    @JsonProperty("regularMarketVolume")
    public RegularMarketVolume getRegularMarketVolume() {
        return regularMarketVolume;
    }

    @JsonProperty("regularMarketVolume")
    public void setRegularMarketVolume(RegularMarketVolume regularMarketVolume) {
        this.regularMarketVolume = regularMarketVolume;
    }

    public Price__1 withRegularMarketVolume(RegularMarketVolume regularMarketVolume) {
        this.regularMarketVolume = regularMarketVolume;
        return this;
    }

    @JsonProperty("averageDailyVolume10Day")
    public AverageDailyVolume10Day getAverageDailyVolume10Day() {
        return averageDailyVolume10Day;
    }

    @JsonProperty("averageDailyVolume10Day")
    public void setAverageDailyVolume10Day(AverageDailyVolume10Day averageDailyVolume10Day) {
        this.averageDailyVolume10Day = averageDailyVolume10Day;
    }

    public Price__1 withAverageDailyVolume10Day(AverageDailyVolume10Day averageDailyVolume10Day) {
        this.averageDailyVolume10Day = averageDailyVolume10Day;
        return this;
    }

    @JsonProperty("averageDailyVolume3Month")
    public AverageDailyVolume3Month getAverageDailyVolume3Month() {
        return averageDailyVolume3Month;
    }

    @JsonProperty("averageDailyVolume3Month")
    public void setAverageDailyVolume3Month(AverageDailyVolume3Month averageDailyVolume3Month) {
        this.averageDailyVolume3Month = averageDailyVolume3Month;
    }

    public Price__1 withAverageDailyVolume3Month(AverageDailyVolume3Month averageDailyVolume3Month) {
        this.averageDailyVolume3Month = averageDailyVolume3Month;
        return this;
    }

    @JsonProperty("regularMarketPreviousClose")
    public RegularMarketPreviousClose getRegularMarketPreviousClose() {
        return regularMarketPreviousClose;
    }

    @JsonProperty("regularMarketPreviousClose")
    public void setRegularMarketPreviousClose(RegularMarketPreviousClose regularMarketPreviousClose) {
        this.regularMarketPreviousClose = regularMarketPreviousClose;
    }

    public Price__1 withRegularMarketPreviousClose(RegularMarketPreviousClose regularMarketPreviousClose) {
        this.regularMarketPreviousClose = regularMarketPreviousClose;
        return this;
    }

    @JsonProperty("regularMarketSource")
    public String getRegularMarketSource() {
        return regularMarketSource;
    }

    @JsonProperty("regularMarketSource")
    public void setRegularMarketSource(String regularMarketSource) {
        this.regularMarketSource = regularMarketSource;
    }

    public Price__1 withRegularMarketSource(String regularMarketSource) {
        this.regularMarketSource = regularMarketSource;
        return this;
    }

    @JsonProperty("regularMarketOpen")
    public RegularMarketOpen getRegularMarketOpen() {
        return regularMarketOpen;
    }

    @JsonProperty("regularMarketOpen")
    public void setRegularMarketOpen(RegularMarketOpen regularMarketOpen) {
        this.regularMarketOpen = regularMarketOpen;
    }

    public Price__1 withRegularMarketOpen(RegularMarketOpen regularMarketOpen) {
        this.regularMarketOpen = regularMarketOpen;
        return this;
    }

    @JsonProperty("strikePrice")
    public StrikePrice getStrikePrice() {
        return strikePrice;
    }

    @JsonProperty("strikePrice")
    public void setStrikePrice(StrikePrice strikePrice) {
        this.strikePrice = strikePrice;
    }

    public Price__1 withStrikePrice(StrikePrice strikePrice) {
        this.strikePrice = strikePrice;
        return this;
    }

    @JsonProperty("openInterest")
    public OpenInterest getOpenInterest() {
        return openInterest;
    }

    @JsonProperty("openInterest")
    public void setOpenInterest(OpenInterest openInterest) {
        this.openInterest = openInterest;
    }

    public Price__1 withOpenInterest(OpenInterest openInterest) {
        this.openInterest = openInterest;
        return this;
    }

    @JsonProperty("exchange")
    public String getExchange() {
        return exchange;
    }

    @JsonProperty("exchange")
    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public Price__1 withExchange(String exchange) {
        this.exchange = exchange;
        return this;
    }

    @JsonProperty("exchangeName")
    public String getExchangeName() {
        return exchangeName;
    }

    @JsonProperty("exchangeName")
    public void setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
    }

    public Price__1 withExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
        return this;
    }

    @JsonProperty("exchangeDataDelayedBy")
    public Integer getExchangeDataDelayedBy() {
        return exchangeDataDelayedBy;
    }

    @JsonProperty("exchangeDataDelayedBy")
    public void setExchangeDataDelayedBy(Integer exchangeDataDelayedBy) {
        this.exchangeDataDelayedBy = exchangeDataDelayedBy;
    }

    public Price__1 withExchangeDataDelayedBy(Integer exchangeDataDelayedBy) {
        this.exchangeDataDelayedBy = exchangeDataDelayedBy;
        return this;
    }

    @JsonProperty("marketState")
    public String getMarketState() {
        return marketState;
    }

    @JsonProperty("marketState")
    public void setMarketState(String marketState) {
        this.marketState = marketState;
    }

    public Price__1 withMarketState(String marketState) {
        this.marketState = marketState;
        return this;
    }

    @JsonProperty("quoteType")
    public String getQuoteType() {
        return quoteType;
    }

    @JsonProperty("quoteType")
    public void setQuoteType(String quoteType) {
        this.quoteType = quoteType;
    }

    public Price__1 withQuoteType(String quoteType) {
        this.quoteType = quoteType;
        return this;
    }

    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Price__1 withSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    @JsonProperty("underlyingSymbol")
    public Object getUnderlyingSymbol() {
        return underlyingSymbol;
    }

    @JsonProperty("underlyingSymbol")
    public void setUnderlyingSymbol(Object underlyingSymbol) {
        this.underlyingSymbol = underlyingSymbol;
    }

    public Price__1 withUnderlyingSymbol(Object underlyingSymbol) {
        this.underlyingSymbol = underlyingSymbol;
        return this;
    }

    @JsonProperty("shortName")
    public String getShortName() {
        return shortName;
    }

    @JsonProperty("shortName")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Price__1 withShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    @JsonProperty("longName")
    public String getLongName() {
        return longName;
    }

    @JsonProperty("longName")
    public void setLongName(String longName) {
        this.longName = longName;
    }

    public Price__1 withLongName(String longName) {
        this.longName = longName;
        return this;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Price__1 withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    @JsonProperty("quoteSourceName")
    public String getQuoteSourceName() {
        return quoteSourceName;
    }

    @JsonProperty("quoteSourceName")
    public void setQuoteSourceName(String quoteSourceName) {
        this.quoteSourceName = quoteSourceName;
    }

    public Price__1 withQuoteSourceName(String quoteSourceName) {
        this.quoteSourceName = quoteSourceName;
        return this;
    }

    @JsonProperty("currencySymbol")
    public String getCurrencySymbol() {
        return currencySymbol;
    }

    @JsonProperty("currencySymbol")
    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public Price__1 withCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
        return this;
    }

    @JsonProperty("fromCurrency")
    public Object getFromCurrency() {
        return fromCurrency;
    }

    @JsonProperty("fromCurrency")
    public void setFromCurrency(Object fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public Price__1 withFromCurrency(Object fromCurrency) {
        this.fromCurrency = fromCurrency;
        return this;
    }

    @JsonProperty("toCurrency")
    public Object getToCurrency() {
        return toCurrency;
    }

    @JsonProperty("toCurrency")
    public void setToCurrency(Object toCurrency) {
        this.toCurrency = toCurrency;
    }

    public Price__1 withToCurrency(Object toCurrency) {
        this.toCurrency = toCurrency;
        return this;
    }

    @JsonProperty("lastMarket")
    public Object getLastMarket() {
        return lastMarket;
    }

    @JsonProperty("lastMarket")
    public void setLastMarket(Object lastMarket) {
        this.lastMarket = lastMarket;
    }

    public Price__1 withLastMarket(Object lastMarket) {
        this.lastMarket = lastMarket;
        return this;
    }

    @JsonProperty("volume24Hr")
    public Volume24Hr getVolume24Hr() {
        return volume24Hr;
    }

    @JsonProperty("volume24Hr")
    public void setVolume24Hr(Volume24Hr volume24Hr) {
        this.volume24Hr = volume24Hr;
    }

    public Price__1 withVolume24Hr(Volume24Hr volume24Hr) {
        this.volume24Hr = volume24Hr;
        return this;
    }

    @JsonProperty("volumeAllCurrencies")
    public VolumeAllCurrencies getVolumeAllCurrencies() {
        return volumeAllCurrencies;
    }

    @JsonProperty("volumeAllCurrencies")
    public void setVolumeAllCurrencies(VolumeAllCurrencies volumeAllCurrencies) {
        this.volumeAllCurrencies = volumeAllCurrencies;
    }

    public Price__1 withVolumeAllCurrencies(VolumeAllCurrencies volumeAllCurrencies) {
        this.volumeAllCurrencies = volumeAllCurrencies;
        return this;
    }

    @JsonProperty("circulatingSupply")
    public CirculatingSupply getCirculatingSupply() {
        return circulatingSupply;
    }

    @JsonProperty("circulatingSupply")
    public void setCirculatingSupply(CirculatingSupply circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }

    public Price__1 withCirculatingSupply(CirculatingSupply circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
        return this;
    }

    @JsonProperty("marketCap")
    public MarketCap getMarketCap() {
        return marketCap;
    }

    @JsonProperty("marketCap")
    public void setMarketCap(MarketCap marketCap) {
        this.marketCap = marketCap;
    }

    public Price__1 withMarketCap(MarketCap marketCap) {
        this.marketCap = marketCap;
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

    public Price__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Price__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("maxAge");
        sb.append('=');
        sb.append(((this.maxAge == null)?"<null>":this.maxAge));
        sb.append(',');
        sb.append("preMarketChangePercent");
        sb.append('=');
        sb.append(((this.preMarketChangePercent == null)?"<null>":this.preMarketChangePercent));
        sb.append(',');
        sb.append("preMarketChange");
        sb.append('=');
        sb.append(((this.preMarketChange == null)?"<null>":this.preMarketChange));
        sb.append(',');
        sb.append("preMarketTime");
        sb.append('=');
        sb.append(((this.preMarketTime == null)?"<null>":this.preMarketTime));
        sb.append(',');
        sb.append("preMarketPrice");
        sb.append('=');
        sb.append(((this.preMarketPrice == null)?"<null>":this.preMarketPrice));
        sb.append(',');
        sb.append("preMarketSource");
        sb.append('=');
        sb.append(((this.preMarketSource == null)?"<null>":this.preMarketSource));
        sb.append(',');
        sb.append("postMarketChange");
        sb.append('=');
        sb.append(((this.postMarketChange == null)?"<null>":this.postMarketChange));
        sb.append(',');
        sb.append("postMarketPrice");
        sb.append('=');
        sb.append(((this.postMarketPrice == null)?"<null>":this.postMarketPrice));
        sb.append(',');
        sb.append("regularMarketChangePercent");
        sb.append('=');
        sb.append(((this.regularMarketChangePercent == null)?"<null>":this.regularMarketChangePercent));
        sb.append(',');
        sb.append("regularMarketChange");
        sb.append('=');
        sb.append(((this.regularMarketChange == null)?"<null>":this.regularMarketChange));
        sb.append(',');
        sb.append("regularMarketTime");
        sb.append('=');
        sb.append(((this.regularMarketTime == null)?"<null>":this.regularMarketTime));
        sb.append(',');
        sb.append("priceHint");
        sb.append('=');
        sb.append(((this.priceHint == null)?"<null>":this.priceHint));
        sb.append(',');
        sb.append("regularMarketPrice");
        sb.append('=');
        sb.append(((this.regularMarketPrice == null)?"<null>":this.regularMarketPrice));
        sb.append(',');
        sb.append("regularMarketDayHigh");
        sb.append('=');
        sb.append(((this.regularMarketDayHigh == null)?"<null>":this.regularMarketDayHigh));
        sb.append(',');
        sb.append("regularMarketDayLow");
        sb.append('=');
        sb.append(((this.regularMarketDayLow == null)?"<null>":this.regularMarketDayLow));
        sb.append(',');
        sb.append("regularMarketVolume");
        sb.append('=');
        sb.append(((this.regularMarketVolume == null)?"<null>":this.regularMarketVolume));
        sb.append(',');
        sb.append("averageDailyVolume10Day");
        sb.append('=');
        sb.append(((this.averageDailyVolume10Day == null)?"<null>":this.averageDailyVolume10Day));
        sb.append(',');
        sb.append("averageDailyVolume3Month");
        sb.append('=');
        sb.append(((this.averageDailyVolume3Month == null)?"<null>":this.averageDailyVolume3Month));
        sb.append(',');
        sb.append("regularMarketPreviousClose");
        sb.append('=');
        sb.append(((this.regularMarketPreviousClose == null)?"<null>":this.regularMarketPreviousClose));
        sb.append(',');
        sb.append("regularMarketSource");
        sb.append('=');
        sb.append(((this.regularMarketSource == null)?"<null>":this.regularMarketSource));
        sb.append(',');
        sb.append("regularMarketOpen");
        sb.append('=');
        sb.append(((this.regularMarketOpen == null)?"<null>":this.regularMarketOpen));
        sb.append(',');
        sb.append("strikePrice");
        sb.append('=');
        sb.append(((this.strikePrice == null)?"<null>":this.strikePrice));
        sb.append(',');
        sb.append("openInterest");
        sb.append('=');
        sb.append(((this.openInterest == null)?"<null>":this.openInterest));
        sb.append(',');
        sb.append("exchange");
        sb.append('=');
        sb.append(((this.exchange == null)?"<null>":this.exchange));
        sb.append(',');
        sb.append("exchangeName");
        sb.append('=');
        sb.append(((this.exchangeName == null)?"<null>":this.exchangeName));
        sb.append(',');
        sb.append("exchangeDataDelayedBy");
        sb.append('=');
        sb.append(((this.exchangeDataDelayedBy == null)?"<null>":this.exchangeDataDelayedBy));
        sb.append(',');
        sb.append("marketState");
        sb.append('=');
        sb.append(((this.marketState == null)?"<null>":this.marketState));
        sb.append(',');
        sb.append("quoteType");
        sb.append('=');
        sb.append(((this.quoteType == null)?"<null>":this.quoteType));
        sb.append(',');
        sb.append("symbol");
        sb.append('=');
        sb.append(((this.symbol == null)?"<null>":this.symbol));
        sb.append(',');
        sb.append("underlyingSymbol");
        sb.append('=');
        sb.append(((this.underlyingSymbol == null)?"<null>":this.underlyingSymbol));
        sb.append(',');
        sb.append("shortName");
        sb.append('=');
        sb.append(((this.shortName == null)?"<null>":this.shortName));
        sb.append(',');
        sb.append("longName");
        sb.append('=');
        sb.append(((this.longName == null)?"<null>":this.longName));
        sb.append(',');
        sb.append("currency");
        sb.append('=');
        sb.append(((this.currency == null)?"<null>":this.currency));
        sb.append(',');
        sb.append("quoteSourceName");
        sb.append('=');
        sb.append(((this.quoteSourceName == null)?"<null>":this.quoteSourceName));
        sb.append(',');
        sb.append("currencySymbol");
        sb.append('=');
        sb.append(((this.currencySymbol == null)?"<null>":this.currencySymbol));
        sb.append(',');
        sb.append("fromCurrency");
        sb.append('=');
        sb.append(((this.fromCurrency == null)?"<null>":this.fromCurrency));
        sb.append(',');
        sb.append("toCurrency");
        sb.append('=');
        sb.append(((this.toCurrency == null)?"<null>":this.toCurrency));
        sb.append(',');
        sb.append("lastMarket");
        sb.append('=');
        sb.append(((this.lastMarket == null)?"<null>":this.lastMarket));
        sb.append(',');
        sb.append("volume24Hr");
        sb.append('=');
        sb.append(((this.volume24Hr == null)?"<null>":this.volume24Hr));
        sb.append(',');
        sb.append("volumeAllCurrencies");
        sb.append('=');
        sb.append(((this.volumeAllCurrencies == null)?"<null>":this.volumeAllCurrencies));
        sb.append(',');
        sb.append("circulatingSupply");
        sb.append('=');
        sb.append(((this.circulatingSupply == null)?"<null>":this.circulatingSupply));
        sb.append(',');
        sb.append("marketCap");
        sb.append('=');
        sb.append(((this.marketCap == null)?"<null>":this.marketCap));
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
        result = ((result* 31)+((this.symbol == null)? 0 :this.symbol.hashCode()));
        result = ((result* 31)+((this.openInterest == null)? 0 :this.openInterest.hashCode()));
        result = ((result* 31)+((this.regularMarketOpen == null)? 0 :this.regularMarketOpen.hashCode()));
        result = ((result* 31)+((this.regularMarketTime == null)? 0 :this.regularMarketTime.hashCode()));
        result = ((result* 31)+((this.regularMarketChangePercent == null)? 0 :this.regularMarketChangePercent.hashCode()));
        result = ((result* 31)+((this.preMarketSource == null)? 0 :this.preMarketSource.hashCode()));
        result = ((result* 31)+((this.quoteType == null)? 0 :this.quoteType.hashCode()));
        result = ((result* 31)+((this.preMarketChangePercent == null)? 0 :this.preMarketChangePercent.hashCode()));
        result = ((result* 31)+((this.circulatingSupply == null)? 0 :this.circulatingSupply.hashCode()));
        result = ((result* 31)+((this.averageDailyVolume10Day == null)? 0 :this.averageDailyVolume10Day.hashCode()));
        result = ((result* 31)+((this.underlyingSymbol == null)? 0 :this.underlyingSymbol.hashCode()));
        result = ((result* 31)+((this.regularMarketDayHigh == null)? 0 :this.regularMarketDayHigh.hashCode()));
        result = ((result* 31)+((this.regularMarketSource == null)? 0 :this.regularMarketSource.hashCode()));
        result = ((result* 31)+((this.preMarketPrice == null)? 0 :this.preMarketPrice.hashCode()));
        result = ((result* 31)+((this.currency == null)? 0 :this.currency.hashCode()));
        result = ((result* 31)+((this.fromCurrency == null)? 0 :this.fromCurrency.hashCode()));
        result = ((result* 31)+((this.regularMarketPreviousClose == null)? 0 :this.regularMarketPreviousClose.hashCode()));
        result = ((result* 31)+((this.marketCap == null)? 0 :this.marketCap.hashCode()));
        result = ((result* 31)+((this.volume24Hr == null)? 0 :this.volume24Hr.hashCode()));
        result = ((result* 31)+((this.regularMarketChange == null)? 0 :this.regularMarketChange.hashCode()));
        result = ((result* 31)+((this.lastMarket == null)? 0 :this.lastMarket.hashCode()));
        result = ((result* 31)+((this.volumeAllCurrencies == null)? 0 :this.volumeAllCurrencies.hashCode()));
        result = ((result* 31)+((this.averageDailyVolume3Month == null)? 0 :this.averageDailyVolume3Month.hashCode()));
        result = ((result* 31)+((this.exchangeDataDelayedBy == null)? 0 :this.exchangeDataDelayedBy.hashCode()));
        result = ((result* 31)+((this.currencySymbol == null)? 0 :this.currencySymbol.hashCode()));
        result = ((result* 31)+((this.regularMarketPrice == null)? 0 :this.regularMarketPrice.hashCode()));
        result = ((result* 31)+((this.marketState == null)? 0 :this.marketState.hashCode()));
        result = ((result* 31)+((this.regularMarketVolume == null)? 0 :this.regularMarketVolume.hashCode()));
        result = ((result* 31)+((this.preMarketChange == null)? 0 :this.preMarketChange.hashCode()));
        result = ((result* 31)+((this.postMarketPrice == null)? 0 :this.postMarketPrice.hashCode()));
        result = ((result* 31)+((this.quoteSourceName == null)? 0 :this.quoteSourceName.hashCode()));
        result = ((result* 31)+((this.postMarketChange == null)? 0 :this.postMarketChange.hashCode()));
        result = ((result* 31)+((this.maxAge == null)? 0 :this.maxAge.hashCode()));
        result = ((result* 31)+((this.toCurrency == null)? 0 :this.toCurrency.hashCode()));
        result = ((result* 31)+((this.priceHint == null)? 0 :this.priceHint.hashCode()));
        result = ((result* 31)+((this.regularMarketDayLow == null)? 0 :this.regularMarketDayLow.hashCode()));
        result = ((result* 31)+((this.exchange == null)? 0 :this.exchange.hashCode()));
        result = ((result* 31)+((this.exchangeName == null)? 0 :this.exchangeName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.shortName == null)? 0 :this.shortName.hashCode()));
        result = ((result* 31)+((this.preMarketTime == null)? 0 :this.preMarketTime.hashCode()));
        result = ((result* 31)+((this.strikePrice == null)? 0 :this.strikePrice.hashCode()));
        result = ((result* 31)+((this.longName == null)? 0 :this.longName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Price__1) == false) {
            return false;
        }
        Price__1 rhs = ((Price__1) other);
        return ((((((((((((((((((((((((((((((((((((((((((((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol)))&&((this.openInterest == rhs.openInterest)||((this.openInterest!= null)&&this.openInterest.equals(rhs.openInterest))))&&((this.regularMarketOpen == rhs.regularMarketOpen)||((this.regularMarketOpen!= null)&&this.regularMarketOpen.equals(rhs.regularMarketOpen))))&&((this.regularMarketTime == rhs.regularMarketTime)||((this.regularMarketTime!= null)&&this.regularMarketTime.equals(rhs.regularMarketTime))))&&((this.regularMarketChangePercent == rhs.regularMarketChangePercent)||((this.regularMarketChangePercent!= null)&&this.regularMarketChangePercent.equals(rhs.regularMarketChangePercent))))&&((this.preMarketSource == rhs.preMarketSource)||((this.preMarketSource!= null)&&this.preMarketSource.equals(rhs.preMarketSource))))&&((this.quoteType == rhs.quoteType)||((this.quoteType!= null)&&this.quoteType.equals(rhs.quoteType))))&&((this.preMarketChangePercent == rhs.preMarketChangePercent)||((this.preMarketChangePercent!= null)&&this.preMarketChangePercent.equals(rhs.preMarketChangePercent))))&&((this.circulatingSupply == rhs.circulatingSupply)||((this.circulatingSupply!= null)&&this.circulatingSupply.equals(rhs.circulatingSupply))))&&((this.averageDailyVolume10Day == rhs.averageDailyVolume10Day)||((this.averageDailyVolume10Day!= null)&&this.averageDailyVolume10Day.equals(rhs.averageDailyVolume10Day))))&&((this.underlyingSymbol == rhs.underlyingSymbol)||((this.underlyingSymbol!= null)&&this.underlyingSymbol.equals(rhs.underlyingSymbol))))&&((this.regularMarketDayHigh == rhs.regularMarketDayHigh)||((this.regularMarketDayHigh!= null)&&this.regularMarketDayHigh.equals(rhs.regularMarketDayHigh))))&&((this.regularMarketSource == rhs.regularMarketSource)||((this.regularMarketSource!= null)&&this.regularMarketSource.equals(rhs.regularMarketSource))))&&((this.preMarketPrice == rhs.preMarketPrice)||((this.preMarketPrice!= null)&&this.preMarketPrice.equals(rhs.preMarketPrice))))&&((this.currency == rhs.currency)||((this.currency!= null)&&this.currency.equals(rhs.currency))))&&((this.fromCurrency == rhs.fromCurrency)||((this.fromCurrency!= null)&&this.fromCurrency.equals(rhs.fromCurrency))))&&((this.regularMarketPreviousClose == rhs.regularMarketPreviousClose)||((this.regularMarketPreviousClose!= null)&&this.regularMarketPreviousClose.equals(rhs.regularMarketPreviousClose))))&&((this.marketCap == rhs.marketCap)||((this.marketCap!= null)&&this.marketCap.equals(rhs.marketCap))))&&((this.volume24Hr == rhs.volume24Hr)||((this.volume24Hr!= null)&&this.volume24Hr.equals(rhs.volume24Hr))))&&((this.regularMarketChange == rhs.regularMarketChange)||((this.regularMarketChange!= null)&&this.regularMarketChange.equals(rhs.regularMarketChange))))&&((this.lastMarket == rhs.lastMarket)||((this.lastMarket!= null)&&this.lastMarket.equals(rhs.lastMarket))))&&((this.volumeAllCurrencies == rhs.volumeAllCurrencies)||((this.volumeAllCurrencies!= null)&&this.volumeAllCurrencies.equals(rhs.volumeAllCurrencies))))&&((this.averageDailyVolume3Month == rhs.averageDailyVolume3Month)||((this.averageDailyVolume3Month!= null)&&this.averageDailyVolume3Month.equals(rhs.averageDailyVolume3Month))))&&((this.exchangeDataDelayedBy == rhs.exchangeDataDelayedBy)||((this.exchangeDataDelayedBy!= null)&&this.exchangeDataDelayedBy.equals(rhs.exchangeDataDelayedBy))))&&((this.currencySymbol == rhs.currencySymbol)||((this.currencySymbol!= null)&&this.currencySymbol.equals(rhs.currencySymbol))))&&((this.regularMarketPrice == rhs.regularMarketPrice)||((this.regularMarketPrice!= null)&&this.regularMarketPrice.equals(rhs.regularMarketPrice))))&&((this.marketState == rhs.marketState)||((this.marketState!= null)&&this.marketState.equals(rhs.marketState))))&&((this.regularMarketVolume == rhs.regularMarketVolume)||((this.regularMarketVolume!= null)&&this.regularMarketVolume.equals(rhs.regularMarketVolume))))&&((this.preMarketChange == rhs.preMarketChange)||((this.preMarketChange!= null)&&this.preMarketChange.equals(rhs.preMarketChange))))&&((this.postMarketPrice == rhs.postMarketPrice)||((this.postMarketPrice!= null)&&this.postMarketPrice.equals(rhs.postMarketPrice))))&&((this.quoteSourceName == rhs.quoteSourceName)||((this.quoteSourceName!= null)&&this.quoteSourceName.equals(rhs.quoteSourceName))))&&((this.postMarketChange == rhs.postMarketChange)||((this.postMarketChange!= null)&&this.postMarketChange.equals(rhs.postMarketChange))))&&((this.maxAge == rhs.maxAge)||((this.maxAge!= null)&&this.maxAge.equals(rhs.maxAge))))&&((this.toCurrency == rhs.toCurrency)||((this.toCurrency!= null)&&this.toCurrency.equals(rhs.toCurrency))))&&((this.priceHint == rhs.priceHint)||((this.priceHint!= null)&&this.priceHint.equals(rhs.priceHint))))&&((this.regularMarketDayLow == rhs.regularMarketDayLow)||((this.regularMarketDayLow!= null)&&this.regularMarketDayLow.equals(rhs.regularMarketDayLow))))&&((this.exchange == rhs.exchange)||((this.exchange!= null)&&this.exchange.equals(rhs.exchange))))&&((this.exchangeName == rhs.exchangeName)||((this.exchangeName!= null)&&this.exchangeName.equals(rhs.exchangeName))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.shortName == rhs.shortName)||((this.shortName!= null)&&this.shortName.equals(rhs.shortName))))&&((this.preMarketTime == rhs.preMarketTime)||((this.preMarketTime!= null)&&this.preMarketTime.equals(rhs.preMarketTime))))&&((this.strikePrice == rhs.strikePrice)||((this.strikePrice!= null)&&this.strikePrice.equals(rhs.strikePrice))))&&((this.longName == rhs.longName)||((this.longName!= null)&&this.longName.equals(rhs.longName))));
    }

}
