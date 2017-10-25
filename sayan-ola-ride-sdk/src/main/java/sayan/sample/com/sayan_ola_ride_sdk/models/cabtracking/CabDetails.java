package sayan.sample.com.sayan_ola_ride_sdk.models.cabtracking;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Admin on 23-10-2017.
 */

public class CabDetails {

    @SerializedName("cab_type")
    @Expose
    private String cabType;
    @SerializedName("cab_number")
    @Expose
    private String cabNumber;
    @SerializedName("car_model")
    @Expose
    private String carModel;
    @SerializedName("car_color")
    @Expose
    private String carColor;

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

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
}
