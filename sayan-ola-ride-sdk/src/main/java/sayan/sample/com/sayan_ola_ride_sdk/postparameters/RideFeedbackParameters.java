package sayan.sample.com.sayan_ola_ride_sdk.postparameters;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Admin on 23-10-2017.
 */

public class RideFeedbackParameters {

    @SerializedName("booking_id")
    @Expose
    private String bookingId;
    @SerializedName("rating")
    @Expose
    private Integer rating;
    @SerializedName("feedback")
    @Expose
    private String feedback;
    @SerializedName("comments")
    @Expose
    private String comments;

    private RideFeedbackParameters(String bookingId, Integer rating, String feedback, String comments) {
        this.bookingId = bookingId;
        this.rating = rating;
        this.feedback = feedback;
        this.comments = comments;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public static class Builder{

        private String bookingId;
        private Integer rating;
        private String feedback;
        private String comments;

        public Builder(){}

        public Builder setBookingId(String bookingId) {
            this.bookingId = bookingId;
            return this;
        }

        public Builder setRating(Integer rating) {
            this.rating = rating;
            return this;
        }

        public Builder setFeedback(String feedback) {
            this.feedback = feedback;
            return this;
        }

        public Builder setComments(String comments) {
            this.comments = comments;
            return this;
        }

        public RideFeedbackParameters build(){
            return new RideFeedbackParameters(bookingId,rating,feedback,comments);
        }
    }
}
