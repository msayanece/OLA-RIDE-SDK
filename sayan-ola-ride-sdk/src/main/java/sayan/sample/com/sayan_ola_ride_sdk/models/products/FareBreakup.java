package sayan.sample.com.sayan_ola_ride_sdk.models.products;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Sayan on 20-Oct-17.
 */

public class FareBreakup {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("fare")
    @Expose
    private String fare;
    @SerializedName("minimum_distance")
    @Expose
    private String minimumDistance;
    @SerializedName("minimum_time")
    @Expose
    private String minimumTime;
    @SerializedName("base_fare")
    @Expose
    private String baseFare;
    @SerializedName("minimum_fare")
    @Expose
    private String minimumFare;
    @SerializedName("cost_per_distance")
    @Expose
    private String costPerDistance;
    @SerializedName("waiting_cost_per_minute")
    @Expose
    private String waitingCostPerMinute;
    @SerializedName("ride_cost_per_minute")
    @Expose
    private String rideCostPerMinute;
    @SerializedName("rates_higher_than_usual")
    @Expose
    private Boolean ratesHigherThanUsual;
    @SerializedName("surcharge")
    @Expose
    private List<Object> surcharge = null;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMinimumDistance() {
        return minimumDistance;
    }

    public void setMinimumDistance(String minimumDistance) {
        this.minimumDistance = minimumDistance;
    }

    public String getMinimumTime() {
        return minimumTime;
    }

    public void setMinimumTime(String minimumTime) {
        this.minimumTime = minimumTime;
    }

    public String getBaseFare() {
        return baseFare;
    }

    public void setBaseFare(String baseFare) {
        this.baseFare = baseFare;
    }

    public String getMinimumFare() {
        return minimumFare;
    }

    public void setMinimumFare(String minimumFare) {
        this.minimumFare = minimumFare;
    }

    public String getCostPerDistance() {
        return costPerDistance;
    }

    public void setCostPerDistance(String costPerDistance) {
        this.costPerDistance = costPerDistance;
    }

    public String getWaitingCostPerMinute() {
        return waitingCostPerMinute;
    }

    public void setWaitingCostPerMinute(String waitingCostPerMinute) {
        this.waitingCostPerMinute = waitingCostPerMinute;
    }

    public String getRideCostPerMinute() {
        return rideCostPerMinute;
    }

    public void setRideCostPerMinute(String rideCostPerMinute) {
        this.rideCostPerMinute = rideCostPerMinute;
    }

    public Boolean getRatesHigherThanUsual() {
        return ratesHigherThanUsual;
    }

    public void setRatesHigherThanUsual(Boolean ratesHigherThanUsual) {
        this.ratesHigherThanUsual = ratesHigherThanUsual;
    }

    public List<Object> getSurcharge() {
        return surcharge;
    }

    public void setSurcharge(List<Object> surcharge) {
        this.surcharge = surcharge;
    }

    public String getFare() {
        return fare;
    }

    public void setFare(String fare) {
        this.fare = fare;
    }
}
