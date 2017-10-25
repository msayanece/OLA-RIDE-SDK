package sayan.sample.com.sayan_ola_ride_sdk.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Sayan on 21-Oct-17.
 */

public class RideResponse {

    @SerializedName("booking_id")
    @Expose
    private String bookingId;
    @SerializedName("crn")
    @Expose
    private String crn;
    @SerializedName("driver_name")
    @Expose
    private String driverName;
    @SerializedName("driver_number")
    @Expose
    private String driverNumber;
    @SerializedName("cab_type")
    @Expose
    private String cabType;
    @SerializedName("cab_number")
    @Expose
    private String cabNumber;
    @SerializedName("car_model")
    @Expose
    private String carModel;
    @SerializedName("eta")
    @Expose
    private Integer eta;
    @SerializedName("driver_lat")
    @Expose
    private Float driverLat;
    @SerializedName("driver_lng")
    @Expose
    private Float driverLng;
    @SerializedName("share_ride_url")
    @Expose
    private String shareRideUrl;
    @SerializedName("surcharge_value")
    @Expose
    private String surchargeValue;

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getCrn() {
        return crn;
    }

    public void setCrn(String crn) {
        this.crn = crn;
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

    public String getCabType() {
        return cabType;
    }

    public void setCabType(String cabType) {
        this.cabType = cabType;
    }

    public String getCabNumber() {
        return cabNumber;
    }

    public void setCabNumber(String cabNumber) {
        this.cabNumber = cabNumber;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public Integer getEta() {
        return eta;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
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

    public String getShareRideUrl() {
        return shareRideUrl;
    }

    public void setShareRideUrl(String shareRideUrl) {
        this.shareRideUrl = shareRideUrl;
    }

    public String getSurchargeValue() {
        return surchargeValue;
    }

    public void setSurchargeValue(String surchargeValue) {
        this.surchargeValue = surchargeValue;
    }
}
