package sayan.sample.com.sayan_ola_ride_sdk.models.products;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import sayan.sample.com.sayan_ola_ride_sdk.models.rideestimate.AvailableCab;


/**
 * Created by Sayan on 20-Oct-17.
 */

public class RideEstimate {

    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("trip_durations")
    @Expose
    private List<TripDuration> tripDurations = null;
    @SerializedName("available_cabs")
    @Expose
    private List<AvailableCab> availableCabs = null;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<TripDuration> getTripDurations() {
        return tripDurations;
    }

    public void setTripDurations(List<TripDuration> tripDurations) {
        this.tripDurations = tripDurations;
    }

    public List<AvailableCab> getAvailableCabs() {
        return availableCabs;
    }

    public void setAvailableCabs(List<AvailableCab> availableCabs) {
        this.availableCabs = availableCabs;
    }
}
