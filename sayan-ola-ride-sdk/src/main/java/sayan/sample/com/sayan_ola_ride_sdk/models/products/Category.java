package sayan.sample.com.sayan_ola_ride_sdk.models.products;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Sayan on 20-Oct-17.
 */

public class Category {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("distance_unit")
    @Expose
    private String distanceUnit;
    @SerializedName("time_unit")
    @Expose
    private String timeUnit;
    @SerializedName("eta")
    @Expose
    private Integer eta;
    @SerializedName("distance")
    @Expose
    private String distance;
    @SerializedName("ride_later_enabled")
    @Expose
    private String rideLaterEnabled;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("fare_breakup")
    @Expose
    private List<FareBreakup> fareBreakup = null;
    @SerializedName("cancellation_policy")
    @Expose
    private CancellationPolicy cancellationPolicy;
    @SerializedName("sub_categories")
    @Expose
    private List<Category> subCategories;
    @SerializedName("packages")
    @Expose
    private List<CategoryPackage> packages;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDistanceUnit() {
        return distanceUnit;
    }

    public void setDistanceUnit(String distanceUnit) {
        this.distanceUnit = distanceUnit;
    }

    public String getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
    }

    public Integer getEta() {
        return eta;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getRideLaterEnabled() {
        return rideLaterEnabled;
    }

    public void setRideLaterEnabled(String rideLaterEnabled) {
        this.rideLaterEnabled = rideLaterEnabled;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<FareBreakup> getFareBreakup() {
        return fareBreakup;
    }

    public void setFareBreakup(List<FareBreakup> fareBreakup) {
        this.fareBreakup = fareBreakup;
    }

    public CancellationPolicy getCancellationPolicy() {
        return cancellationPolicy;
    }

    public void setCancellationPolicy(CancellationPolicy cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
    }
}
