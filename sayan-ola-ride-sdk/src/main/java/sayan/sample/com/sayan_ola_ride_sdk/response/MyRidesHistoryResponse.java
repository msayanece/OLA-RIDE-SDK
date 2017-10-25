package sayan.sample.com.sayan_ola_ride_sdk.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import sayan.sample.com.sayan_ola_ride_sdk.models.ridehistory.Booking;


/**
 * Created by Admin on 23-10-2017.
 */

public class MyRidesHistoryResponse {

    @SerializedName("bookings")
    @Expose
    private List<Booking> bookings = null;

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

}
