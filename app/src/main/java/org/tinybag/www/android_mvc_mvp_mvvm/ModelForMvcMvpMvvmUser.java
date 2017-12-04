package org.tinybag.www.android_mvc_mvp_mvvm;

import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by developer.chn3 on 4/12/2017.
 */

public class ModelForMvcMvpMvvmUser implements Serializable {


    private String username = "";
    private String password = "";
    private String userFrom = "";
    private Boolean isValidUser = false;

    public String getUsername() {
        return "admin";
    }


    public String getPassword() {
        return "admin";
    }


    public Boolean isValidUser() {
        return isValidUser;
    }

    public void setValidUser(Boolean validUser) {
        isValidUser = validUser;
    }

    public String getUserFrom() {
        return userFrom;
    }

    public void setUserFrom(String userFrom) {
        this.userFrom = userFrom;
    }

    public Boolean getValidUser() {
        return isValidUser;
    }
}
