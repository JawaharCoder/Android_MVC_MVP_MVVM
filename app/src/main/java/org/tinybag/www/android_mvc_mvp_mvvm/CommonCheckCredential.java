package org.tinybag.www.android_mvc_mvp_mvvm;

/**
 * Created by developer.chn3 on 4/12/2017.
 */

public class CommonCheckCredential {

    public static Boolean authenticateTheUser(ModelForMvcMvpMvvmUser modelForMvcMvpMvvmUser,String checkUsername, String checkPassword){

        if(modelForMvcMvpMvvmUser.getUsername().matches(checkUsername) && modelForMvcMvpMvvmUser.getPassword().matches(checkPassword)){
            modelForMvcMvpMvvmUser.setValidUser(true);
            return true;
        }

        return false;
    }
}
