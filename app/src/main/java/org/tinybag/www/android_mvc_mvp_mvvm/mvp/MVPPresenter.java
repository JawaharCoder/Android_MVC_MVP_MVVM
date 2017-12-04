package org.tinybag.www.android_mvc_mvp_mvvm.mvp;

import org.tinybag.www.android_mvc_mvp_mvvm.CommonCheckCredential;
import org.tinybag.www.android_mvc_mvp_mvvm.ModelForMvcMvpMvvmUser;

/**
 * Created by developer.chn3 on 4/12/2017.
 */

public class MVPPresenter implements  MVPreInterface {

    private MVPPreView mvpPreView;
    private ModelForMvcMvpMvvmUser modelForMvcMvpMvvmUser = new ModelForMvcMvpMvvmUser();

    @Override
    public boolean onAuthenticateUser() {
        if(CommonCheckCredential.authenticateTheUser(
                modelForMvcMvpMvvmUser,
                mvpPreView.getUserName(),mvpPreView.getUserPassword())){

            return true;

        }
        return false;
    }

    public ModelForMvcMvpMvvmUser getModelForMvcMvpMvvmUser() {
        return modelForMvcMvpMvvmUser;
    }

    @Override
    public void setView(MVPPreView mvpPreView) {
        this.mvpPreView = mvpPreView;
    }
}
