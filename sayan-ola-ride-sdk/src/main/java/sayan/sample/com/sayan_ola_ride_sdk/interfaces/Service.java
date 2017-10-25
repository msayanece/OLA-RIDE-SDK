package sayan.sample.com.sayan_ola_ride_sdk.interfaces;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Query;
import sayan.sample.com.sayan_ola_ride_sdk.postparameters.CancelRideParameter;
import sayan.sample.com.sayan_ola_ride_sdk.postparameters.RideFeedbackParameters;
import sayan.sample.com.sayan_ola_ride_sdk.postparameters.RideRequestParameters;
import sayan.sample.com.sayan_ola_ride_sdk.postparameters.SOSParameter;
import sayan.sample.com.sayan_ola_ride_sdk.response.CancelRideBookingResponse;
import sayan.sample.com.sayan_ola_ride_sdk.response.CouponResponse;
import sayan.sample.com.sayan_ola_ride_sdk.response.MyRidesHistoryResponse;
import sayan.sample.com.sayan_ola_ride_sdk.response.ProductsEstimateResponse;
import sayan.sample.com.sayan_ola_ride_sdk.response.ProductsResponse;
import sayan.sample.com.sayan_ola_ride_sdk.response.RideFeedbackResponse;
import sayan.sample.com.sayan_ola_ride_sdk.response.RideResponse;
import sayan.sample.com.sayan_ola_ride_sdk.response.SOSResponse;
import sayan.sample.com.sayan_ola_ride_sdk.response.TrackCabBookingResponse;

/**
 * Created by Admin on 20-10-2017.
 */

public interface Service {

    /**
     * Gets information about the products offered at a given location.
     *
     * Get real time information about Ola rides available at a given user location. Access the following information by providing the location (latitude & longitude) of your user.
     *
     * Rides currently available near the location.
     * Categories that the rides belong to.
     * Estimated time of arrival.
     * Ride fare in rupees.
     * Ride Cancellation Policy.
     * Fare details include standard fare and other applicable charges such as peak pricing.
     * Note : Fares, ride categories available and cancellation policy differ from city to city.
     *
     * @param headers mandatory header map with key...
     *                1) X-APP-TOKEN and value got from the OLA developer dashboard
     * @param latitude Latitude component of pickup location.
     * @param longitude Longitude component of pickup location.
     *
     * @return the request {@link Call}
     */
    @GET("/v1/products")
    Call<ProductsResponse> getProducts(@HeaderMap Map<String, String> headers,
                                       @Query("pickup_lat") float latitude,
                                       @Query("pickup_lng") float longitude);

    /**
     * Gets information about the products offered at a given location.
     *
     * Get real time information about Ola rides available at a given user location. Access the following information by providing the location (latitude & longitude) of your user.
     *
     * Rides currently available near the location.
     * Categories that the rides belong to.
     * Estimated time of arrival.
     * Ride fare in rupees.
     * Ride Cancellation Policy.
     * Fare details include standard fare and other applicable charges such as peak pricing.
     * Note : Fares, ride categories available and cancellation policy differ from city to city.
     *
     * @param headers mandatory header map with key...
     *                1) X-APP-TOKEN and value got from the OLA developer dashboard
     * @param latitude Latitude component of pickup location.
     * @param longitude Longitude component of pickup location.
     * @param category category can be 'rental', 'share', 'outstation'.
     *
     * @return the request {@link Call}
     */
    @GET("/v1/products")
    Call<ProductsResponse> getProducts(@HeaderMap Map<String, String> headers,
                                       @Query("pickup_lat") float latitude,
                                       @Query("pickup_lng") float longitude,
                                       @Query("category") String category);

