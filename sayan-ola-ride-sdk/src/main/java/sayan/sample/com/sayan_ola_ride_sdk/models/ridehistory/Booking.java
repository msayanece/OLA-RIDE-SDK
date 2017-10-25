package sayan.sample.com.sayan_ola_ride_sdk.models.ridehistory;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Admin on 23-10-2017.
 */

public class Booking {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("booking_id")
    @Expose
    private String bookingId;
    @SerializedName("pickup_lat")
    @Expose
    private Float pickupLat;
    @SerializedName("pickup_lng")
    @Expose
    private Float pickupLng;
    @SerializedName("drop_lat")
    @Expose
    private Float dropLat;
    @SerializedName("drop_lng")
    @Expose
    private Float dropLng;
    @SerializedName("booking_status")
    @Expose
    private String bookingStatus;
    @SerializedName("booking_time")
    @Expose
    private String bookingTime;
    @SerializedName("category")
    @Expose
    private String category;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public Float getPickupLat() {
        return pickupLat;
    }

    public void setPickupLat(Float pickupLat) {
        this.pickupLat = pickupLat;
    }

    public Float getPickupLng() {
        return pickupLng;
    }

    public void setPickupLng(Float pickupLng) {
        this.pickupLng = pickupLng;
    }

    public Float getDropLat() {
        return dropLat;
    }

    public void setDropLat(Float dropLat) {
        this.dropLat = dropLat;
    }

    public Float getDropLng() {
        return dropLng;
    }

    public void setDropLng(Float dropLng) {
        this.dropLng = dropLng;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public String getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(String bookingTime) {
        this.bookingTime = bookingTime;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
