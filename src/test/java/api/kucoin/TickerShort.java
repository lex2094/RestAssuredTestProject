package api.kucoin;

public class TickerShort {
    private String name;
    private Float changeRate;

    public String getName() {
        return name;
    }

    public Float getChangeRate() {
        return changeRate;
    }

    public TickerShort(String name, Float changeRate) {
        this.name = name;
        this.changeRate = changeRate;
    }
}