    /**
     * Gets estimated values about the products offered at a given pickup location with a drop location.
     *
     * Your user will be able to know the cost of a trip even before/without booking a ride. Access the following information by providing the location (latitude & longitude) of your user.
     *
     * Estimated cost of a trip depending upon
     * Category selected
     * Distance (km) between pickup and drop locations provided
     * Estimated ride time (min)
     * Peak pricing (when applicable)
     * Variable range- Minimum cost and Maximum cost
     * Peak pricing, when applicable, will also be specified (e.g. 1x/1.5x)
     * Value in Rupee currency only.
     *
     * @param headers mandatory header map with key...
     *                1) X-APP-TOKEN and value got from the OLA developer dashboard
     * @param pickupLatitude Latitude component of pickup location.
     * @param pickupLongitude Longitude component of pickup location.
     * @param dropLatitude Latitude component of drop location.
     * @param dropLongitude Longitude component of drop location.
     *
     * @return the request {@link Call}
     */
    @GET("/v1/products")
    Call<ProductsEstimateResponse> getRideEstimate(@HeaderMap Map<String, String> headers,
                                                   @Query("pickup_lat") float pickupLatitude,
                                                   @Query("pickup_lng") float pickupLongitude,
                                                   @Query("drop_lat") float dropLatitude,
                                                   @Query("drop_lng") float dropLongitude);

    /**
     * Requests a ride on behalf of a user given the RideRequestParameters.
     *
     * Solve your users’ local travel needs by letting them book the nearest Ola cab. By providing your user’s location (latitude & longitude) and your partner token (X-APP token), you can enable users to :
     *
     * Login to Ola account.
     * Sign up with Ola in case they’re not registered.
     * After authentication, your users can :
     *
     * Book the nearest available Ola cab.
     * Get vehicle and driver details on the app and also by sms.
     * Get estimated time of arrival to pickup point (mins).
     * Get share-ride url - users can share this link with friends/family to let them track the ride.
     * Check value of multiplier applied on booking when peak pricing is applicable, e.g. 1.5X.
     * Your users can book a cab only if they’ve registered with Ola. Users must be logged into their Ola account in order to make a booking.
     *
     * Note : Advance bookings (RIDE LATER) are now available..
     *
     * @param rideRequestParameters The ride request parameters.
     *                              Create an object of RideRequestParameters {@link RideRequestParameters} using builder class
     *
     * @param headers mandatory header map with key...
     *                1) X-APP-TOKEN and value got from the OLA developer dashboard
     *                2) Authorization and value access token got from the OLA after user logged in like...
     *                      "Bearer baac2cfc6be4489***f"
     *                3) Content-Type and value as "application/json" must
     * @return the request {@link Call}
     */
    @POST("/v1/bookings/create")
    Call<RideResponse> requestRide(@HeaderMap Map<String, String> headers, @Body RideRequestParameters rideRequestParameters);


    /**
     * Ride tracking is available for cabs booked by a registered Ola user.
     *
     * By providing your partner token and a valid authorization code, you can provide your users the following benefits.
     *
     * Track a cab on its way to the pickup point.
     * Get estimated time of arrival to pickup point.
     * Track location of the cab while the trip is in progress.
     * Invoice of the ride can be viewed after ride completion..
     *
     * @param headers mandatory header map with key...
     *                 1) X-APP-TOKEN and value got from the OLA developer dashboard
     *                 2) Authorization and value access token got from the OLA after user logged in like...
     *                      "Bearer baac2cfc6be4489***f"
     * @param bookingId the cab booking id generated when user request a cab ride using requestRide() using service {@link Service}.
     *
     * @return the request {@link Call}
     */
    @GET("/v1/bookings/track_ride")
    Call<TrackCabBookingResponse> trackRideDetails(@HeaderMap Map<String, String> headers,
                                                   @Query("booking_id") String bookingId);


    /**
     * Bookings made by a registered Ola user can be cancelled before the trip begins.

     * By providing the booking_id of a booking, a cancellation reason and a valid authorization code, you can enable your users to :
     *
     * Cancel a booking before the trip begins.
     * Get confirmation of booking cancellation via API and SMS.
     * Cancellation reasons are required to be passed while calling this API. Valid cancel reasons.
     *
     * @param cancelRideParameter The cancel ride parameters with booking id and reason to cancel.
     *                              Create an object of CancelRideParameter {@link CancelRideParameter}  using builder class
     *
     * @param headers mandatory header map with key...
     *                1) X-APP-TOKEN and value got from the OLA developer dashboard
     *                2) Authorization and value access token got from the OLA after user logged in like...
     *                      "Bearer baac2cfc6be4489***f"
     *                3) Content-Type and value as "application/json" must
     * @return the request {@link Call}
     */
    @POST("/v1/bookings/cancel")
    Call<CancelRideBookingResponse> cancelRide(@HeaderMap Map<String, String> headers, @Body CancelRideParameter cancelRideParameter);


