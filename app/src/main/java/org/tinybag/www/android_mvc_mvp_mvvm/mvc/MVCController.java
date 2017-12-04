package org.tinybag.www.android_mvc_mvp_mvvm.mvc;

import android.view.View;

import org.tinybag.www.android_mvc_mvp_mvvm.CommonCheckCredential;
import org.tinybag.www.android_mvc_mvp_mvvm.InterfaceAuthenticate;
import org.tinybag.www.android_mvc_mvp_mvvm.ModelForMvcMvpMvvmUser;

/**
 * Created by developer.chn3 on 4/12/2017.
 */

public class MVCController implements InterfaceAuthenticate {

    private ModelForMvcMvpMvvmUser modelForMvcMvpMvvmUser = new ModelForMvcMvpMvvmUser();



    @Override
    public Boolean authenticateTheUser(String Username, String Password) {
        if(CommonCheckCredential.authenticateTheUser(this.modelForMvcMvpMvvmUser,Username,Password)){
            return true;
        }
        return false;
    }

    public ModelForMvcMvpMvvmUser getModelForMvcMvpMvvmUser() {
        return modelForMvcMvpMvvmUser;
    }

    @Override
    public Boolean IsValidUser() {
        return modelForMvcMvpMvvmUser.isValidUser();
    }


}
