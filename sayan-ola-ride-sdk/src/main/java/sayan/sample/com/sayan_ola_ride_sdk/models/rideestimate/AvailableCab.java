package sayan.sample.com.sayan_ola_ride_sdk.models.rideestimate;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Sayan on 21-Oct-17.
 */

public class AvailableCab {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("car_model_text")
    @Expose
    private String carModelText;
    @SerializedName("fare_estimate")
    @Expose
    private List<FareEstimate> fareEstimate = null;

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

    public String getCarModelText() {
        return carModelText;
    }

    public void setCarModelText(String carModelText) {
        this.carModelText = carModelText;
    }

    public List<FareEstimate> getFareEstimate() {
        return fareEstimate;
    }

    public void setFareEstimate(List<FareEstimate> fareEstimate) {
        this.fareEstimate = fareEstimate;
    }
}