    /**
     * Your users can submit their ride experience at the end of every trip.
     *
     * @param rideFeedbackParameters The ride feedback parameters with booking id, rating, feedback text, and comments.
     *                              Create an object of RideFeedbackParameters {@link RideFeedbackParameters} using builder class
     *
     * @param headers mandatory header map with key...
     *                1) X-APP-TOKEN and value got from the OLA developer dashboard
     *                2) Authorization and value access token got from the OLA after user logged in like...
     *                      "Bearer baac2cfc6be4489***f"
     *                3) Content-Type and value as "application/json" must
     * @return the request {@link Call}
     */
    @POST("/v1/bookings/feedback")
    Call<RideFeedbackResponse> giveRideFeedback(@HeaderMap Map<String, String> headers, @Body RideFeedbackParameters rideFeedbackParameters);


    /**
     * Users can use SOS signal during a trip if they feel threatened by serious and/or imminent danger and require immediate assistance.
     *
     * @param sosParameter The SOS parameters with booking id.
     *                              Create an object of RideFeedbackParameters {@link SOSParameter} using builder class
     *
     * @param headers mandatory header map with key...
     *                1) X-APP-TOKEN and value got from the OLA developer dashboard
     *                2) Authorization and value access token got from the OLA after user logged in like...
     *                      "Bearer baac2cfc6be4489***f"
     *                3) Content-Type and value as "application/json" must
     * @return the request {@link Call}
     */
    @POST("/v1/sos/signal")
    Call<SOSResponse> sendSOSSignal(@HeaderMap Map<String, String> headers, @Body SOSParameter sosParameter);

    /**
     * Validate the partner specific coupon code.
     *
     * @param headers mandatory header map with key...
     *                1) X-APP-TOKEN and value got from the OLA developer dashboard
     *                2) Authorization and value access token got from the OLA after user logged in like...
     *                      "Bearer baac2cfc6be4489***f"
     * @param pickupLatitude Latitude component of pickup location.
     * @param pickupLongitude Longitude component of pickup location.
     * @param couponCode the Partner specific coupon code.
     * @param category Car category type, ex: mini.
     *
     * @return the request {@link Call}
     */
    @GET("/v1/coupons/validate")
    Call<CouponResponse> validateCoupon(@HeaderMap Map<String, String> headers,
                                        @Query("pickup_lat") float pickupLatitude,
                                        @Query("pickup_lng") float pickupLongitude,
                                        @Query("coupon_code") String couponCode,
                                        @Query("category") String category);

    /**
     * Can be used to see the status of your current active and past rides. This is something just like 'Your Rides' page in Ola App.
     *
     * @param headers mandatory header map with key...
     *                1) X-APP-TOKEN and value got from the OLA developer dashboard
     *                2) Authorization and value access token got from the OLA after user logged in like...
     *                      "Bearer baac2cfc6be4489***f"
     *                 3) Content-Type and value as "application/json" must
     * @param page [Optional] Response is paginated with most recent bookings first having 10 bookings per page
     *
     * Default value: 1
     *
     * @return the request {@link Call}
     */
    @GET("/v1/bookings/my_rides")
    Call<MyRidesHistoryResponse> getMyRides(@HeaderMap Map<String, String> headers,
                                            @Query("page") Integer page);

    /**
     * Can be used to see the status of your current active and past rides. This is something just like 'Your Rides' page in Ola App.
     *
     * Using default value for page = 1, recent 10 bookings
     * @param headers mandatory header map with key...
     *                1) X-APP-TOKEN and value got from the OLA developer dashboard
     *                2) Authorization and value access token got from the OLA after user logged in like...
     *                      "Bearer baac2cfc6be4489***f"
     *                 3) Content-Type and value as "application/json" must
     *
     * @return the request {@link Call}
     */
    @GET("/v1/bookings/my_rides")
    Call<MyRidesHistoryResponse> getMyRides(@HeaderMap Map<String, String> headers);
}
