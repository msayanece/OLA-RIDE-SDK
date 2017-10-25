package sayan.sample.com.sayan_ola_ride_sdk.models.products;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Admin on 23-10-2017.
 */

public class CategoryPackage {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("package_id")
    @Expose
    private String packageId;
    @SerializedName("package_description")
    @Expose
    private String packageDescription;
    @SerializedName("minimum_distance")
    @Expose
    private String minimumDistance;
    @SerializedName("distance_unit")
    @Expose
    private String distanceUnit;
    @SerializedName("minimum_time")
    @Expose
    private String minimumTime;
    @SerializedName("time_unit")
    @Expose
    private String timeUnit;
    @SerializedName("base_fare")
    @Expose
    private String baseFare;
    @SerializedName("minimum_fare")
    @Expose
    private String minimumFare;
    @SerializedName("cost_per_distance")
    @Expose
    private String costPerDistance;
    @SerializedName("waiting_cost_per_hour")
    @Expose
    private String waitingCostPerHour;
    @SerializedName("ride_cost_per_hour")
    @Expose
    private String rideCostPerHour;
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

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public String getPackageDescription() {
        return packageDescription;
    }

    public void setPackageDescription(String packageDescription) {
        this.packageDescription = packageDescription;
    }

    public String getMinimumDistance() {
        return minimumDistance;
    }

    public void setMinimumDistance(String minimumDistance) {
        this.minimumDistance = minimumDistance;
    }

    public String getDistanceUnit() {
        return distanceUnit;
    }

    public void setDistanceUnit(String distanceUnit) {
        this.distanceUnit = distanceUnit;
    }

    public String getMinimumTime() {
        return minimumTime;
    }

    public void setMinimumTime(String minimumTime) {
        this.minimumTime = minimumTime;
    }

    public String getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
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

    public String getWaitingCostPerHour() {
        return waitingCostPerHour;
    }

    public void setWaitingCostPerHour(String waitingCostPerHour) {
        this.waitingCostPerHour = waitingCostPerHour;
    }

    public String getRideCostPerHour() {
        return rideCostPerHour;
    }

    public void setRideCostPerHour(String rideCostPerHour) {
        this.rideCostPerHour = rideCostPerHour;
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

}
