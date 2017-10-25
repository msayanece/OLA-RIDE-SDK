package sayan.sample.com.sayan_ola_ride_sdk.postparameters;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Admin on 23-10-2017.
 */

public class SOSParameter {

    @SerializedName("booking_id")
    @Expose
    private String bookingId;

    private SOSParameter(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public static class Builder{

        private String bookingId;

        public Builder() {
        }

        public Builder setBookingId(String bookingId) {
            this.bookingId = bookingId;
            return this;
        }

        public SOSParameter build(){
            return new SOSParameter(bookingId);
        }
    }
}
