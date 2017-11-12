package sayan.sample.com.sayan_ola_ride_sdk;


import android.util.Log;

/**
 * Created by Admin on 20-10-2017.
 */

public class SessionConfig {

    private String xAppToken;
    private String oAuthUrl;
    private String environment;
    private String userName;
    private String password;
    private boolean hasUserCredential;

    public String getxAppToken() {
        return xAppToken;
    }

    public void setxAppToken(String xAppToken) {
        this.xAppToken = xAppToken;
    }

    public String getoAuthUrl() {
        return oAuthUrl;
    }

    public void setoAuthUrl(String oAuthUrl) {
        this.oAuthUrl = oAuthUrl;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean hasUserCredential() {
        return hasUserCredential;
    }

    public static class Builder{
        private String xAppToken;
        private String oAuthUrl;
        private String environment;
        private String userName;
        private String password;
        private boolean hasUserCredential;

        public Builder setEnvironment(String environment) {
            this.environment = environment;
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setxAppToken(String xAppToken) {
            this.xAppToken = xAppToken;
            return this;
        }

        public Builder setoAuthUrl(String oAuthUrl) {
            this.oAuthUrl = oAuthUrl;
            return this;
        }

        public SessionConfig build() {

            if (environment == null) {
                environment = Environment.PRODUCTION;
            }
            if (userName == null || password == null){
                hasUserCredential = false;
            }else {
                hasUserCredential = true;
            }
            return new SessionConfig(xAppToken, oAuthUrl,environment, userName, password, hasUserCredential);
        }
    }

    private SessionConfig(String xAppToken, String oAuthUrl, String environment, String userName, String password, boolean hasUserCredential) {
        this.xAppToken = xAppToken;
        this.oAuthUrl = oAuthUrl;
        this.environment = environment;
        this.userName = userName;
        this.password = password;
        this.hasUserCredential = hasUserCredential;
        Log.d(Constants.TAG, "xAppToken: " + xAppToken);
        Log.d(Constants.TAG, "oAuthUrl: " + oAuthUrl);
        Log.d(Constants.TAG, "environment: " + environment);
        Log.d(Constants.TAG, "userName: " + userName);
        Log.d(Constants.TAG, "password: " + password);
        Log.d(Constants.TAG, "hasUserCredential: " + hasUserCredential);
    }

    public static final class Environment {
        public static final String PRODUCTION = "https://devapi.olacabs.com";
        public static final String SANDBOX = "http://sandbox-t.olacabs.com";
    }
}
