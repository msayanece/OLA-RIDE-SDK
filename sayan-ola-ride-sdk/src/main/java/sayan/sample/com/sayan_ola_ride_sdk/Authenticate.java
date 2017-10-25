package sayan.sample.com.sayan_ola_ride_sdk;

import android.app.Activity;
import android.content.Intent;

import sayan.sample.com.sayan_ola_ride_sdk.activities.LoginActivity;
import sayan.sample.com.sayan_ola_ride_sdk.interfaces.AuthenticateCallback;


/**
 * Created by Admin on 20-10-2017.
 */

public class Authenticate {

    public static void authenticateUser(final Activity context, final SessionConfig config, final AccessTokenManager accessTokenManager, final
    AuthenticateCallback
            callback){
        new LoginActivity.Initializer().initializeVariables(config, accessTokenManager, callback);
        Intent intent = new Intent(context, LoginActivity.class);
        intent.putExtra("url", config.getoAuthUrl());
        context.startActivity(intent);
    }

    public interface LoginCommunication{
        public void initializeVariables(SessionConfig config, AccessTokenManager accessTokenManager, AuthenticateCallback callback);
    }
}
