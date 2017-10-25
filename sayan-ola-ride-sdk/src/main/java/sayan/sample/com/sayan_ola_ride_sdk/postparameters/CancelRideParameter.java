package sayan.sample.com.sayan_ola_ride_sdk.postparameters;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Admin on 23-10-2017.
 */

public class CancelRideParameter {

    @SerializedName("booking_id")
    @Expose
    private String bookingId;
    @SerializedName("reason")
    @Expose
    private String reason;

    private CancelRideParameter(String bookingId, String reason) {
        this.bookingId = bookingId;
        this.reason = reason;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public static class Builder{
        private String bookingId;
        private String reason;

        public Builder(){}

        public Builder setBookingId(String bookingId) {
            this.bookingId = bookingId;
            return this;
        }

        public Builder setReason(String reason) {
            this.reason = reason;
            return this;
        }

        public CancelRideParameter build(){
            return new CancelRideParameter(bookingId, reason);
        }
    }
}
