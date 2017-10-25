package sayan.sample.com.sayan_ola_ride_sdk.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import sayan.sample.com.sayan_ola_ride_sdk.models.cabtracking.CabDetails;
import sayan.sample.com.sayan_ola_ride_sdk.models.cabtracking.Distance;
import sayan.sample.com.sayan_ola_ride_sdk.models.cabtracking.Duration;


/**
 * Created by Admin on 23-10-2017.
 */

public class TrackCabBookingResponse {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("request_type")
    @Expose
    private String requestType;
    @SerializedName("booking_id")
    @Expose
    private String bookingId;
    @SerializedName("driver_name")
    @Expose
    private String driverName;
    @SerializedName("driver_number")
    @Expose
    private String driverNumber;
    @SerializedName("cab_details")
    @Expose
    private CabDetails cabDetails;
    @SerializedName("driver_image_url")
    @Expose
    private String driverImageUrl;
    @SerializedName("driver_rating")
    @Expose
    private Float driverRating;
    @SerializedName("pickup_lat")
    @Expose
    private Float pickupLat;
    @SerializedName("pickup_lng")
    @Expose
    private Float pickupLng;
    @SerializedName("drop_lat")
    @Expose
    private Double dropLat;
    @SerializedName("drop_lng")
    @Expose
    private Double dropLng;
    @SerializedName("driver_lat")
    @Expose
    private Float driverLat;
    @SerializedName("driver_lng")
    @Expose
    private Float driverLng;
    @SerializedName("duration")
    @Expose
    private Duration duration;
    @SerializedName("distance")
    @Expose
    private Distance distance;
    @SerializedName("booking_status")
    @Expose
    private String bookingStatus;
    @SerializedName("share_ride_url")
    @Expose
    private String shareRideUrl;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverNumber() {
        return driverNumber;
    }

    public void setDriverNumber(String driverNumber) {
        this.driverNumber = driverNumber;
    }

    public CabDetails getCabDetails() {
        return cabDetails;
    }

    public void setCabDetails(CabDetails cabDetails) {
        this.cabDetails = cabDetails;
    }

    public String getDriverImageUrl() {
        return driverImageUrl;
    }

    public void setDriverImageUrl(String driverImageUrl) {
        this.driverImageUrl = driverImageUrl;
    }

    public Float getDriverRating() {
        return driverRating;
    }

    public void setDriverRating(Float driverRating) {
        this.driverRating = driverRating;
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

    public Double getDropLat() {
        return dropLat;
    }

    public void setDropLat(Double dropLat) {
        this.dropLat = dropLat;
    }

    public Double getDropLng() {
        return dropLng;
    }

    public void setDropLng(Double dropLng) {
        this.dropLng = dropLng;
    }

    public Float getDriverLat() {
        return driverLat;
    }

    public void setDriverLat(Float driverLat) {
        this.driverLat = driverLat;
    }

    public Float getDriverLng() {
        return driverLng;
    }

    public void setDriverLng(Float driverLng) {
        this.driverLng = driverLng;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public Distance getDistance() {
        return distance;
    }

    public void setDistance(Distance distance) {
        this.distance = distance;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public String getShareRideUrl() {
        return shareRideUrl;
    }

    public void setShareRideUrl(String shareRideUrl) {
        this.shareRideUrl = shareRideUrl;
    }
}
