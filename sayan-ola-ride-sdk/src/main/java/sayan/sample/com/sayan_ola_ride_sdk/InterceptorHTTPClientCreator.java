package sayan.sample.com.sayan_ola_ride_sdk;

import android.content.Context;
import android.provider.Settings;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * Created by Admin on 08-11-2017.
 */

public class InterceptorHTTPClientCreator {

    private static OkHttpClient defaultHttpClient;
    public static void createInterceptorHTTPClient(final Context context){
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            defaultHttpClient = new OkHttpClient.Builder()
                    .addInterceptor(
                            new Interceptor() {
                                @Override
                                public Response intercept(Chain chain) throws IOException {
                                    Request request = chain.request().newBuilder()
                                            .addHeader("deviceId", Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID))
//                                            .addHeader("fcmId", FirebaseInstanceId.getInstance().getToken())
                                            .build();
                                    return chain.proceed(request);
                                }
                            })
                    .readTimeout(3, TimeUnit.MINUTES)
                    .addInterceptor(interceptor)
                    .build();
    }

    static OkHttpClient getOkHttpClient(){
        if (defaultHttpClient != null){
            return defaultHttpClient;
        }
        return null;
    }


    //Caching with retrofit
    //For testing purpose only. #R n D department (Do not use it on Production)
//        sharedPreferences = getSharedPreferences(getPackageName(), MODE_PRIVATE);
//        sharedPreferences.edit().clear().apply();
//        test();




//    //For testing purpose only. #R n D department (Do not use it on Production)
//    private void test() {
//        InterceptorHTTPClientCreator.createInterceptorHTTPClient(getApplicationContext());
//        Service service = new EgiyeMurshidabadApi.Builder().build(getApplicationContext()).getService();
//        service.getTestData(sharedPreferences.getString("tag", ""))
//                .enqueue(new Callback<TestResponse>() {
//            @Override
//            public void onResponse(final Call<TestResponse> call, Response<TestResponse> response) {
//                sharedPreferences.edit().putString("tag", response.headers().get("ETag")).apply();
//                if (response.code() == 304){
//                    Toast.makeText(SpashScreen.this, "Not Modified", Toast.LENGTH_SHORT).show();
//                }else {
//                    Toast.makeText(SpashScreen.this, "New Content", Toast.LENGTH_SHORT).show();
//                }
//                Handler handler = new Handler();
//                handler.postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//                        test();
//                    }
//                }, 5000);
//            }
//
//            @Override
//            public void onFailure(Call<TestResponse> call, Throwable t) {
//                t.getCause().getMessage();
//            }
//        });
//    }
}
