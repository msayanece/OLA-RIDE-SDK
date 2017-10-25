package sayan.sample.com.sayan_ola_ride_sdk.models.products;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Sayan on 21-Oct-17.
 */

public class TripDuration {

    @SerializedName("trip_text")
    @Expose
    private String tripText;
    @SerializedName("trip_id")
    @Expose
    private String tripId;

    public String getTripText() {
        return tripText;
    }

    public void setTripText(String tripText) {
        this.tripText = tripText;
    }

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }
}
