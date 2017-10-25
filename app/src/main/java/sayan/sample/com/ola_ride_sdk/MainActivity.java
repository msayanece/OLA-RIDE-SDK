package sayan.sample.com.ola_ride_sdk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import sayan.sample.com.sayan_ola_ride_sdk.AccessTokenManager;
import sayan.sample.com.sayan_ola_ride_sdk.Authenticate;
import sayan.sample.com.sayan_ola_ride_sdk.OlaRidesApi;
import sayan.sample.com.sayan_ola_ride_sdk.SessionConfig;
import sayan.sample.com.sayan_ola_ride_sdk.interfaces.AuthenticateCallback;
import sayan.sample.com.sayan_ola_ride_sdk.interfaces.Service;
import sayan.sample.com.sayan_ola_ride_sdk.response.MyRidesHistoryResponse;

public class MainActivity extends AppCompatActivity {

    private SessionConfig mSessionConfig;
    private AccessTokenManager mAccessTokenManager;
    private final String LOG_TAG = "sayanolasample";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSessionConfig = new SessionConfig.Builder()
                .setEnvironment(SessionConfig.Environment.SANDBOX)
                .setoAuthUrl(getResources().getString(R.string.o_auth_url))
                .setxAppToken(getResources().getString(R.string.x_app_token))
//                .setUserName("msayan64@gmail.com")
//                .setPassword("Titirece@50")
                .build();
        mAccessTokenManager = new AccessTokenManager();
        Authenticate.authenticateUser(this, mSessionConfig,mAccessTokenManager, new AuthenticateCallback() {

            @Override
            public void onAccessTokenSaved(final String accessToken) {
                Log.d(LOG_TAG, "Access token: " + accessToken);
                final Service service = OlaRidesApi.with(mSessionConfig).build().createService();
                final Map<String, String> headerMap = new HashMap<>();
                headerMap.put("Authorization", "Bearer "+accessToken);
                headerMap.put("X-APP-TOKEN", mSessionConfig.getxAppToken());
                headerMap.put("Content-Type", "application/json");
                service.getMyRides(headerMap, 2).enqueue(new Callback<MyRidesHistoryResponse>() {
                    @Override
                    public void onResponse(Call<MyRidesHistoryResponse> call, Response<MyRidesHistoryResponse> response) {
                    }

                    @Override
                    public void onFailure(Call<MyRidesHistoryResponse> call, Throwable t) {

                    }
                });
//                headerMap.put("Content-Type", "application/json");
//                RideRequestParameters rideRequestParameters =
//                        new RideRequestParameters.Builder()
//                                .setCategory("mini")
//                                .setPickupMode("NOW")
//                                .setPickupLat(PICK_UP_LATITUDE)
//                                .setPickupLng(PICK_UP_LONGITUDE)
//                                .setDropLat(PICK_UP_LATITUDE+0.1f)
//                                .setDropLng(PICK_UP_LONGITUDE+0.1f)
//                                .build();
//                service.requestRide(headerMap, rideRequestParameters).enqueue(new Callback<RideResponse>() {
//                    @Override
//                    public void onResponse(Call<RideResponse> call, Response<RideResponse> response) {
//                        Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
//                        if (response.isSuccessful()) {
//                            final String bookingId = response.body().getBookingId();
//                            final Map<String, String> trackRideHeaderMap = new HashMap<>();
//                            trackRideHeaderMap.put("Authorization", "Bearer "+accessToken);
//                            trackRideHeaderMap.put("X-APP-TOKEN", mSessionConfig.getxAppToken());
//                            service.trackRideDetails(trackRideHeaderMap, bookingId).enqueue(new Callback<TrackCabBookingResponse>() {
//                                @Override
//                                public void onResponse(Call<TrackCabBookingResponse> call, Response<TrackCabBookingResponse> response) {
//                                    if (response.isSuccessful()) {
//                                        Toast.makeText(MainActivity.this, response.body().getBookingStatus(), Toast.LENGTH_SHORT).show();
//                                        if (response.body().getBookingStatus().equals("COMPLETED")){
//                                            RideFeedbackParameters rideFeedbackParameters = new RideFeedbackParameters.Builder()
//                                                    .setRating(3)
//                                                    .setFeedback("Delayed pickup,Unprofessional behaviour,High pricing,Too many driver calls,Cab not clean")
//                                                    .setComments("Horrible ride!")
//                                                    .setBookingId(response.body().getBookingId()).build();
//                                            service.giveRideFeedback(trackRideHeaderMap, rideFeedbackParameters).enqueue(new Callback<RideFeedbackResponse>() {
//
//
//                                                @Override
//                                                public void onResponse(Call<RideFeedbackResponse> call, Response<RideFeedbackResponse> response) {
//                                                    if (response.isSuccessful()){
//                                                        Toast.makeText(MainActivity.this, response.body().getStatus(), Toast.LENGTH_SHORT).show();
//                                                    }
//                                                }
//
//                                                @Override
//                                                public void onFailure(Call<RideFeedbackResponse> call, Throwable t) {
//                                                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
//                                                }
//                                            });
//                                            return;
//                                        }
//                                        if (response.body().getBookingStatus().equals("IN_PROGRESS")){
//                                            final boolean[] sos = {false};
//                                            SOSParameter sOSParameter = new SOSParameter.Builder().setBookingId(response.body().getBookingId()).build();
//                                            service.sendSOSSignal(trackRideHeaderMap, sOSParameter).enqueue(new Callback<SOSResponse>() {
//                                                @Override
//                                                public void onResponse(Call<SOSResponse> call, Response<SOSResponse> response) {
//                                                    Toast.makeText(MainActivity.this, response.body().getMessage(), Toast.LENGTH_SHORT).show();
//                                                    sos[0] = true;
//                                                }
//
//                                                @Override
//                                                public void onFailure(Call<SOSResponse> call, Throwable t) {
//                                                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
//                                                }
//                                            });
//                                            if (sos[0]){
//                                                return;
//                                            }
//                                        }
//                                    }
//                                    call.clone().enqueue(this);
//                                }
//
//                                @Override
//                                public void onFailure(Call<TrackCabBookingResponse> call, Throwable t) {
//                                    Toast.makeText(MainActivity.this, "Failed", Toast.LENGTH_SHORT).show();
//                                }
//                            });
//                        }
//                    }
//
//                    @Override
//                    public void onFailure(Call<RideResponse> call, Throwable t) {
//                        Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
//                    }
//                });
            }
        });
    }
}
